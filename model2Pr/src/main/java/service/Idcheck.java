package service;

import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.model2mbDAO;

public class Idcheck implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {

		System.out.println("Idcheck");

		request.setCharacterEncoding("utf-8");

		// 출력 스트림 out객체 생성 (response로 작성)
		PrintWriter out = response.getWriter();
		
		// ajax함수의 JSON형태로 전달한 id값을 받는다.
		String id = request.getParameter("id");
		System.out.println("id : " + id);

		model2mbDAO dao = model2mbDAO.getinstace();
		int result = dao.idcheck(id);
		System.out.println("result : " + result);

		// 웹 브라우저에 출력되는 값이 callback함수로 리턴된다.
		out.println(result);

		// 비동기 처리방식(ajax)로 처리 하기 때문에 null로 리턴
		return null;
	}

}
