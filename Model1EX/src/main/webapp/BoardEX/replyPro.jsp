<%@page import="Model1EX.DTOEX"%>
<%@page import="Model1EX.DAOEX"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%
	request.setCharacterEncoding("utf-8");
%>

<jsp:useBean id="board" class="Model1EX.DTOEX"/>
<jsp:setProperty property="*" name="board"/>

<%	
	board.setIp(request.getRemoteAddr());
	String nowpage = request.getParameter("page");

	// DB접속하여 setProperty로 값 전달
	DAOEX dao = DAOEX.getinstance();
	
	// 매개변수를 DTO로 설정하여 값전달
	int result = dao.reply(board);
	
	if(result == 1){
%>
		<script>
			alert("답글 작성 성공");
			location.href = "list.jsp?page=<%=nowpage%>"
		</script>
<%	}else{ %>
		<script>
			alert("답글 작성 실패");
			history.go(-1);
		</script>
<%	} %>
