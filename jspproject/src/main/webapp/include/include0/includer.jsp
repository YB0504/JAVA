<%@ page contentType = "text/html; charset=utf-8" %>

<html>
	<head>
	<title>include 디렉티브</title>
	</head>
	<body>
<!-- 불러오는 파일 -->
<%
    int number = 10;
%>

<!-- 
	 한 개의 파일처럼 동작하기 때문에
	 변수를 같이 사용할 수 있다.
 -->
<%@ include file="includee.jspf" %>

<!-- 불려지는 파일안에 들어있는 변수값이 전달된다. -->
공통변수 DATAFOLDER = "<%= dataFolder %>"

	</body>
</html>