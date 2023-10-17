package send;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/RedirectServlet")
public class RedirectServlet extends HttpServlet {
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// request객체로 공유 설정
		request.setAttribute("request", "requestValue");  
		
		// redirect 방식으로 포워딩
		// 포워딩은 가능하지만 공유 범위를 벗어나기 때문에 request로 공유한 값에 접근할 수 없다.
		// View 페이지로 url주소가 바뀐다.
//		response.sendRedirect("servlet/ex6/redirect.jsp");
		response.sendRedirect("/jspproject2/servlet/ex6/redirect.jsp");
	}

}
