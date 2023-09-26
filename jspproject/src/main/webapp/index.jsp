<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

처음 작성하는 JSP 페이지~이야~<br><br>

application객체로 공유한 값<br>
<!-- application객체는 폴더가 달라도 공유한 값을 가져와서 출력할 수 있다. -->
<%=application.getAttribute("java")%>

</body>
</html>