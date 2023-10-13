<%@page import="reboard.BoardDataBean"%>
<%@page import="reboard.BoardDBBean"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%
	request.setCharacterEncoding("utf-8");
%>

<jsp:useBean id="board" class="reboard.BoardDataBean"/>
<jsp:setProperty property="*" name="board"/>

<%
	String nowpage = request.getParameter("page");

	BoardDBBean dao = BoardDBBean.getInstance();
	
	BoardDataBean old = dao.getContent(board.getNum());
	
	if(old.getPasswd().equals(board.getPasswd())){
		int result = dao.delete(board);
		if(result == 1){
%>
			<script>
				alert("글 삭제 성공");
				location.href = "list.jsp?page=<%=nowpage%>";
			</script>
<%		}
	}else{ %>
			<script>
				alert("글 삭제 실패");
				history.go(-1);
			</script>
<%	} %>







