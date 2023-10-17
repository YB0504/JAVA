package send;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/DispatcherServlet")
public class DispatcherServlet extends HttpServlet {
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// request객체로 공유 설정
		request.setAttribute("request","requestValue");   
		
		// Dispatcher 방식으로 포워딩
		// url값이 변하지 않는다.
		RequestDispatcher dispatcher = 
				request.getRequestDispatcher("/servlet/ex6/dispatcher.jsp");
		dispatcher.forward(request, response);
	}

}
