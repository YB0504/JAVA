<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%
	// getAttribute는 Object형으로 값을 돌려주기 때문에 다운캐스팅이 필요하다.
	// Object getAttribute()
	String id = (String)session.getAttribute("id");

	if(id != null) { // 세션이 있는 경우
%>

		<%=id %> 님 환영합니다.<br><br><br>
		
		<a href="updateform.jsp">정보 수정</a><br>
		<a href="logout.jsp">로그 아웃</a><br>
		<a href="deleteform.jsp">회원 탈퇴</a><br>

<%	}else{ // 세션이 없는 경우(비정상적 접근)%>

		<a href="memberform.html">회원 가입</a><br>
		<a href="loginform.html">로그인</a><br>


<%	} %>
