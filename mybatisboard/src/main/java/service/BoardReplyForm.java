package service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.BoardDAO;
import model.BoardBean;

public class BoardReplyForm implements Action {

	@Override
	public ActionForward excute(HttpServletRequest request, HttpServletResponse response) throws Exception {

		System.out.println("BoardReplyForm");

		// 넘어오는 값 받기
		int board_num = Integer.parseInt(request.getParameter("board_num"));
		String page = request.getParameter("page");

		BoardDAO dao = BoardDAO.getInstance();

		// 부모 글의 상세정보 구하기
		BoardBean board = dao.getDetail(board_num);

		// 공유 설정
		request.setAttribute("board", board);
		request.setAttribute("page", page);

		ActionForward forward = new ActionForward();
		forward.setRedirect(false);
		forward.setPath("./board/board_reply.jsp");

		return forward;
	}

}
