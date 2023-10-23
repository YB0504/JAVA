package service;

import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.model2mbDAO;

public class Login implements Action{

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {

		System.out.println("Login");
		
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html; charset=utf-8");
		
		PrintWriter out = response.getWriter();
		
		// session 객체 생성
		HttpSession session = request.getSession();
		
		String id = request.getParameter("id");
		String passwd = request.getParameter("passwd");
		
		model2mbDAO dao = model2mbDAO.getinstace();
		int result = dao.memberAuth(id, passwd);
		if(result == 1) {
			System.out.println("로그인 성공");
		}
		
		// 로그인 성공시 session으로 값 공유
		if(result == 1) {
			// session 값 공유 설정 session의 name값 , 공유할 값
			// main.jsp에서 값 사용
			session.setAttribute("id", id);
		}else {
			out.println("<script>");
			out.println("alert('입력 정보가 다릅니다.')");
			out.println("history.go(-1)");
			out.println("</script>");
			out.close();
			
			return null;
		}
		
		ActionForward forward = new ActionForward();
		forward.setRedirect(false);
		forward.setPath("./member/main.jsp");
		
		return forward;
	}

}
