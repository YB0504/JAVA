package service;

import java.io.File;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.BoardDAO;
import model.BoardBean;

public class BoardDelete implements Action {

	@Override
	public ActionForward excute(HttpServletRequest request, HttpServletResponse response) throws Exception {

		System.out.println("BoardDelete");

		response.setContentType("text/html; charset=utf-8");
		request.setCharacterEncoding("utf-8");

		int board_num = Integer.parseInt(request.getParameter("board_num"));
		String page = request.getParameter("page");

		// 사용자가 입력한 비밀번호
		String board_pass = request.getParameter("board_pass");

		// 첨부파일을 삭제할 때 쓰일 업로드된 path값 구해오기
		String path = request.getRealPath("boardupload");
		System.out.println("path : " + path);

		// 비밀번호 구해오기
		BoardDAO dao = BoardDAO.getInstance();
		BoardBean db = dao.getDetail(board_num);

		PrintWriter out = response.getWriter();

		// 비밀번호 비교
		if (db.getBoard_pass().equals(board_pass)) {
			int result = dao.delete(board_num);
			if (result == 1)
				System.out.println("글 삭제 성공");

			// 첨부파일이 있는 경우 파일 삭제
			if (db.getBoard_file() != null) {

				// 파일 경로값을 File객체에 저장
				File file = new File(path);
				file.mkdir(); // 실제 path값에 디렉토리를 생성해주는 메소드

				// boardupload 디렉토리의 모든 파일 구하기
				File[] f = file.listFiles();
				for (int i = 0; i < f.length; i++) {
					if (f[i].getName().equals(db.getBoard_file())) {
						f[i].delete();
					}
				}

			}

			// response객체를 활용한 성공 메시지 출력
			response.sendRedirect("./board/delete.jsp?page=" + page);

			return null;

		} else {

			out.println("<script>");
			out.println("alert('비밀번호가 다릅니다.')");
			out.println("history.go(-1)");
			out.println("</script>");
			out.close();

			return null;
		}

		/*
		 * ActionForward forward = new ActionForward(); 
		 * forward.setRedirect(false);
		 * forward.setPath("/BoardListAction.do?page=" + page);
		 * 
		 * return forward;
		 */
	}

}
