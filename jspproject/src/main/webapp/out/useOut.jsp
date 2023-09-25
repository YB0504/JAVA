<%@ page contentType="text/html; charset=utf-8"%>

<html>
<head>
<title>out 기본 객체 사용</title>
</head>
<body>

	<%
	// 줄바꿈 기능이 없다.
	out.println("안녕하세요?<br>");
	out.println("안녕하세요?");
	
	// 콘솔창에 출력
	System.out.println("안녕하세요?");
	%>
	<br> out 기본 객체를 사용하여
	<%
	out.println("출력한 결과입니다.");
	%>

</body>
</html>