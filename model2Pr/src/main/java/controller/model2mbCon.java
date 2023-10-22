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

		// 포워딩 처리
		if (forward != null) {
			if (forward.isRedirect()) {		// redirect 포워딩
				response.sendRedirect(forward.getPath());
			} else {						// dispatcher 포워딩
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
