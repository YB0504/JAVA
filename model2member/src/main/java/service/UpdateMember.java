package service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.MemberDAO;
import model.MemberDTO;

public class UpdateMember implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {

		System.out.println("UpdateMember");

		// session으로 공유된 값을 가져오기 위해 session객체 생성
		HttpSession session = request.getSession();

		// session에 공유된 값 가져오기
		String id = (String) session.getAttribute("id");

		MemberDAO dao = MemberDAO.getInstance();

		// 회원 1명의 상세정보 구하기
		MemberDTO member = dao.getMember(id);
		System.out.println("수정폼 : " + member);

		// 다중 선택은 Service클래스에서 잘라서 배열로 저장해서 가져가는것이 쉽다.
		String hobby = member.getHobby(); // 공부 - 게임 -
		String[] h = hobby.split("-"); // h[0] = 공부, h[1] = 게임

		// 공유 설정
		// 공유되는 값의 자료형은 세가지가 있다.
		// 객체 공유 객체명.필드명
		// 배열형, List 공유 foreach태그에 item속성에 작성
		request.setAttribute("member", member);
		request.setAttribute("h", h);
		
		// request객체로 공유한 경우에는 dispatcher 방식으로 포워딩을 해야
		// View페이지에서 공유한 값에 접근할 수 있다.
		ActionForward forward = new ActionForward();
		// 포워딩 방식 설정
		forward.setRedirect(false);	// dispatcher 방식 포워딩
		forward.setPath("./member/updateform.jsp");

		return forward;
	}

}
