package reboard;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

public class BoardDBBean {

	// 싱글톤
	private static BoardDBBean instance = new BoardDBBean();

	public static BoardDBBean getInstance() {
		return instance;
	}

	// 커넥션 구해오기
	private Connection getConnection() throws Exception {
		Context init = new InitialContext();
		DataSource ds = (DataSource) init.lookup("java:comp/env/jdbc/orcl");
		return ds.getConnection();
	}

	// 원문 글 작성
	public int insert(BoardDataBean board) {
		int result = 0;

		Connection con = null;
		PreparedStatement pstmt = null;
		String sql = "";

		try {

			con = getConnection();

			// 댓글 관련 컬럼
			// ref 컬럼은 원문 작성시에 num컬럼 값과 같은 값이 들어간다.
			// ref_level, step은 추후에 0을 입력한다.
			sql = "insert into reboard values(reboard_seq.nextval,";
			sql += " ?, ?, ?, ?, sysdate, ?, reboard_seq.nextval, ?, ?, ?, ?)";

			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, board.getWriter());
			pstmt.setString(2, board.getEmail());
			pstmt.setString(3, board.getSubject());
			pstmt.setString(4, board.getPasswd());
			pstmt.setInt(5, 0); // readcount
			pstmt.setInt(6, 0); // re_step : 댓글의 출력순서
			pstmt.setInt(7, 0); // re_level : 댓글의 깊이
			pstmt.setString(8, board.getContent());
			pstmt.setString(9, board.getIp());
			result = pstmt.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (pstmt != null)
					pstmt.close();
				if (con != null)
					con.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		return result;
	}

	// 총 데이터 갯수
	public int getCount() {
		int result = 0;

		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		try {

			con = getConnection();

			String sql = "select count(*) from reboard";

			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();

			if (rs.next()) {
				// 구해진 총 데이터 갯수를 result변수에 저장
				result = rs.getInt("count(*)");
				/* result = rs.getInt(1); */
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (rs != null)
					rs.close();
				if (pstmt != null)
					pstmt.close();
				if (con != null)
					con.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		return result;
	}

	// 게시판 목록 10개 추출
	public List<BoardDataBean> getList(int start, int end) {
		List<BoardDataBean> list = new ArrayList<BoardDataBean>();

		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = "";

		try {

			con = getConnection();

			// 일반 게시판과 달리 정렬을 ref컬럼 값으로 내림차순 정렬한다.
			// 원문 글과 댓글의 ref값이 동일하기 때문에 re_step컬럼으로 오름차순 정렬을 한번 더 한다.
			sql = "select * from (select rownum rnum, board.* from ";
			sql += " (select * from reboard order by ref desc, re_step asc) board)";
			sql += " where rnum >= ? and rnum <= ?";

			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, start);
			pstmt.setInt(2, end);
			rs = pstmt.executeQuery();

			while (rs.next()) {
				// 가져온 값을 저장하기 위한 DTO객체 생성
				BoardDataBean board = new BoardDataBean();

				board.setNum(rs.getInt("num"));
				board.setWriter(rs.getString("writer"));
				board.setEmail(rs.getString("email"));
				board.setSubject(rs.getString("subject"));
				board.setPasswd(rs.getString("passwd"));
				board.setReg_date(rs.getTimestamp("reg_date"));
				board.setReadcount(rs.getInt("readcount"));
				board.setRef(rs.getInt("ref"));
				board.setRe_level(rs.getInt("re_level"));
				board.setRe_step(rs.getInt("re_step"));
				board.setContent(rs.getString("content"));
				board.setIp(rs.getString("ip"));

				list.add(board);
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (rs != null)
					rs.close();
				if (pstmt != null)
					pstmt.close();
				if (con != null)
					con.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		return list;
	}

	// 조회수 증가 + 상세 정보
	// 하나의 상세 정보를 가져오기 때문에 DTO자료형
	public BoardDataBean updateContent(int num) {
		BoardDataBean board = new BoardDataBean();

		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = "";

		try {

			con = getConnection();

			// 조회수 증가 update SQL문
			sql = "update reboard set readcount = readcount + 1";
			sql += " where num = ?";

			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, num);
			pstmt.executeUpdate();

			sql = "select * from reboard where num = ?";

			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, num);
			rs = pstmt.executeQuery();

			if (rs.next()) {

				board.setNum(rs.getInt("num"));
				board.setWriter(rs.getString("writer"));
				board.setEmail(rs.getString("email"));
				board.setSubject(rs.getString("subject"));
				board.setPasswd(rs.getString("passwd"));
				board.setReg_date(rs.getTimestamp("reg_date"));
				board.setReadcount(rs.getInt("readcount"));
				board.setRef(rs.getInt("ref"));
				board.setRe_level(rs.getInt("re_level"));
				board.setRe_step(rs.getInt("re_step"));
				board.setContent(rs.getString("content"));
				board.setIp(rs.getString("ip"));

			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (rs != null)
					rs.close();
				if (pstmt != null)
					pstmt.close();
				if (con != null)
					con.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		return board;
	}

	// 댓글 작성
	// update, insert SQL문을 작성해야 한다.
	public int reply(BoardDataBean board) {
		int result = 0;
		
		// 부모글에 대한 정보
		int ref = board.getRef();
		int re_step = board.getRe_step();
		int re_level = board.getRe_level();

		Connection con = null;
		PreparedStatement pstmt = null;
		String sql = "";
		
		try {

			con = getConnection();
			
			// update SQL 문
			sql = "update reboard set re_step = re_step + 1 ";
			sql += " where ref = ? and re_step > ?";
			
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, ref);		// 부모의 ref 값
			pstmt.setInt(2, re_step);	// 부모의 re_step 값
			pstmt.executeUpdate();
			
			// insert SQL문
			sql = "insert into reboard values(reboard_seq.nextval,";
			sql += " ?, ?, ?, ?, sysdate, ?, ?, ?, ?, ?, ?)";
			
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, board.getWriter());
			pstmt.setString(2, board.getEmail());
			pstmt.setString(3, board.getSubject());
			pstmt.setString(4, board.getPasswd());
			pstmt.setInt(5, board.getReadcount());
			pstmt.setInt(6, ref);				// 부모의 ref 
			pstmt.setInt(7, re_step + 1);		// 부모의 re_step
			pstmt.setInt(8, re_level + 1);		// 부모의 re_level
			pstmt.setString(9, board.getContent());
			pstmt.setString(10, board.getIp());
			result = pstmt.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (pstmt != null)
					pstmt.close();
				if (con != null)
					con.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		return result;
	}

}






