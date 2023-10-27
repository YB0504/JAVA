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
import service.BoardAddAction;
import service.BoardDelete;
import service.BoardDetailAction;
import service.BoardListAction;
import service.BoardModify;
import service.BoardModifyForm;
import service.BoardReply;
import service.BoardReplyForm;

@WebServlet("*.do")
public class BoardController extends HttpServlet {
	
	// doGet(), doPost() 메소드의 공통적인 작업을 처리하는 메소드
	protected void doProcess(HttpServletRequest request, 
			HttpServletResponse response) throws ServletException, IOException {
		
		// 전체 경로값
		String requestURI = request.getRequestURI();
		// 현재 프로젝트 명
		String contextPath = request.getContextPath();
		// do확장자로 요청한 Service클래스 명
		String command = requestURI.substring(contextPath.length());
		
		System.out.println("requestURI : " + requestURI);
		System.out.println("contextPath : " + contextPath);
		System.out.println("command : " + command);
		
		Action action = null;
		ActionForward forward = null;
		
		// 원문 글 작성
		if(command.equals("/BoardAddAction.do")) {
			try {
				action = new BoardAddAction();
				forward = action.excute(request, response);
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		// 글 작성 폼(글작성 클릭 시)
		// 작성 폼으로만 이동하기 때문에 전달될 값이 없다.
		}else if(command.equals("/BoardForm.do")) {
			forward = new ActionForward();
			forward.setRedirect(false);
			forward.setPath("./board/board_write.jsp");
			
		// 글 목록
		}else if(command.equals("/BoardListAction.do")) {
			try {
				action = new BoardListAction();
				forward = action.excute(request, response);
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		// 상세 페이지
		}else if(command.equals("/BoardDetailAction.do")) {
			try {
				action = new BoardDetailAction();
				forward = action.excute(request, response);
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		// 댓글 작성 폼
		}else if(command.equals("/BoardReplyForm.do")) {
			try {
				action = new BoardReplyForm();
				forward = action.excute(request, response);
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		// 댓글 작성
		}else if(command.equals("/BoardReply.do")) {
			try {
				action = new BoardReply();
				forward = action.excute(request, response);
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		// 글 수정 폼
		}else if(command.equals("/BoardModifyForm.do")) {
			try {
				action = new BoardModifyForm();
				forward = action.excute(request, response);
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		// 글 수정
		}else if(command.equals("/BoardModify.do")) {
			try {
				action = new BoardModify();
				forward = action.excute(request, response);
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		// 글 삭제 폼(글 삭제 클릭시)
		}else if(command.equals("/BoardDeleteForm.do")) {
			forward = new ActionForward();
			forward.setRedirect(false);
			forward.setPath("./board/board_delete.jsp");
			
		// 글 삭제
		}else if(command.equals("/BoardDelete.do")) {
			try {
				action = new BoardDelete();
				forward = action.excute(request, response);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		// 포워딩 처리
		if(forward != null) {			// Service클래스를 경유한 경우
			if(forward.isRedirect()) {	// redirect 방식 포워딩
				response.sendRedirect(forward.getPath());
			}else {						// dispatcher 방식 포워딩
				// 포워딩할 경로값을 dispatcher 객체생성한 변수에 저장
				RequestDispatcher dispatcher = request.getRequestDispatcher(forward.getPath());
				dispatcher.forward(request, response);
			}
		} // 포워딩
		
	} // doProcess end
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		System.out.println("get");
		
		doProcess(request, response); // doProcess() 호출
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		System.out.println("post");

		doProcess(request, response); // doProcess() 호출
	}

}
