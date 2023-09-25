<%@ page contentType="text/html;charset=utf-8"%>

<%	
	// 폼파일에서 한글값이 post방식으로 전송될때 utf-8로 인코딩을 시켜주는 역할
	// get방식으로 값이 넘어갈 때는 아파치톰캣이 알아서 인코딩하기 때문에
	// 신경쓰지 않아도 된다.
	// 인코딩 타입을 항상 위쪽에 먼저 설정해야 한다.
	request.setCharacterEncoding("utf-8");
%>

<html>
<h1>Request 객체1</h1>

<%
	// 대소문자를 구분한다.
	/* String name = request.getParameter("NAME"); null 값이 출력된다. */
	// name값과 값을 받는 변수명은 헷갈리지 않게 주로 똑같게 설정한다.
	String name = request.getParameter("name");
	String studentNum = request.getParameter("studentNum");
	String gender = request.getParameter("gender");
	String major = request.getParameter("major");
%>

<body>
성명 : <%=name%><p>
학번 : <%=studentNum%><p>
성별 : <%=gender%><p>
전공 : <%=major%>
</body>
</html>

