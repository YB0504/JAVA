<%@ page contentType="text/html; charset=utf-8" %>

<html>
	<head><title>세션 사용 예제</title>
	</head>
	<body>

<%
	//
	String id = "guardian23";
	String passwd = "1234";
	
	// 세션 설정
	// session.setAttribute("name", value);
	// value값이 Object로 되어 있기 때문에 
	// Object의 자식 형태는 모두 사용가능하다.
	session.setAttribute("id", id);				// id = "guardian23"
	session.setAttribute("passwd", passwd);		// passwd = "1234"
%>

	세션에 id 와 passwd 속성을 설정하였습니다.<br><br>

	<input type="button" value="세션의 설정된 속성확인" 
	onclick="location.href='viewSession.jsp'">
	<!-- 페이지 이동을 할 때 값을 가져가지 않는다. -->
	</body>
</html>