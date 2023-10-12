<%@page import="java.text.SimpleDateFormat"%>
<%@page import="reboard.BoardDataBean"%>
<%@page import="reboard.BoardDBBean"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%
	int num = Integer.parseInt(request.getParameter("num"));
	String nowpage = request.getParameter("page");
	
	BoardDBBean dao = BoardDBBean.getInstance();
	
	// 조회수 1 증가 + 상세 정보
	BoardDataBean board = dao.updateContent(num);
	
	// 부모글 정보 구하기
	// 댓글 insert를 위한 각 각의 값을 받기 위한 변수 설정
	int ref = board.getRef();
	int re_level = board.getRe_level();
	int re_step = board.getRe_step();
	
	String content = board.getContent().replace("\n", "<br>");
	
	SimpleDateFormat sd = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss EEE요일");
	
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>상세 페이지</title>
</head>
<body>

	<table border="1" width=400 align="center">
		<tr>
			<td>번호</td>
			<td><%=board.getNum() %></td>
			<td>조회수</td>
			<td><%=board.getReadcount() %></td>
		</tr>
		<tr>
			<td>작성자</td>
			<td><%=board.getWriter() %></td>
			<td>작성일</td>
			<td><%=sd.format(board.getReg_date()) %></td>
		</tr>
		<tr>
			<td>제목</td>
			<td colspan="3"><%=board.getSubject() %></td>
		</tr>
		<tr>
			<td>내용</td>
			<td colspan="4">
				<pre><%=board.getContent() %></pre>
				<%=content %>
			</td>
		</tr>
		<tr>
			<td colspan="4" align="center">
				<!-- 부모 글(원문 글)의 ref값도 모두 가져가야 한다. -->
				<input type="button" value="댓글"
onclick="location.href='replyForm.jsp?num=<%=num%>&page=<%=nowpage%>&ref=<%=ref%>&re_level=<%=re_level%>&re_step=<%=re_step%>'">
				
				<input type="button" value="수정">
				
				<input type="button" value="삭제">
		
				<input type="button" value="목록" 
				onclick="location.href='list.jsp?page=<%=nowpage%>'">
			</td>
		</tr>
	</table>

</body>
</html>







