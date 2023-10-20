package service;

import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.MemberDAO;
import model.MemberDTO;

// 부모 인터페이스를 상속받아 메소드 오버라이딩해서
// 통일성을 가질 수 있도록 한다.
public class MemberInsert implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request, 
			HttpServletResponse response) throws Exception {
		
		// 이 코드가 콘솔창에 출력되면 Service클래스까지 요청이 이동했다는 표시
		System.out.println("MemberInsert");
		
		// 한글 인코딩
		request.setCharacterEncoding("utf-8");
		
		// insert할 데이터를 getParameter로 값을 모두 받고, set으로 전달해줘야 한다.
		// 폼에서 입력한 값을 저장하기 위한 메모리 공간 생성을 위한 DTO 객체 생성
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
		
		
		// DAO객체 생성
		MemberDAO dao = MemberDAO.getInstance();
		int result = dao.insert(member);
		
		if(result == 1) {
			System.out.println("회원 가입 성공");
		}
		
		PrintWriter out = response.getWriter();
		
		// 회원 가입 성공 메시지 출력
		if(result == 1) {
			out.println("<script>");
			out.println("location.href='./member/result.jsp'");
			out.println("</script>");
			out.close();
		}
		
		// ActionForward 클래스로 리턴하기 위한 객체생성
		ActionForward forward = new ActionForward();
		
		// 포워딩 방식과 포워딩할 경로값 설정
		// dispatcher 방식 포워딩 request객체로 공유를 하지 않았기 때문에 true나 false모두 가능하다.
		/*
		 * forward.setRedirect(false); 
		 * forward.setPath("./member/loginform.jsp"); // 포워딩할 파일명
		 * 
		 * // execute 메소드를 호출한 ActionFoward클래스에 돌려준다. 
		 * return forward;
		 */
		return null;
	}

}
