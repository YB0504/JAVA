package Model1EX;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

public class DAOEX {

	private static DAOEX instance = new DAOEX();

	public static DAOEX getinstance() {
		return instance;
	}

	private Connection getConnection() throws Exception {
		Context init = new InitialContext();
		DataSource ds = (DataSource) init.lookup("java:comp/env/jdbc/orcl");
		return ds.getConnection();
	}

	// 원문 게시글 작성
	public int insert(DTOEX board) {
		int result = 0;

		Connection con = null;
		PreparedStatement pstmt = null;

		try {

			con = getConnection();

			String sql = "insert into boardex values(boardex_seq.nextval, ";
			sql += "?, ?, ?, ?, ?, ?, sysdate, ?, boardex_seq.nextval, ?, ?)";

			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, board.getWriter());
			pstmt.setString(2, board.getSubject());
			pstmt.setString(3, board.getEmail());
			pstmt.setString(4, board.getContent());
			pstmt.setString(5, board.getPasswd());
			pstmt.setString(6, board.getIp());
			pstmt.setInt(7, 0);
			pstmt.setInt(8, 0);
			pstmt.setInt(9, 0);
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

	// 총 데이터 개수
	public int getCount() {
		int result = 0;

		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = "";

		try {

			con = getConnection();

			sql = "select count(*) from boardex";

			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();

			if (rs.next()) {
				// result변수에 count함수를 돌려준다.
				result = rs.getInt("count(*)");
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

	// 데이터 목록 추출
	public List<DTOEX> getList(int start, int end) {
		List<DTOEX> list = new ArrayList<DTOEX>();

		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = "";

		try {

			con = getConnection();

			// 답글이 달리는 게시판은 num값이 아닌 ref값을 기준으로 내림차순하고
			// ref값은 원문 게시글과 답글이 동일하기 때문에 re_step값으로 한번 더 정렬한다.
			sql = "select * from (select rownum rnum, board.* from ";
			sql += " (select * from boardex order by ref desc, re_step asc) board) ";
			sql += " where rnum >= ? and rnum <= ?";

			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, start);
			pstmt.setInt(2, end);
			rs = pstmt.executeQuery();

			while (rs.next()) {
				// 제네릭으로 설정된 DTO객체를 생성하여 저장된 값을 하나씩 가져온다.
				DTOEX board = new DTOEX();

				board.setNum(rs.getInt("num"));
				board.setWriter(rs.getString("writer"));
				board.setSubject(rs.getString("subject"));
				board.setEmail(rs.getString("email"));
				board.setContent(rs.getString("content"));
				board.setPasswd(rs.getString("passwd"));
				board.setIp(rs.getString("ip"));
				board.setReg_date(rs.getTimestamp("reg_date"));
				board.setReadcount(rs.getInt("readcount"));
				board.setRef(rs.getInt("ref"));
				board.setRe_level(rs.getInt("re_level"));
				board.setRe_step(rs.getInt("re_step"));

				// 가져온 값을 add메소드로 저장
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

	// 조회수 증가 + 게시글 내용
	public DTOEX updateContent(int num) {
		DTOEX board = new DTOEX();

		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = "";

		try {

			con = getConnection();

			// 조회수 증가 SQL
			sql = "update boardex set readcount = readcount + 1";
			sql += " where num = ?";

			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, num);
			pstmt.executeUpdate();

			sql = "select * from boardex where num = ?";
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, num);
			rs = pstmt.executeQuery();

			if (rs.next()) {

				board.setNum(rs.getInt("num"));
				board.setWriter(rs.getString("writer"));
				board.setSubject(rs.getString("subject"));
				board.setEmail(rs.getString("email"));
				board.setContent(rs.getString("content"));
				board.setPasswd(rs.getString("passwd"));
				board.setIp(rs.getString("ip"));
				board.setReg_date(rs.getTimestamp("reg_date"));
				board.setReadcount(rs.getInt("readcount"));
				board.setRef(rs.getInt("ref"));
				board.setRe_level(rs.getInt("re_level"));
				board.setRe_step(rs.getInt("re_step"));

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

	// 답글 작성
	// update, insert
	public int reply(DTOEX board) {
		int result = 0;

		// 부모글 정보 가져오기
		int ref = board.getRef();
		int re_level = board.getRe_level();
		int re_step = board.getRe_step();

		Connection con = null;
		PreparedStatement pstmt = null;
		String sql = "";

		try {

			con = getConnection();

			sql = "update boardex set re_step = re_step + 1 ";
			sql += " where ref = ? and re_step > ?";

			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, ref);
			pstmt.setInt(2, re_step);
			pstmt.executeUpdate();

			// 원문 글 작성과 다르게 ref값이 시퀀스로 늘어나지 않는다.
			sql = "insert into boardex values(boardex_seq.nextval, ";
			sql += "?, ?, ?, ?, ?, ?, sysdate, ?, ?, ?, ?)";

			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, board.getWriter());
			pstmt.setString(2, board.getSubject());
			pstmt.setString(3, board.getEmail());
			pstmt.setString(4, board.getContent());
			pstmt.setString(5, board.getPasswd());
			pstmt.setString(6, board.getIp());
			pstmt.setInt(7, board.getReadcount());
			pstmt.setInt(8, ref); // 부모 글의 ref
			pstmt.setInt(9, re_level + 1); // 부모 글의 re_level
			pstmt.setInt(10, re_step + 1); // 부모 글의 re_step
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

	// 게시글 수정 폼 내용 불러오기
	public DTOEX getContent(int num) {
		DTOEX board = new DTOEX();

		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = "";

		try {

			con = getConnection();

			sql = "select * from boardex where num = ?";

			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, num);
			rs = pstmt.executeQuery();

			if (rs.next()) {

				board.setNum(rs.getInt("num"));
				board.setWriter(rs.getString("writer"));
				board.setSubject(rs.getString("subject"));
				board.setEmail(rs.getString("email"));
				board.setContent(rs.getString("content"));
				board.setPasswd(rs.getString("passwd"));
				board.setIp(rs.getString("ip"));
				board.setReg_date(rs.getTimestamp("reg_date"));
				board.setReadcount(rs.getInt("readcount"));
				board.setRef(rs.getInt("ref"));
				board.setRe_level(rs.getInt("re_level"));
				board.setRe_step(rs.getInt("re_step"));

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

	// 글 수정
	public int update(DTOEX board) {
		int result = 0;

		Connection con = null;
		PreparedStatement pstmt = null;
		String sql = "";

		try {

			con = getConnection();

			sql = "update boardex set writer = ?, subject = ?, ";
			sql += " email = ?, content = ? where num = ?";

			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, board.getWriter());
			pstmt.setString(2, board.getSubject());
			pstmt.setString(3, board.getEmail());
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

	// 글삭제
	// 원문 글 삭제시 관리자에 의해 삭제되었다는 문장을 남기고
	// 답글 삭제시 글 삭제
	// update, delete
	public int delete(DTOEX board) {
		int result = 0;

		Connection con = null;
		PreparedStatement pstmt = null;
		String sql = "";

		try {

			con = getConnection();

			if (board.getRe_level() == 0) {	// 답글의 깊이가 0 = 원문 글
				sql = "update boardex set subject = ?, content = ? where num = ?";

				pstmt = con.prepareStatement(sql);
				pstmt.setString(1, "삭제됨");
				pstmt.setString(2, " ");
				pstmt.setInt(3, board.getNum());

			} else {	// 답글
				sql = "delete from boardex where num = ?";

				pstmt = con.prepareStatement(sql);
				pstmt.setInt(1, board.getNum());
			}
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
