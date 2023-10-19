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
	
	DAOEX dao = DAOEX.getinstance();
	
	DTOEX old = dao.getContent(board.getNum());
	
	if(old.getPasswd().equals(board.getPasswd())){
		int result = dao.update(board);
		if(result == 1){
%>
			<script>
				alert("글 수정 성공");
				location.href = "content.jsp?num=<%=board.getNum()%>&page=<%=nowpage%>";
			</script>
<%		}
	}else{ %>
			<script>
				alert("글 수정 실패");
				history.go(-1);
			</script>
<%	} %>

