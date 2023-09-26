<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
</head>
<body>
<%
	// 공유 설정
	pageContext.setAttribute("pageScope", "pageValue");		// 하나의 페이지에서만 공유
	request.setAttribute("requestScope", "requestValue");	
%>

	pageValue = <%=pageContext.getAttribute("pageScope") %><br>
	requestValue = <%=request.getAttribute("requestScope") %>
</body>
</html>