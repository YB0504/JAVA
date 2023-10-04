<%@ page contentType="text/html; charset=utf-8" %>
<%@ page import="register.LogonDataBean" %>
<%@ page import="register.LogonDBBean" %>
<%@ include file="color.jsp" %>

<% 
  request.setCharacterEncoding("utf-8");

  LogonDataBean	regBean1 = new LogonDataBean();
//regBean1.id="test";
%>

<jsp:useBean id="regBean" class="register.LogonDataBean" />
<jsp:setProperty name="regBean" property="*" />

<%
//	regBean.id="test";
%>

<%
	// DAO클래스 내부의 메소드호출
	// regBean이 가진 주소값인 LogonDataBean를 해당 메소드에 매개변수로 설정
	LogonDBBean manager = LogonDBBean.getInstance();
	int result=manager.insertMember(regBean);	// 주소값을 전달해서 메소드를 호출

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



