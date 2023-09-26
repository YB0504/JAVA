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
	pageContext.setAttribute("pageScope", "pageValue"); // 페이지를 벗어났기 때문에 null값이 출력

	// forward로 이동한 페이지도 request영역이 된다.
	// 보통은 한번 정도만 이동한다.
	request.setAttribute("requestScope", "requestValue");
	%>

	<!-- forward 액션태그 : 지정된 페이지로 바로 이동한다. -->
	<jsp:forward page="requestTest5Result.jsp"></jsp:forward>
</body>
</html>