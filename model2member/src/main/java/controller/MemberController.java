package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import service.Action;
import service.ActionForward;
import service.Idcheck;
import service.Login;
import service.MemberInsert;

// 클라이언트가 Controller클래스로 찾아올 WebServlet pattern 설정
@WebServlet("*.do") // do확장자로 요청하는 모든 요청을 받는다.
public class MemberController extends HttpServlet {

	// doGet(), doPost() 메소드에서 공통적인 작업을 처리하는 메소드
	protected void doProcess(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		// 나중에 오류를 해결하는 것이 힘들기 때문에
		// 경로값을 출력하는 코드를 중간중간 작성하는 것이 좋다.

		// 클라이언트가 요청한 전체 경로값을 구한다.
		String requestURI = request.getRequestURI();
		// 현재 프로젝트명을 구한다.
		String contextPath = request.getContextPath();
		// 현재 프로젝트명의 길이만큼의 인덱스 번호부터 추출한다.(요청한 이름값)
		String command = requestURI.substring(contextPath.length());

		System.out.println("requestURI : " + requestURI);
		System.out.println("contextPath : " + contextPath);
		System.out.println("command : " + command);

//		requestURI : /model2member/MemberInsert.do
//		contextPath : /model2member
//		command : /MemberInsert.do

		// Action 객체 생성 후 null값으로 초기화
		Action action = null;
		ActionForward forward = null;

		// 회원 가입
		// throws로 예외를 던지기 때문에 예외처리 형식이 필요하다.
		if (command.equals("/MemberInsert.do")) {
			try {

				// MemberInsert 객체 생성 후 execute메소드 실행
				// 일종의 업캐스팅 생성된 객체의 값을 action이 받는다.
				action = new MemberInsert();
				// execute메소드 실행
				// ActionForward 클래스로 값을 돌려주기 때문에
				// forward 로 값을 받는다.
				forward = action.execute(request, response);

			} catch (Exception e) {
				e.printStackTrace();
			}
			// ID 중복검사(ajax)
		} else if (command.equals("/Idcheck.do")) {
			try {
				action = new Idcheck();
				forward = action.execute(request, response);
			} catch (Exception e) {
				e.printStackTrace();
			}

			// 회원 가입 폼(로그인 창에서 클릭 시)
		} else if (command.equals("/MemberForm.do")) {
			// 전달하는 값이 없을 때는 Service클래스 없이 바로 포워딩한다.
			forward = new ActionForward();
			// 공유되는 값이 없기 때문에 포워딩 방식은 상관 없다.
			forward.setRedirect(false);
			forward.setPath("./member/memberform.jsp");

			// index에서 실행한 로그인 폼
		} else if (command.equals("/LoginForm.do")) {

			forward = new ActionForward();
			forward.setRedirect(false);
			forward.setPath("./member/loginform.jsp");

			// 로그인(회원인증)
		} else if (command.equals("/Login.do")) {
			try {
				action = new Login();
				forward = action.execute(request, response);
			} catch (Exception e) {
				e.printStackTrace();
			}
			
			// 로그아웃
		}else if(command.equals("/Logout.do")){
			
			forward = new ActionForward();
			forward.setRedirect(false);
			forward.setPath("./member/logout.jsp");
			
		}

		// 포워딩 처리
		if (forward != null) {
			if (forward.isRedirect()) { // redirect방식으로 포워딩
				response.sendRedirect(forward.getPath());
			} else { // dispatcher 방식 포워딩
				RequestDispatcher dispatcher = request.getRequestDispatcher(forward.getPath());
				dispatcher.forward(request, response);
			}

		}

	} // doProcess() end

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("get");

		// doProcess()메소드 호출
		doProcess(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("post");

		// doProcess()메소드 호출
		doProcess(request, response);
	}

}
