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
	// IP주소 구해오기
	String ip = request.getRemoteAddr();

	board.setIp(ip);
	
	BoardDBBean dao = BoardDBBean.getInstance();
	
	int result = dao.insert(board);	// 원문 글 작성
	
	if(result == 1){

%>

		<script>
			alert("글 작성 성공");
			location.href = "list.jsp";
		</script>

<%	}else{ %>

		<script>
			alert("글 작성 실패");
			history.go(-1);
		</script>

<%	} %>

