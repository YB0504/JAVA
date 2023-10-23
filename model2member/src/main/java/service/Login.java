package service;

import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.MemberDAO;

public class Login implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request, 
			HttpServletResponse response) throws Exception {
		System.out.println("Login");
		
		// 현재 페이지 인코딩
		response.setContentType("text/html; charset=utf-8");
		// 받은 값 인코딩
		request.setCharacterEncoding("utf-8");
		
		// 출력 스트림 객체 생성
		PrintWriter out = response.getWriter();
		
		// session 객체 생성
		// session은 내장 객체가 아니기 떄문에 만들어야 한다.
		HttpSession session = request.getSession();
		
		String id = request.getParameter("id");
		String passwd = request.getParameter("passwd");
		
		// 회원 인증 (id와 pw 일치 확인)
		MemberDAO dao = MemberDAO.getInstance();
		int result = dao.memberAuth(id, passwd);
		
		if(result == 1) {
			System.out.println("회원 인증 성공");
		}
		
		if(result == 1) {	// 회원인증 성공시 session설정
			// session 공유 영역 시작
			session.setAttribute("id", id); // 공유 설정
		}else {				// 회원인증 실패
			out.println("<script>");
			out.println("alert('로그인 실패')");
			out.println("history.go(-1)");
			out.println("</script>");
			out.close();
			
			// 이 코드가 없으면 아래쪽의 내용이 실행된다.
			// null 값으로 리턴해야 if함수를 빠져 나간다.
			return null;
		}
		
		// 포워딩 시켜줄 액션 포워드 객체 생성
		ActionForward forward = new ActionForward();
		
		// 포워딩 방식과 경로값 설정
		forward.setRedirect(false); // session영역 공유는 모든 방식 가능
		forward.setPath("./member/main.jsp");
		
		return forward;
	}

}
