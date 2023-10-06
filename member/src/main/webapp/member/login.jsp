<%@page import="member.MemberDTO"%>
<%@page import="member.MemberDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%
	request.setCharacterEncoding("utf-8");
%>

<jsp:useBean id="member" class="member.MemberDTO"/>
<jsp:setProperty property="*" name="member"/>

<%
	MemberDAO dao = MemberDAO.getInstance();

	// 회원 인증 처리
	int result = dao.memberCheck(member);
	
	if(result == 1){	// 회원인증 성공
		
		// 세션 공유 설정
		session.setAttribute("id", member.getId());
%>

		<script>
			alert("로그인 되었습니다.");
			location.href = "main.jsp"
		</script>

<%	}else{ 		// 회원 인증 실패%>
		
		<script>
			alert("로그인이 실패하였습니다.");
			history.go(-1);
		</script>
		
<%	} %>
