<%@page import="board.BoardDBBean"%>
<%@page import="board.BoardDataBean"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%
	request.setCharacterEncoding("utf-8");
%>

<jsp:useBean id="board" class="board.BoardDataBean"/>
<jsp:setProperty property="*" name="board"/>

<%	
	// 글을 작성한 사용자의 IP주소 구해오기
	String ip = request.getRemoteAddr();
	board.setIp(ip);
	
	// DAO클래스 불러오기
	BoardDBBean dao = BoardDBBean.getInstance();
	int result = dao.insert(board);	// insert SQL문 실행
	
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






