<%@ page contentType="text/html; charset=utf-8" %>
<%@ page import="register.LogonDataBean" %>
<%@ page import="register.LogonDBBean" %>
<%@ include file="color.jsp" %>

<% 
  request.setCharacterEncoding("utf-8");

  LogonDataBean	regBean1 = new LogonDataBean();
// regBean1.id="test";
%>

<jsp:useBean id="regBean" class="register.LogonDataBean" />
<jsp:setProperty name="regBean" property="*" />

<%
	LogonDBBean manager = LogonDBBean.getInstance();

	// hidden객체로 전달받은 id값을 받아온다.
	LogonDataBean old = manager.updateForm(regBean.getId());

	// id값을 받아와서 비밀번호의 일치를 비교한다.
	// 기존 비밀번호 			updateForm에서 입력한 비밀번호
	if(old.getPasswd().equals(regBean.getPasswd())){ // 비번 일치시	
		manager.update(regBean);	// update SQL문 실행
		
%>	
	<script>
		alert("회원수정 성공");
		location.href="list.jsp";
	</script>
	
<% }else{	// 비번 불일치	%>

	<script>
		alert("비밀번호가 일치하지 않습니다.");
		history.go(-1);
	</script>

<% } %>



