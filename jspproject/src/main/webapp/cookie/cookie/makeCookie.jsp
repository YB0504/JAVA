<%@ page contentType="text/html; charset=utf-8"%>

<html>
<head>
<title>쿠키를 생성하는 예제</title>
</head>

<%
	String cookieName = "id";

	// 쿠키객체 생성
	// id 변수에 value값 totoro를 할당
	Cookie cookie = new Cookie(cookieName, "totoro");
	
	// 쿠키 유지할 시간 설정
	// 시간설정을 하지 않으면 쿠키를 발행한 브라우저를 종료하는 순간 정보가 지워진다.
	cookie.setMaxAge(3600);
	
	// 쿠키 value값 수정
	cookie.setValue("guardian");
	
	// 생성한 쿠키 발행
	response.addCookie(cookie);
%>

<body>
	<h2>쿠키를 생성하는 예제</h2>
	<P>
		"<%=cookieName%>" 쿠키가 생성 되었습니다.<br> 
		<input type="button"value="쿠키의 내용확인" 
		onclick="javascript:location.href='useCookie.jsp'">
	</P>
</body>
</html>