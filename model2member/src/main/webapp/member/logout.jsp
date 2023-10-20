<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!-- 
	1. session 삭제
	2. 로그인 폼으로 이동
 -->

<%
	// 세션 삭제
	session.invalidate();
%>

<script>
	alert("로그 아웃");
	location.href = "./LoginForm.do";
</script>








