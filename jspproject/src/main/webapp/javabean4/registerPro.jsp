<%@ page contentType="text/html; charset=utf-8" %>
<%@ page import="register.LogonDataBean" %>
<%@ page import="register.LogonDBBean" %>
<%@ include file="color.jsp" %>

<% 
	request.setCharacterEncoding("utf-8");

	// useBean과 같은 기능의 자바 코드
	LogonDataBean regBean1 = new LogonDataBean();
//regBean1.id="test";
%>

<!-- Bean객체 생성 -->
<jsp:useBean id="regBean" class="register.LogonDataBean" />

<!-- setter메소드 역할 -->
<jsp:setProperty name="regBean" property="*" />

<%
//	regBean.id="test";
%>

<%
	// DAO클래스 내부의 메소드를 호출하여 DAO객체 생성
	// DAO클래스를 사용하기 위해 반드시 import하여야 한다.
	LogonDBBean manager = LogonDBBean.getInstance();

	// 입력된 값을 가지고 있는 regBean이 가진 주소값을 전달해서 메소드를 호출
	int result=manager.insertMember(regBean);

	if(result==1){
%>	
	<script>
		alert("회원가입 성공");
		location.href="list.jsp";
	</script>
	
<% }else{%>

	<script>
		alert("회원가입 실패");
		history.go(-1);
	</script>

<% } %>



