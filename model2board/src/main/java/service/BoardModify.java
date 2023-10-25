package service;

import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.BoardDAO;
import model.BoardBean;

public class BoardModify implements Action {

	@Override
	public ActionForward excute(HttpServletRequest request, HttpServletResponse response) throws Exception {

		System.out.println("BoardModify");

		// 한글 인코딩
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html; charset=utf-8");

		// hidden으로 넘어오는 값
		int board_num = Integer.parseInt(request.getParameter("board_num"));
		String page = request.getParameter("page");
		// 사용자가 입력한 비밀번호
		String board_pass = request.getParameter("board_pass");

		// 폼에서 입력한 값
		BoardBean board = new BoardBean();
		board.setBoard_num(board_num);
		board.setBoard_name(request.getParameter("board_name"));
		board.setBoard_subject(request.getParameter("board_subject"));
		board.setBoard_content(request.getParameter("board_content"));

		// 비밀번호 구해오기
		BoardDAO dao = BoardDAO.getInstance();
		BoardBean db = dao.getDetail(board_num);

		// 출력 스트림 객체 생성
		PrintWriter out = response.getWriter();

		// 비밀번호 비교
		if (db.getBoard_pass().equals(board_pass)) {
			int result = dao.update(board); // DTO객체에 저장된 데이터로 update
			if (result == 1)
				System.out.println("글 수정 성공");
			out.println("<script>");
			out.println("location.href='./board/update.jsp?page=" + page + "' ");
			out.println("</script>");
			out.close();

			return null;

		} else {
			out.println("<script>");
			out.println("alert('비밀번호가 다릅니다.')");
			out.println("history.go(-1)");
			out.println("</script>");
			out.close();

			return null;
		}

		// 메시지 박스로 수정 성공 메시지를 띄울때는 포워딩이 필요없다.
		/*
		 * ActionForward forward = new ActionForward(); 
		 * forward.setRedirect(true);
		 * forward.setPath("./BoardListAction.do?page=" + page);
		 */

		/* return forward; */
	}

}
