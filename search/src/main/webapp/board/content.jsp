<%@page import="java.text.SimpleDateFormat"%>
<%@page import="board.BoardDataBean"%>
<%@page import="board.BoardDBBean"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%
	int num = Integer.parseInt(request.getParameter("num"));
	// page는 변수로 사용 할수 없다.(상단의 page태그와 동일)
	String nowpage = request.getParameter("page");
	
	BoardDBBean dao = BoardDBBean.getInstance();
	
	// 조회수 1증가 + 상세 정보 구하기
	// DAO클래스 내부에 메소드 생성하기
	BoardDataBean board = dao.updateContent(num);
	
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
		<td colspan="3"><%=board.getSubject() %></td>
	</tr>
	<tr>
		<td>내용</td>
		<td colspan="3">
			<%-- <pre><%=board.getContent() %></pre> --%>
			<%=content %>
		</td>
	</tr>
	<tr>
		<td colspan="4" align="center">
			<input type="button" value="수정" 
			onclick="location.href='updateForm.jsp?num=<%=num%>&page=<%=nowpage%>'">
			<input type="button" value="삭제" 
			onclick="location.href='deleteForm.jsp?num=<%=num%>&page=<%=nowpage%>'">
			<input type="button" value="목록" 
			onclick="location.href='list.jsp?page=<%=nowpage%>'">
		</td>
	</tr>
	
	
	
</table>





</body>
</html>







