<%@ page contentType="text/html; charset=utf-8"%>

<html>
<head>
<title>로그인폼</title>
</head>
<body>

	<!-- request.getContextPath() : 현재 프로젝트 명을 구해오는 메소드 -->
	<form action="sessionLogin.jsp" method="post">
		아이디 <input type="text" name="id" size="10"> 암호 <input
			type="password" name="password" size="10"> <input
			type="submit" value="로그인">
	</form>

</body>
</html>