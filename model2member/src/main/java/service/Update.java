package service;

import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.MemberDAO;
import model.MemberDTO;

public class Update implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request, 
			HttpServletResponse response) throws Exception {

		System.out.println("Update");
		
		// 넘어오는 한글값에 대한 인코딩
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html; charset=utf-8");
		
		// out객체 생성
		PrintWriter out = response.getWriter();
		
		// 넘어오는 값을 받을 DTO객체 생성
		MemberDTO member = new MemberDTO();
		member.setId(request.getParameter("id"));
		member.setPasswd(request.getParameter("passwd"));
		member.setName(request.getParameter("name"));
		member.setJumin1(request.getParameter("jumin1"));
		member.setJumin2(request.getParameter("jumin2"));
		member.setMailid(request.getParameter("mailid"));
		member.setDomain(request.getParameter("domain"));
		member.setTel1(request.getParameter("tel1"));
		member.setTel2(request.getParameter("tel2"));
		member.setTel3(request.getParameter("tel3"));
		member.setPhone1(request.getParameter("phone1"));
		member.setPhone2(request.getParameter("phone2"));
		member.setPhone3(request.getParameter("phone3"));
		member.setPost(request.getParameter("post"));
		member.setAddress(request.getParameter("address"));
		member.setGender(request.getParameter("gender"));
		
		// 다중 선택된 checkbox
		String[] hobby = request.getParameterValues("hobby");
		String h = "";
		for(String h1 : hobby) {
			h += h1 + "-";
		}
		member.setHobby(h);
		member.setIntro(request.getParameter("intro"));
		
		// 비밀번호 비교
		MemberDAO dao = MemberDAO.getInstance();
		
		// 상세 정보 구해오기
		MemberDTO db = dao.getMember(member.getId());
		if(db.getPasswd().equals(member.getPasswd())) {
			int result = dao.update(member);
			if(result == 1)System.out.println("회원정보 수정 성공");
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
		forward.setPath("./member/main.jsp");
		
		return forward;
	}

}
