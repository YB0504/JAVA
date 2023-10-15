<%@page import="Model1EX.DTOEX"%>
<%@page import="javax.swing.text.html.parser.DTD"%>
<%@page import="Model1EX.DAOEX"%>
<%@page import="javax.swing.border.Border"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%
	request.setCharacterEncoding("utf-8");
%>

<jsp:useBean id="board" class="Model1EX.DTOEX"/>
<jsp:setProperty property="*" name="board"/>

<%
	String ip = request.getRemoteAddr();

	board.setIp(ip);

	DAOEX dao = DAOEX.getinstance();
	
	int result = dao.insert(board);
	if(result == 1){
%>

<script>
	alert("게시글 작성 완료");
	location.href = "list.jsp";
</script>
<%	}else{ %>

<script>
	alert("게시글 작성 실패");
	history.go(-1);
</script>
<%	} %>



