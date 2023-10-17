package send;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class HelloWorld
 */
// 어노테이션(WebServlet)
// urlPatterns
// : 따로 지정 하지 않으면 현재 클래스 명과 동일하게 설정된다.
// : 필요하다면 따로 지정할 수도 있다.
@WebServlet(description = "처음 작성하는 자바서블릿", urlPatterns = { "/HelloWorld" })
public class HelloWorld extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	// 메소드 오버라이딩
	// get방식과 post방식의 각 요청방식이 들어올 때 각각의 메소드가 실행된다.
	
	// request, response 객체 이외의 객체는 만들어서 사용한다.
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 출력스트림(out객체를 만들어주는 역할)					// 현재 프로젝트 명을 구해온다.
//		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		// 한글 인코딩
		response.setContentType("text/html; charset=utf-8");
		
		// 세션 객체 생성
		HttpSession session = request.getSession();
		
		// 출력스트림 객체 생성
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<head>");
		out.println("<title>Hello World</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<h1>Hello World</h1>");
		out.println("<h1>흐어어어어</h1>");	// 한글값이 깨지기 때문에 인코딩 코드를 추가해줘야 한다.
		out.println("</body>");
		out.println("</html>");
		out.close();
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
