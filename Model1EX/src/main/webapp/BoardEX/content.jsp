<%@page import="javax.swing.border.Border"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="Model1EX.DTOEX"%>
<%@page import="Model1EX.DAOEX"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%
	int num = Integer.parseInt(request.getParameter("num"));
	String nowpage = request.getParameter("page");
	
	DAOEX dao = DAOEX.getinstance();
	
	DTOEX board = dao.updateContent(num);
	
	int ref = board.getRef();
	int re_step = board.getRe_step();
	int re_level = board.getRe_level();
	
	SimpleDateFormat sd = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table border="1" width=500 align="center">
		<caption>상세 페이지</caption>
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
			<td><%=board.getSubject() %></td>
			<td>E-Mail</td>
			<td><%=board.getEmail() %></td>
		</tr>
		<tr>
			<td>내용</td>
			<td colspan="3">
			<pre><%=board.getContent() %></pre>
			</td>
		</tr>
		<tr>
			<td colspan="4" align="center">
				<!-- 부모글의 ref,re_level,re_step 값도 가져가야 한다. -->
				<input type="button" value="답글"
				 onclick="location.href='replyForm.jsp?num=<%=num%>&page=<%=nowpage%>&ref=<%=ref%>&re_level=<%=re_level%>&re_step=<%=re_step%>'">
				<input type="button" value="수정"
				 onclick="location.href='updateForm.jsp?num=<%=num%>&page=<%=nowpage%>'">
				<input type="button" value="삭제"
				 onclick="location.href='deleteForm.jsp?num=<%=num%>&page=<%=nowpage%>'">
				<input type="button" value="목록"
				 onclick="location.href='list.jsp?page=<%=nowpage%>&num=<%=num%>'">
			</td>
		</tr>
	</table>
</body>
</html>