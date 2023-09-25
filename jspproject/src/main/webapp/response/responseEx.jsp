<%@ page contentType="text/html;charset=utf-8"%>

<h1>Response 예제</h1>
현재 페이지는 responseEx.jsp 페이지입니다.


<%
	// JSP에서 페이지 이동
	// 특별한 특징 없이 바로 이동한다.
	// 전달할 내용이 적을 때는 get방식으로 전달하는 것이 빠르다.
	response.sendRedirect("first.jsp?name=test");
%>