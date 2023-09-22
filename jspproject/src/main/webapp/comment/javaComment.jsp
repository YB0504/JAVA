<%@ page contentType = "text/html; charset=utf-8" %>


<!-- JSP 스크립트 주석 -->
<%!
	/**
	 * a와 b의 합을 리턴한다.
	 */
	public int add(int a, int b) {
		return a + b;
	}
%>

<html>
<head><title>자바 주석</title></head>

<body>

<%
	int val1 = 10; // val1에 10을 할당
	int val2 = 20; // val2에 20을 할당
	
	/* va1과 va2의 값을 더한 결과를
	   result에 할당한다. */
	int result = add(val1, val2);
%>

<!-- 표현식 태그 안에서는 다중행 주석기호만 사용할 수 있다. -->
<%= val1 %> + <%= val2 %> = <%= result /* 결과는? */  %>

</body>
</html>