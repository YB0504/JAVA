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
	board.setIp(request.getRemoteAddr());

	String nowpage = request.getParameter("page");
	
	BoardDBBean dao = BoardDBBean.getInstance();
	
	// 비밀번호 일치를 위한 DB에서 비밀번호 구하기
	BoardDataBean old = dao.getContent(board.getNum());
	
	if(old.getPasswd().equals(board.getPasswd())){
	int result = dao.update(board);
		if(result == 1){
%>		

			<script>
				alert("글 수정 성공");
				location.href = "content.jsp?num=<%=board.getNum()%>&page=<%=nowpage%>";
			</script>

<% 		}
	}else{	%>
	
			<script>
				alert("글 수정 실패");
				history.go(-1);
			</script>
		
<% 	}	%>
		

