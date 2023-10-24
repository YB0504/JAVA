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
import service.Delete;
import service.Idcheck;
import service.Login;
import service.MemberInsert;
import service.Update;
import service.UpdateMember;

@WebServlet("*.do")
public class model2mbCon extends HttpServlet {

	protected void doProcess(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// 클라이언트가 요청한 전체 경로값을 구한다.
		String requestURI = request.getRequestURI();
		// 현재 프로젝트명을 구한다.
		String contextPath = request.getContextPath();
		// 현재 프로젝트명의 길이만큼의 인덱스 번호부터 추출한다.(요청한 이름값)
		String command = requestURI.substring(contextPath.length());

		System.out.println("requestURI : " + requestURI);
		System.out.println("contextPath : " + contextPath);
		System.out.println("command : " + command);

		Action action = null;
		ActionForward forward = null;

		// 회원 가입
		if (command.equals("/MemberInsert.do")) {
			try {
				action = new MemberInsert();
				forward = action.execute(request, response);
			} catch (Exception e) {
				e.printStackTrace();
			}

			// ID 중복검사
		} else if (command.equals("/Idcheck.do")) {
			try {
				action = new Idcheck();
				forward = action.execute(request, response);
			} catch (Exception e) {
				e.printStackTrace();
			}

			// 로그인 성공
		} else if (command.equals("/Login.do")) {
			try {
				action = new Login();
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
			
			// 로그 아웃
		}else if(command.equals("/Logout.do")) {
			forward = new ActionForward();
			forward.setRedirect(false);
			forward.setPath("./member/logout.jsp");
			
			// 회원 수정 폼
		}else if(command.equals("/UpdateMember.do")) {
			try {
				action = new UpdateMember();
				forward = action.execute(request, response);
			} catch (Exception e) {
				e.printStackTrace();
			}
			
			// 회원 정보 수정
		}else if(command.equals("/Update.do")) {
			try {
				action = new Update();
				forward = action.execute(request, response);
			} catch (Exception e) {
				e.printStackTrace();
			}
			
			// 회원 탈퇴 폼
		}else if(command.equals("/DeleteMember.do")) {
			forward = new ActionForward();
			forward.setRedirect(false);
			forward.setPath("./member/deleteform.jsp");
			
			// 회원 탈퇴
		}else if(command.equals("/Delete.do")) {
			try {
				action = new Delete();
				forward = action.execute(request, response);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		// 포워딩 처리
		if (forward != null) {
			if (forward.isRedirect()) { // redirect 포워딩
				response.sendRedirect(forward.getPath());
			} else { // dispatcher 포워딩
				RequestDispatcher dispatcher = request.getRequestDispatcher(forward.getPath());
				dispatcher.forward(request, response);
			}

		}
	} // doProcess end

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("get");
		doProcess(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("post");
		doProcess(request, response);
	}

}
