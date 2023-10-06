<%@page import="member.MemberDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%
	request.setCharacterEncoding("utf-8");

	String id = request.getParameter("id");

	// ajax는 에러를 찾기 어렵기 때문에 콘솔창에 띄워가면서 작성
	System.out.println("id : " + id);
	
	MemberDAO dao = MemberDAO.getInstance();
	int result = dao.memberAuth(id);
	System.out.println("result : " + result);
	// 1 = 중복 , -1 = 사용 가능
	
	// 웹브라우저에 출력된 값이 callback함수로 리턴
	out.print(result);
%>


