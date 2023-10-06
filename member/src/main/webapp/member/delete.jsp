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
	
	MemberDTO old = dao.getMember(member.getId());
	
	// 비밀번호 비교
	if(old.getPasswd().equals(member.getPasswd())){
		int result = dao.delete(member.getId());
		if(result == 1){
			session.invalidate();	// 삭제 성공시 세션 삭제
%>
	
			<script>
				alert("회원 탈퇴 성공");
				location.href="main.jsp"
			</script>
	
<%		}
	}else{ 	// 불일치%>
			
			<script>
				alert("비밀번호가 일치하지 않습니다.");
				history.go(-1);
			</script>
			
<%	} %>

