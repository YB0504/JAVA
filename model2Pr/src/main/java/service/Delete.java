package service;

import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.model2mbDAO;
import model.model2mbDTO;

public class Delete implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {

		System.out.println("Delete");
		
		// 한글값 인코딩
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html; charset=utf-8");

		// 회원 탈퇴 성공시 세션을 삭제해야 하기에 session객체 생성
		HttpSession session = request.getSession();

		// 탈퇴할 ID,비밀번호 구해오기
		String id = request.getParameter("id");
		String passwd = request.getParameter("passwd");

		// delete메소드 실행을 위한 DAO접속
		model2mbDAO dao = model2mbDAO.getinstace();

		// 회원 1명의 회원정보 구하기
		model2mbDTO db = dao.getMember(id);

		PrintWriter out = response.getWriter();

		if (db.getPasswd().equals(passwd)) {
			int result = dao.delete(id);
			if(result == 1)
				System.out.println("회원 탈퇴 성공");
				
				session.invalidate();
			
		}else {
			out.println("<script>");
			out.println("alert('비밀번호가 다릅니다.')");
			out.println("history.go(-1)");
			out.println("</script>");
			out.close();
			
			return null;
		}

		ActionForward forward = new ActionForward();
		forward.setRedirect(false);
		forward.setPath("./member/loginform.jsp");

		return forward;
	}

}
