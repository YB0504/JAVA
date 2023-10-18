<%@ page contentType = "text/html; charset=utf-8" %>

<!--
	prefix = 접두어
	uri = 접두어 관련 URI
 -->
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!-- 태그 맨 앞에 반드시 접두어로 시작한다. -->

<%--
	set 태그 : 변수 설정
	<c:set var="변수명" value="값할당" [scope="영역명"]/>
	value값은 표현언어로 작성해도되고 그냥 작성해도 된다.
 --%>
<%-- <c:set var="num1" value="20" /> --%>
<c:set var="num1" value="${20}" />
<c:set var="num2">
10.5
</c:set>
<c:set var="today" value="<%= new java.util.Date() %>" />

<html>
	<head>
		<title>set 태그와 remove 태그</title>
	</head>

	<body>
		<%
			String s = "jsp";
		%>
		<!-- JSP로 정의한 변수는 표현언어로 출력되지 않는다. -->
		${s}<br> 
		
		변수 num1 = ${num1} <br>
		변수 num2 = ${num2} <br>
		num1 + num2 = ${num1 + num2} <br>
		오늘은 ${today} 입니다.
	
		<!-- remove 태그 : 변수 삭제 -->
		<c:remove var="num1" scope="page" />

		<p>
		삭제한 후의 num1 = ${num1} <br>
		삭제한 후의 num1 + num2 = ${num1 + num2}
	</body>
</html>
