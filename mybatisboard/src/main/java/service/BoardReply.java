package service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.BoardDAO;
import model.BoardBean;

public class BoardReply implements Action {

	@Override
	public ActionForward excute(HttpServletRequest request, HttpServletResponse response) throws Exception {

		System.out.println("BoardReply");

		// 한글 인코딩
		request.setCharacterEncoding("utf-8");

		// 넘어오는 값 받기
		// 1. hidden
		int board_num = Integer.parseInt(request.getParameter("board_num"));
		int board_re_ref = Integer.parseInt(request.getParameter("board_re_ref"));
		int board_re_lev = Integer.parseInt(request.getParameter("board_re_lev"));
		int board_re_seq = Integer.parseInt(request.getParameter("board_re_seq"));
		String page = request.getParameter("page");

		// update SQL문을 위한 값 저장
		BoardBean board = new BoardBean();
		board.setBoard_num(board_num);
		board.setBoard_re_ref(board_re_ref);	// update
		board.setBoard_re_seq(board_re_seq);	// update
		
		BoardDAO dao = BoardDAO.getInstance();
		dao.updateSeq(board);	// board_re_seq값 1증가
		
		// insert SQL문을 위한 값 저장
		board.setBoard_re_seq(board_re_seq + 1);	// insert
		board.setBoard_re_lev(board_re_lev + 1);	// insert
		board.setBoard_name(request.getParameter("board_name"));
		board.setBoard_pass(request.getParameter("board_pass"));
		board.setBoard_subject(request.getParameter("board_subject"));
		board.setBoard_content(request.getParameter("board_content"));


		// update와 insert SQL문을 따로 작성해야 하기 때문에 
		// 메소드를 따로 만들어서 실행해야 한다.
		int result = dao.boardReply(board);
		if (result == 1) {
			System.out.println("댓글 작성 성공");
		}

		ActionForward forward = new ActionForward();
		forward.setRedirect(true);
		forward.setPath("./BoardListAction.do?page=" + page);

		return forward;
	}

}
