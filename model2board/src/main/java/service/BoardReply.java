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

		// 2. hidden 값과 댓글 폼에서 입력한 값(sql실행에 필요한 값)
		// 값을 저장하기 위한 DTO객체 생성
		BoardBean board = new BoardBean();
		board.setBoard_num(board_num);
		board.setBoard_re_ref(board_re_ref);
		board.setBoard_re_lev(board_re_lev);
		board.setBoard_re_seq(board_re_seq);
		board.setBoard_name(request.getParameter("board_name"));
		board.setBoard_pass(request.getParameter("board_pass"));
		board.setBoard_subject(request.getParameter("board_subject"));
		board.setBoard_content(request.getParameter("board_content"));

		// DB연동
		BoardDAO dao = BoardDAO.getInstance();

		// insert한 갯수를 int형으로 리턴
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
