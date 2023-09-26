<%@ page contentType = "text/html; charset=utf-8" %>

<%
	// 세션 삭제
	// 로그아웃, 회원 탈퇴 등의 경우에 연결을 끊기 위해 사용한다.
    session.invalidate();
%>

<html>
	<head><title>세션 종료</title></head>
	<body>

	세션을 종료하였습니다.

	</body>
</html>