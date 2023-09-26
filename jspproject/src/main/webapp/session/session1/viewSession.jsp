<%@ page contentType="text/html; charset=utf-8" %>
<%@ page import="java.util.*" %>

<html>
	<head><title>세션 사용 예제</title></head>
	<body>

<%--
	// 세션 name값을 모르는 경우 열거형으로 getAttributeNames() 사용하여 name값을 구해온다.
	// attr = "id", "passwd"
	Enumeration attr = session.getAttributeNames();

	// boolean 형태로 실행된다.
	while(	attr.hasMoreElements()	){
		// Object형태로 값을 돌려주기 때문에 필요한 자료형으로 다운 캐스팅을 한다.
		String attrName = (String)attr.nextElement();
		String attrValue = (String)session.getAttribute(attrName);
		out.println("세션의 속성명은 " + attrName + " 이고 ");
		out.println("세션의 속성값은 " + attrValue + "이다.<br><br>");
	}
--%>

<!-- session의 name값을 알고 있는 경우 -->
<%
	// Object getAttribute(String name)
	// 저장된 value값이 String형이기 때문에 자식클래스 형태로 다운캐스팅
	// 위의 방식보다 더 자주 사용된다.
	String id = (String)session.getAttribute("id");
	String passwd = (String)session.getAttribute("passwd");
%>
ID : <%=id%><br>
비밀번호 : <%=passwd%><br>


	</body>
</html>
