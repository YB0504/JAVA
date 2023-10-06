<%@page import="member.MemberDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	
<script src="http://code.jquery.com/jquery-latest.js"></script>
<script>
	$(document).ready(function() {
		
		// 중복 ID인 경우
		$("#close1").click(function() {
			// opener : 부모 윈도우
			opener.$("#id").val("").focus();
			window.close();
		});
		
		// 사용 가능한 ID인 경우
		$("#close2").click(function() {
			opener.$("#passwd").focus();
			window.close();
		});
		
	});

</script>

<%
	String id = request.getParameter("id");

	// ID중복 검사를 위한 DB연동
	MemberDAO dao = MemberDAO.getInstance();
	
	// id 중복검사 메소드 호출
	int result = dao.memberAuth(id);
	
	if(result == 1){	// 중복 ID : 1
		
%>

		<%=id %>는 중복된 ID입니다.<br><br><br>
		<input type="button" value="닫기" id="close1">

<%	}else{ 		// 사용 가능한 ID : -1%>

		<%=id %>는 사용 가능한 ID입니다.<br><br><br>
		<input type="button" value="닫기" id="close2">

<%	} %>
