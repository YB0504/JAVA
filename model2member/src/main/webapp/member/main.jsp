<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!-- 세션이 있는 경우 -->

<%-- <c:if test="${sessionScope.id != null }"> --%>
<!-- empty 연산자 사용 -->
<c:if test="${!empty sessionScope.id }">
	${sessionScope.id }님 환영합니다.<br><br>
	
	회원 정보 수정<br>
	<a href = "./Logout.do">로그 아웃</a><br>
	회원 탈퇴<br>
	
</c:if>

<!-- 세션이 없는 경우 -->
<c:if test="${empty sessionScope.id}">
	
	<a href = "<%=request.getContextPath() %>/MemberForm.do">회원 가입</a><br>
	<a href = "<%=request.getContextPath() %>/LoginForm.do">로그인</a><br>
	
</c:if>




