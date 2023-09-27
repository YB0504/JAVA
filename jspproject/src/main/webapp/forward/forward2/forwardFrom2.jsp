<%@ page contentType="text/html;charset=utf-8"%>

<html>
	<body>

	<h1>포워딩하는 페이지: forwardFrom2.jsp</h1>

	<%
		request.setCharacterEncoding("utf-8");

//		String name1 = "안화수";
		// 확장자값을 설정하여 선택한 혈액형.jsp 형식을 가진다.
		String bloodType = request.getParameter("bloodType") + ".jsp";
	
//		String bloodType = "a.jsp";
	%>
	
	<!-- 선택한 혈액형에 맞는 .jsp파일로 이동한다. -->
	<jsp:forward page="<%=bloodType%>"/>