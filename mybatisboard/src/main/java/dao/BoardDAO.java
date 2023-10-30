package dao;

import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

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

	// 총 데이터 갯수 구하기
	public int getCount() throws Exception {
		int result = 0;

		SqlSession session = getSession();
		// 다운 캐스팅 생략 가능
		result = (Integer) session.selectOne("count");

		return result;
	}

	// 게시판 글 목록 10개 구하기
	// page값 전달 방식
//	public List<BoardBean> getList(int page) throws Exception {
//		List<BoardBean> list = new ArrayList<BoardBean>();
//		
//		SqlSession session = getSession();
//		list = session.selectList("list", page);
//
//		return list;
//	}

	// Map을 이용한 값 전달 방식
	public List<BoardBean> getList(Map map) throws Exception {
		List<BoardBean> list = new ArrayList<BoardBean>();

		SqlSession session = getSession();
		list = session.selectList("list", map);

		return list;
	}

	// 조회수 증가
	public void readcountUpdate(int board_num) throws Exception {

		SqlSession session = getSession();
		session.update("updatecount", board_num);

	}

	// 상세 페이지
	public BoardBean getDetail(int board_num) throws Exception {
		BoardBean board = new BoardBean();

		SqlSession session = getSession();
		// 다운 캐스팅 생략
//		board = (BoardBean)session.selectOne("content", board_num);
		board = session.selectOne("content", board_num);

		return board;
	}

	// 댓글 출력 순서 : board_re_seq 값 증가
	public void updateSeq(BoardBean board) throws Exception {

		SqlSession session = getSession();
		session.update("updateseq", board);

	}

	// 댓글 작성
	public int boardReply(BoardBean board) throws Exception {
		int result = 0;

		SqlSession session = getSession();
		result = session.insert("replyinsert", board);

		return result;
	}

	// 게시글 수정
	public int update(BoardBean board) throws Exception {
		int result = 0;

		SqlSession session = getSession();
		result = session.update("update", board);

		return result;
	}

	// 게시글 삭제
	public int delete(int board_num) {
		int result = 0;

		SqlSession session = getSession();
		result = session.delete("delete", board_num);

		return result;
	}

}
