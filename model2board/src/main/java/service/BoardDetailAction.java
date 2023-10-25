package service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.BoardDAO;
import model.BoardBean;

public class BoardDetailAction implements Action {

	@Override
	public ActionForward excute(HttpServletRequest request, HttpServletResponse response) throws Exception {

		System.out.println("BoardDetailAction");

		// get방식으로 넘어온 값 받기
		int board_num = Integer.parseInt(request.getParameter("board_num"));
		String page = request.getParameter("page");

		// 조회수 1 증가 + 게시글 상세 정보
		BoardDAO dao = BoardDAO.getInstance();
		dao.readcountUpdate(board_num); 			// 조회수 증가
		BoardBean board = dao.getDetail(board_num); // 게시글 상세 정보
		System.out.println("상세 정보 : " + board);

		// 글 내용 줄바꿈 기능 수행
		// <pre>태그로 감싸서 출력해도 된다.
		String content = board.getBoard_content().replace("\n", "<br>");

		// request로 공유 설정
		// DTO객체가 공유되면 공유되는 name값.필드명으로 출력한다.
		request.setAttribute("board", board);
		request.setAttribute("content", content);
		request.setAttribute("page", page);

		ActionForward forward = new ActionForward();
		forward.setRedirect(false);
		forward.setPath("./board/board_view.jsp");

		return forward;
	}

}
