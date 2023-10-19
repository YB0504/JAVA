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
	String nowpage = request.getParameter("page");

	DAOEX dao = DAOEX.getinstance();
	
	DTOEX old = dao.getContent(board.getNum());
	if(old.getPasswd().equals(board.getPasswd())){
		int result = dao.delete(board);	// DTO에 저장되어 있는 값을 삭제하기 위해 매개변수로 전달
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



