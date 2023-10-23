package service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.model2mbDAO;
import model.model2mbDTO;

public class MemberInsert implements Action{

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {

		System.out.println("MemberInsert");
		
		request.setCharacterEncoding("utf-8");
		
		model2mbDTO member = new model2mbDTO();
		member.setId(request.getParameter("id"));
		member.setPasswd(request.getParameter("passwd"));
		member.setName(request.getParameter("name"));
		member.setJumin1(request.getParameter("jumin1"));
		member.setJumin2(request.getParameter("jumin2"));
		member.setMailid(request.getParameter("mailid"));
		member.setDomain(request.getParameter("domain"));
		member.setPost(request.getParameter("post"));
		member.setAddress(request.getParameter("address"));
		member.setIntro(request.getParameter("intro"));
		
		// DB접속
		model2mbDAO dao = model2mbDAO.getinstace();
		int result = dao.insert(member);
		if(result == 1) {
			System.out.println("회원 가입 성공");
		}
		
		
		ActionForward forward = new ActionForward();
		forward.setRedirect(false);
		forward.setPath("./member/loginform.jsp");
		
		return forward;
	}
	
	
}
