<%@page import="javaBean.SimpleBean"%>
<%@ page contentType="text/html; charset=utf-8" %>

<% request.setCharacterEncoding("utf-8");%>

<%
	// 자바빈에서는 getParameter()를 사용하지 않는다.
	// useBean 액션태그의 자바 형태(import를 반드시 해야한다.)
	SimpleBean sb1 = new SimpleBean();

	/* sb1.msg = "hi"; */ // 접근불가 (private 접근 제어자)
	/* setProperty 액션태그의 자바 형태 */
	sb1.setMsg("안녕");
%>

<!-- class속성으로 패키지.자바빈명으로 경로를 설정한다. -->
<!-- 
	useBean 액션 태그는 내부적으로 자바빈을 자동 import한다.
	자바빈 객체를 생성하는 역할
-->
<jsp:useBean id="sb" class="javaBean.SimpleBean" />

<!-- 
	useBean에서 만든 id속성 값과 name속성의 값을 일치시켜야 한다. 
	setProperty는 자바빈 클래스의 setter메소드를 호출해서 
	값을 heap메모리에 저장시켜주는 역할
	가입하는 입력 양식의 name값과 property명이 반드시 일치되어야 한다.
-->
<%-- 
	<jsp:setProperty name="sb" property="msg" />
	<jsp:setProperty name="sb" property="name" /> 
--%>

<!-- setProperty의 값을 한번에 처리 -->
<!-- 자바빈 클래스의 property와 일치하는 setter메소드를 전부 전달해준다. -->
<jsp:setProperty property="*" name="sb"/>

<html>
	<body>

	<h1>간단한 자바빈 프로그래밍</h1>
	<br>
	
	<!-- 
		자바빈 클래스의 getter메소드를 호출해서 리턴된 property를
		브라우저에 출력해주는 역할
		setProperty와 마찬가지로 useBean의 id값과 name값을 일치시킨다.
	-->
	<!-- 
		DAO에서는 getProperty를 사용할 수 없기 때문에
		자바형태로 출력하는 법도 알고 있어야한다.
	-->
	<%-- 이름 : <%=sb.getName()%> --%>
	이름 : <jsp:getProperty property="name" name="sb"/><br>
	<%-- 메시지 : <%=sb.getMsg() %><br>  getProperty 액션태그의 자바 형태 --%>
	메시지 : <jsp:getProperty name="sb" property="msg" />

	</body>
</html>









