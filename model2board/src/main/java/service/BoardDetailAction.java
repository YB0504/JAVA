package service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.BoardDAO;
import model.BoardBean;

public class BoardDetailAction implements Action{

	@Override
	public ActionForward excute(HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		
		System.out.println("BoardDetailAction");
		
		int board_num = Integer.parseInt(request.getParameter("board_num"));
		String page = request.getParameter("page");
		
		// 조회수 1 증가 + 게시글 상세 정보
		BoardDAO dao = BoardDAO.getInstance();
		dao.readcountUpdate(board_num);				// 조회수 증가
		BoardBean board = dao.getDetail(board_num);	// 게시글 상세 정보
		System.out.println("상세 정보 : " + board);
		
		ActionForward forward = new ActionForward();
		
		return forward;
	}

}
