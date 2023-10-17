package send;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class QueryString
 */
@WebServlet(description = "값 전달 연습", urlPatterns = { "/QueryString" })
public class QueryString extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		// 값이 전달 될 때 인코딩하는 것이 아니라 출력될 문서의 한글값 인코딩이다.
		response.setContentType("text/html; charset=utf-8");

		PrintWriter out = response.getWriter();

		// 폼에서 넘어온 값 구해오기
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		String name = request.getParameter("name");
		String vclass = request.getParameter("class");
		String phone1 = request.getParameter("phone1");
		String phone2 = request.getParameter("phone2");
		String phone3 = request.getParameter("phone3");

		out.println("<html><body>");
		out.println("회원 정보 : get방식으로 값 전달<br>");
		out.println("ID : " + id + "<br>");
		out.println("password : " + pw + "<br>");
		out.println("이름 : " + name + "<br>");
		out.println("회원 구분 : " + vclass + "<br>");
		out.println("전화번호 : " + phone1 + "-" + phone2 + "-" + phone3 + "<br>");
		out.println("<a href = 'javascript:history.go(-1)'>다시</a>");
		out.println("</body>");
		out.println("</html>");
		out.close(); // 출력 스트림 객체 닫기
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		// 값이 전달 될 때 인코딩하는 것이 아니라 출력될 문서의 한글값 인코딩이다.
		response.setContentType("text/html; charset=utf-8");
		
		// post방식으로 한글값을 전달한 경우 인코딩 시켜주는 코드
		request.setCharacterEncoding("utf-8");

		PrintWriter out = response.getWriter();

		// 폼에서 넘어온 값 구해오기
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		String name = request.getParameter("name");
		String vclass = request.getParameter("class");
		String phone1 = request.getParameter("phone1");
		String phone2 = request.getParameter("phone2");
		String phone3 = request.getParameter("phone3");

		out.println("<html><body>");
		out.println("회원 정보 : post방식으로 값 전달<br>");
		out.println("ID : " + id + "<br>");
		out.println("password : " + pw + "<br>");
		out.println("이름 : " + name + "<br>");
		out.println("회원 구분 : " + vclass + "<br>");
		out.println("전화번호 : " + phone1 + "-" + phone2 + "-" + phone3 + "<br>");
		out.println("<a href = 'javascript:history.go(-1)'>다시</a>");
		out.println("</body>");
		out.println("</html>");
		out.close(); // 출력 스트림 객체 닫기
		
		QueryDTO dto = new QueryDTO();
		dto.setId(id);
		dto.setPw(pw);
		dto.setName(name);
		dto.setVclass(vclass);
		dto.setPhone(phone1 + "-" + phone2 + "-" + phone3);
		
		QueryDAO dao = QueryDAO.getInstance();
		int result = dao.insert(dto);
		if(result == 1) {
			System.out.println("회원 가입 완료");
		}
	}

}
