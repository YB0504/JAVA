// DAO(Data Access Object)

package board;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.spi.DirStateFactory.Result;
import javax.sql.DataSource;

public class BoardDBBean {

	// 싱글톤 생성
	private static BoardDBBean instance = new BoardDBBean();

	// 공유를 위한 정적 메소드 생성
	public static BoardDBBean getInstance() {
		return instance;
	}

	// DBCP방식 커넥션 풀에서 커넥션 불러오기
	private Connection getConnect() throws Exception {
		Context init = new InitialContext();
		DataSource ds = (DataSource) init.lookup("java:comp/env/jdbc/orcl");

		// getConnection의 자료형인 Connection으로 return
		return ds.getConnection();
	}

	// 글 작성
	public int insert(BoardDataBean board) {
		int result = 0;

		Connection con = null;
		PreparedStatement pstmt = null;

		try {

			con = getConnect();

			String sql = "insert into board ";
			sql += " values(board_seq.nextval, ?, ?, ?, ?, sysdate, ?, ?, ?)";

			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, board.getWriter());
			pstmt.setString(2, board.getEmail());
			pstmt.setString(3, board.getSubject());
			pstmt.setString(4, board.getPasswd());
			// 조회수는 getReadcount메소드를 불러오면서 0으로 초기값이 자동 설정된다.
			// 0으로 직접 설정해주어도 된다.
			pstmt.setInt(5, board.getReadcount());
			pstmt.setString(6, board.getContent());
			pstmt.setString(7, board.getIp());
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

	// 총 데이터 갯수 구하기
	public int getCount() {
		int result = 0;

		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		try {

			con = getConnect();

			String sql = "select count(*) from board";

			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();

			// 그룹 함수는 데이터를 하나로 처리하기 때문에 if사용
			if (rs.next()) {
				result = rs.getInt("count(*)");
				// result = rs.getInt(1);
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

	// 게시판 목록 구하기 : 데이터 10개 추출
	// 2개 이상의 데이터를 가져오기 때문에 List사용
	// 제네릭을 사용하여 DTO클래스의 데이터만 사용하도록 설정
	public List<BoardDataBean> getList(int start, int end) {
		List<BoardDataBean> list = new ArrayList<BoardDataBean>();

		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		try {

			con = getConnect();

			// 서브쿼리 형태의 인라인뷰
			// 두 번째 서브쿼리에 별칭(board)를 부여하여
			// 첫 번째 서브쿼리에 별칭명.*로 작성하면 검색할 컬럼을 모두 작성하지 않아도 된다.
			// where 절에 start, endRow를 rownum으로 자른다.
			String sql = "select * from (select rownum rnum, board.* from ";
			sql += " (select * from board order by num desc) board) ";
			sql += " where rnum >= ? and rnum <= ?";

			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, start);
			pstmt.setInt(2, end);
			rs = pstmt.executeQuery();

			// 조건식을 만족하는 데이터 1개 씩 가져오기
			while (rs.next()) {
				// 제네릭의 자료형인 DTO객체를 생성하여 데이터를 가져온다.
				BoardDataBean board = new BoardDataBean();

				board.setNum(rs.getInt("num"));
				board.setWriter(rs.getString("writer"));
				board.setEmail(rs.getString("email"));
				board.setSubject(rs.getString("subject"));
				board.setPasswd(rs.getString("passwd"));
				board.setReg_date(rs.getTimestamp("reg_date"));
				board.setReadcount(rs.getInt("readcount"));
				board.setContent(rs.getString("content"));
				board.setIp(rs.getString("ip"));

				// 가져온 값을 list에 저장한다.
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

	// 상세 페이지 : 게시글의 조회수 1증가, 상세정보 구하기
	// 한 개의 데이터를 검색할 때는 자료형자리에 DTO클래스가 와야한다.
	public BoardDataBean updateContent(int num) {
		BoardDataBean board = new BoardDataBean();

		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		try {

			con = getConnect();

			// 기존 조회수를 1증가 시키는 update SQL문
			String sql = "update board set readcount = readcount + 1";
			sql += " where num = ?";

			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, num);
			// update SQL문 실행
			pstmt.executeUpdate();

			// 상세정보를 구하는 select SQL문
			sql = "select * from board where num = ?";

			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, num);
			// select SQL문 실행
			rs = pstmt.executeQuery();

			if (rs.next()) { // select SQL문의 조건을 만족하는 데이터 1개를 가져온다.

				board.setNum(rs.getInt("num"));
				board.setWriter(rs.getString("writer"));
				board.setEmail(rs.getString("email"));
				board.setSubject(rs.getString("subject"));
				board.setPasswd(rs.getString("passwd"));
				board.setReg_date(rs.getTimestamp("reg_date"));
				board.setReadcount(rs.getInt("readcount"));
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

	// 게시글 수정 폼 : 수정할 상세 정보 구하기
	public BoardDataBean getContent(int num) {
		BoardDataBean board = new BoardDataBean();

		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		try {

			con = getConnect();

			// 상세정보를 구하는 select SQL문
			String sql = "select * from board where num = ?";

			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, num);
			// select SQL문 실행
			rs = pstmt.executeQuery();

			if (rs.next()) { // select SQL문의 조건을 만족하는 데이터 1개를 가져온다.

				board.setNum(rs.getInt("num"));
				board.setWriter(rs.getString("writer"));
				board.setEmail(rs.getString("email"));
				board.setSubject(rs.getString("subject"));
				board.setPasswd(rs.getString("passwd"));
				board.setReg_date(rs.getTimestamp("reg_date"));
				board.setReadcount(rs.getInt("readcount"));
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

	// 게시글 수정
	public int update(BoardDataBean board) {
		int result = 0;

		Connection con = null;
		PreparedStatement pstmt = null;

		try {

			con = getConnect();

			String sql = "update board set writer = ?, email = ?, subject = ?, ";
			sql += " content = ? where num = ?";

			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, board.getWriter());
			pstmt.setString(2, board.getEmail());
			pstmt.setString(3, board.getSubject());
			pstmt.setString(4, board.getContent());
			pstmt.setInt(5, board.getNum());
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

	// 게시글 삭제
	public int delete(int num) {
		int result = 0;

		Connection con = null;
		PreparedStatement pstmt = null;

		try {

			con = getConnect();

			String sql = "delete from board where num = ?";

			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, num);
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
