package dao;

import java.io.IOException;
import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import model.BoardBean;

public class BoardDAO {

	private static BoardDAO instance = new BoardDAO();

	public static BoardDAO getInstance() {
		return instance;
	}

	// SqlSession : SQL문을 실행시키는 메소드를 제공하는 인터페이스
	private SqlSession getSession() {

		SqlSession session = null;
		Reader reader = null;
		try {

			// 환경설정 파일을 읽어오면서 DB에 접속한다.(절대 경로)
			reader = Resources.getResourceAsReader("mybatis-config.xml");
			SqlSessionFactory sf = new SqlSessionFactoryBuilder().build(reader);
			session = sf.openSession(true); // auto commit
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
		return session;
	}

	// 원문 글 작성
	public int insert(BoardBean board) throws Exception {
		int result = 0;

		SqlSession session = getSession();

		result = session.insert("insertBoard", board);

		return result;
	}
//
//	// 총 데이터 갯수 구하기
//	public int getCount() {
//		int result = 0;
//
//		Connection con = null;
//		PreparedStatement pstmt = null;
//		ResultSet rs = null;
//		String sql = "";
//
//		try {
//
//			con = getConnection();
//
//			sql = "select count(*) from model2board";
//
//			pstmt = con.prepareStatement(sql);
//			rs = pstmt.executeQuery();
//
//			if (rs.next()) {
//				// 구해온 그룹함수 갯수를 result변수에 저장
//				result = rs.getInt("count(*)");
//			}
//
//		} catch (Exception e) {
//			e.printStackTrace();
//		} finally {
//			try {
//				if (rs != null)
//					rs.close();
//				if (pstmt != null)
//					pstmt.close();
//				if (con != null)
//					con.close();
//			} catch (Exception e) {
//				e.printStackTrace();
//			}
//		}
//
//		return result;
//	}
//
//	// 게시판 글 목록 10개 구하기
//	public List<BoardBean> getList(int start, int end) {
//		List<BoardBean> list = new ArrayList<BoardBean>();
//
//		Connection con = null;
//		PreparedStatement pstmt = null;
//		ResultSet rs = null;
//		String sql = "";
//
//		try {
//
//			con = getConnection();
//
//			// 댓글이 달리는 게시판은 ref값 과 re_seq값으로 두번 정렬한다.
//			sql = "select * from (select rownum rnum, board.* from ";
//			sql += " (select * from model2board order by board_re_ref desc, ";
//			sql += " board_re_seq asc) board ) ";
//			sql += "where rnum >= ? and rnum <= ?";
//
//			pstmt = con.prepareStatement(sql);
//			pstmt.setInt(1, start);
//			pstmt.setInt(2, end);
//			rs = pstmt.executeQuery();
//
//			while (rs.next()) {
//
//				// DTO객채 생성하여 set메소드로 값을 메모리 상에 저장
//				BoardBean board = new BoardBean();
//				board.setBoard_num(rs.getInt("board_num"));
//				board.setBoard_name(rs.getString("board_name"));
//				board.setBoard_pass(rs.getString("board_pass"));
//				board.setBoard_subject(rs.getString("board_subject"));
//				board.setBoard_content(rs.getString("board_content"));
//				board.setBoard_file(rs.getString("board_file"));
//				board.setBoard_re_ref(rs.getInt("board_re_ref"));
//				board.setBoard_re_lev(rs.getInt("board_re_lev"));
//				board.setBoard_re_seq(rs.getInt("board_re_seq"));
//				board.setBoard_readcount(rs.getInt("board_readcount"));
//				board.setBoard_date(rs.getTimestamp("board_date"));
//
//				// DTO객쳉에 저장된 값을 list배열에 저장
//				list.add(board);
//			}
//
//		} catch (Exception e) {
//			e.printStackTrace();
//		} finally {
//			try {
//				if (rs != null)
//					rs.close();
//				if (pstmt != null)
//					pstmt.close();
//				if (con != null)
//					con.close();
//			} catch (Exception e) {
//				e.printStackTrace();
//			}
//		}
//
//		return list;
//	}
//
//	// 조회수 증가
//	public void readcountUpdate(int board_num) {
//
//		Connection con = null;
//		PreparedStatement pstmt = null;
//		String sql = "";
//
//		try {
//
//			con = getConnection();
//
//			sql = "update model2board set board_readcount = board_readcount + 1";
//			sql += " where board_num = ?";
//
//			pstmt = con.prepareStatement(sql);
//			pstmt.setInt(1, board_num);
//			pstmt.executeUpdate();
//
//		} catch (Exception e) {
//			e.printStackTrace();
//		} finally {
//			try {
//				if (pstmt != null)
//					pstmt.close();
//				if (con != null)
//					con.close();
//			} catch (Exception e) {
//				e.printStackTrace();
//			}
//		}
//
//	}
//
//	// 상세 페이지
//	public BoardBean getDetail(int board_num) {
//		BoardBean board = new BoardBean();
//
//		Connection con = null;
//		PreparedStatement pstmt = null;
//		ResultSet rs = null;
//		String sql = "";
//
//		try {
//
//			con = getConnection();
//
//			sql = "select * from model2board where board_num = ?";
//
//			pstmt = con.prepareStatement(sql);
//			pstmt.setInt(1, board_num);
//			rs = pstmt.executeQuery();
//
//			if (rs.next()) {
//
//				board.setBoard_num(rs.getInt("board_num"));
//				board.setBoard_name(rs.getString("board_name"));
//				board.setBoard_pass(rs.getString("board_pass"));
//				board.setBoard_subject(rs.getString("board_subject"));
//				board.setBoard_content(rs.getString("board_content"));
//				board.setBoard_file(rs.getString("board_file"));
//				board.setBoard_re_ref(rs.getInt("board_re_ref"));
//				board.setBoard_re_lev(rs.getInt("board_re_lev"));
//				board.setBoard_re_seq(rs.getInt("board_re_seq"));
//				board.setBoard_readcount(rs.getInt("board_readcount"));
//				board.setBoard_date(rs.getTimestamp("board_date"));
//
//			}
//
//		} catch (Exception e) {
//			e.printStackTrace();
//		} finally {
//			try {
//				if (rs != null)
//					rs.close();
//				if (pstmt != null)
//					pstmt.close();
//				if (con != null)
//					con.close();
//			} catch (Exception e) {
//				e.printStackTrace();
//			}
//		}
//
//		return board;
//	}
//
//	// 댓글 작성
//	// update, insert 실행
//	public int boardReply(BoardBean board) {
//		int result = 0;
//
//		Connection con = null;
//		PreparedStatement pstmt = null;
//		String sql = "";
//
//		// 부모글의 정보 구해오기
//		int re_ref = board.getBoard_re_ref(); // 글 그룹 번호
//		int re_lev = board.getBoard_re_lev(); // 댓글의 깊이
//		int re_seq = board.getBoard_re_seq(); // 댓글 출력 순서
//
//		try {
//
//			con = getConnection();
//
//			// 1. 원문이 부모인 경우
//			// : 원문의 board_re_seq=0 이기 떄문에, 모든 댓글들의 board_re_seq값이 1씩 증가한다.
//
//			// 2. 댓글이 부모인 경우
//			// : 부모의 board_re_seq보다 큰 댓글만 board_re_seq값이 1씩 증가한다.
//
//			sql = "update model2board set board_re_seq = board_re_seq + 1 ";
//			sql += " where board_re_ref = ? and board_re_seq > ?";
//
//			pstmt = con.prepareStatement(sql);
//			pstmt.setInt(1, re_ref); // 부모글의 ref
//			pstmt.setInt(2, re_seq); // 부모글의 seq
//			pstmt.executeUpdate();
//
//			sql = "insert into model2board values(model2board_seq.nextval, ";
//			sql += "?, ?, ?, ?, ?, ?, ?, ?, ?, sysdate)";
//
//			pstmt = con.prepareStatement(sql);
//			pstmt.setString(1, board.getBoard_name());
//			pstmt.setString(2, board.getBoard_pass());
//			pstmt.setString(3, board.getBoard_subject());
//			pstmt.setString(4, board.getBoard_content());
//			pstmt.setString(5, ""); // 첨부파일은 사용하지 않기 때문에 null
//			pstmt.setInt(6, re_ref); // 부모의 ref
//			pstmt.setInt(7, re_lev + 1); // 부모의 lev
//			pstmt.setInt(8, re_seq + 1); // 부모의 seq
//			pstmt.setInt(9, 0);
//			result = pstmt.executeUpdate();
//
//		} catch (Exception e) {
//			e.printStackTrace();
//		} finally {
//			try {
//				if (pstmt != null)
//					pstmt.close();
//				if (con != null)
//					con.close();
//			} catch (Exception e) {
//				e.printStackTrace();
//			}
//		}
//
//		return result;
//	}
//
//	// 게시글 수정
//	public int update(BoardBean board) {
//		int result = 0;
//
//		Connection con = null;
//		PreparedStatement pstmt = null;
//		String sql = "";
//
//		try {
//
//			con = getConnection();
//
//			sql = "update model2board set board_name = ?, board_subject = ?,";
//			sql += " board_content = ? where board_num = ?";
//
//			pstmt = con.prepareStatement(sql);
//			pstmt.setString(1, board.getBoard_name());
//			pstmt.setString(2, board.getBoard_subject());
//			pstmt.setString(3, board.getBoard_content());
//			pstmt.setInt(4, board.getBoard_num());
//			result = pstmt.executeUpdate();
//
//		} catch (Exception e) {
//			e.printStackTrace();
//		} finally {
//			try {
//				if (pstmt != null)
//					pstmt.close();
//				if (con != null)
//					con.close();
//			} catch (Exception e) {
//				e.printStackTrace();
//			}
//		}
//
//		return result;
//	}
//
//	// 게시글 삭제
//	public int delete(int board_num) {
//		int result = 0;
//
//		Connection con = null;
//		PreparedStatement pstmt = null;
//		String sql = "";
//
//		try {
//
//			con = getConnection();
//
//			sql = "delete from model2board where board_num = ?";
//
//			pstmt = con.prepareStatement(sql);
//			pstmt.setInt(1, board_num);
//			result = pstmt.executeUpdate();
//
//		} catch (Exception e) {
//			e.printStackTrace();
//		} finally {
//			try {
//				if (pstmt != null)
//					pstmt.close();
//				if (con != null)
//					con.close();
//			} catch (Exception e) {
//				e.printStackTrace();
//			}
//		}
//
//		return result;
//	}

}
