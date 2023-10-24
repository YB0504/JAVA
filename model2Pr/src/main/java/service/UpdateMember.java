package service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.model2mbDAO;
import model.model2mbDTO;

public class UpdateMember implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {

		System.out.println("UpdateMember");

		// 공유된 세션 값을 가져오기 위한 Session객체 생성
		HttpSession session = request.getSession();

		// 세션으로 공유된 값 가져오기(Login.java)
		// getAttribute메소드로 값을 가져오고 해당 자료형으로 다운캐스팅
		String id = (String) session.getAttribute("id");

		// DB에 저장된 회원의 정보를 가져오는 메소드 실행을 위한 DAO객체 생성
		model2mbDAO dao = model2mbDAO.getinstace();

		// DTO에 저장된 회원의 상세 정보 구하기
		// 매개변수로 primary키로 설정된 id값 전달
		model2mbDTO member = dao.getMember(id);
		System.out.println("수정 폼 : " + member);

		// updateForm에 전달할 값 공유 설정
		// requset객체로 공유 설정
		request.setAttribute("member", member);

		ActionForward forward = new ActionForward();
		forward.setRedirect(false);
		forward.setPath("./member/updateform.jsp");

		return forward;
	}

}
