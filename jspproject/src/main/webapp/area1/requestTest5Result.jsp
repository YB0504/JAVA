<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
</head>
<body>
	<!-- 앞서 공유된 내용을 가져와서 출력 -->
	pageValue = <%=pageContext.getAttribute("pageScope")%><br>	<!-- null -->
	requestValue = <%=request.getAttribute("requestScope")%>
</body>
</html>