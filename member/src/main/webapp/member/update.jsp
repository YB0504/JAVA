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
	// 수정할 때 선택한 취미를 다시 -로 연결하여 저장
	String[] hobby = request.getParameterValues("hobby");
	String h = "";      	// String h = "공부-게임-등산-";
	for(String h1 : hobby){
		h += h1 + "-";
	}
	
	member.setHobby(h);
	
	MemberDAO dao = MemberDAO.getInstance();
	
	// 회원 한명의 상세정보(비밀번호) 구해오기
	MemberDTO old = dao.getMember(member.getId());
	
	// 비밀번호 비교
	if(old.getPasswd().equals(member.getPasswd())){	// 일치
		int result = dao.update(member);	// update SQL문 실행
		if(result == 1){
%>

		<script>
			alert("회원정보 수정 성공");
			location.href = "main.jsp";
		</script>

<%		}
	}else{ 	// 불일치	%>
		<script>
			alert("비밀번호가 일치하지 않습니다.");
			history.go(-1);
		</script>


<%	} %>


