package service;

import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.MemberDAO;
import model.MemberDTO;

public class Delete implements Action{

	@Override
	public ActionForward execute(HttpServletRequest request, 
			HttpServletResponse response) throws Exception {
		
		System.out.println("Delete");
		
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html; charset=utf-8");
		
		PrintWriter out = response.getWriter();
		
		// 회원 탈퇴가 성공하면 session을 삭제해야하기 때문에 session객체 구해오기
		HttpSession session = request.getSession();
		
		// 탈퇴할 id와 비밀번호 구해오기
		String id = request.getParameter("id");
		String passwd = request.getParameter("passwd");
		
		MemberDAO dao = MemberDAO.getInstance();
		
		// 1명의 상세정보 구하기
		MemberDTO db = dao.getMember(id);
		
		// 비밀번호 비교
		if(db.getPasswd().equals(passwd)) {
			int result = dao.delete(id);
			if(result == 1) System.out.println("회원 탈퇴 성공");
			
			// 세션 삭제
			session.invalidate();
			
		}else {
			out.println("<script>");
			out.println("alert('비밀번호가 다릅니다.')");
			out.println("history.go(-1)");
			out.println("</script>");
			out.close();
			
			// null로 리턴해야만 아래의 ActionForward객체가 실행되지 않는다.
			return null;
		}
		
		ActionForward forward = new ActionForward();
		forward.setRedirect(false);
		forward.setPath("./member/loginform.jsp");
		
		return forward;
	}
	
}
