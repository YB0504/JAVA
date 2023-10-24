package service;

import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.model2mbDAO;
import model.model2mbDTO;

public class Update implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {

		System.out.println("Update");

		// 한글값 인코딩
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html; charset=utf-8");

		// 정보 수정 후 넘어오는 값 저장할 DTO객체 생성
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

		// 비밀번호 비교
		// DB에 저장된 값과 입력된 값을 비교
		model2mbDAO dao = model2mbDAO.getinstace();

		// DB에 저장된 회원 상세정보 가져오기
		model2mbDTO db = dao.getMember(member.getId());

		// 비밀번호가 다를시 알림을 출력하기 위한 출력스트림 객체 생성
		PrintWriter out = response.getWriter();

		if (db.getPasswd().equals(member.getPasswd())) {
			int result = dao.update(member);
			if (result == 1) {
				System.out.println("회원 수정 성공");
				out.println("<script>");
				out.println("alert('회원 수정 성공')");
				out.println("</script>");
			} else {
				out.println("<script>");
				out.println("alert('비밀번호가 다릅니다.')");
				out.println("history.go(-1)");
				out.println("</script>");
				out.close();

				return null; // null로 리턴 해줘야 포워딩을 하지 않는다.
			}
		}

		ActionForward forward = new ActionForward();
		forward.setRedirect(false);
		forward.setPath("./member/main.jsp");

		return forward;
	}

}
