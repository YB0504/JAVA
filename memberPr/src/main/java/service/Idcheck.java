package service;

import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.MemberDAO;

public class Idcheck implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request, 
			HttpServletResponse response) throws Exception {

		System.out.println("Idcheck");

		request.setCharacterEncoding("utf-8");

		// 출력 스트림 객체 생성
		PrintWriter out = response.getWriter();

		// JASON 형태로 전달한 id값을 받는다.
		String id = request.getParameter("id");
		System.out.println("id : " + id);

		MemberDAO dao = MemberDAO.getInstance();
		int result = dao.idcheck(id);
		System.out.println("result : " + result); // 1 : 중복 ID
												  // -1 : 사용 가능한 ID
		// 웹 브라우저에 출력되는 값이 callback함수로 리턴된다.
		out.println(result);

		// 비동기적으로 처리 하기 때문에 ActionFoward로 돌려주지 않는다.
		return null;
	}

}
