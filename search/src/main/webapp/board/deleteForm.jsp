<%@page import="board.BoardDataBean"%>
<%@page import="board.BoardDBBean"%>
<%@ page contentType="text/html; charset=utf-8" %>
<%@ include file="color.jsp"%>

<%
	int num = Integer.parseInt(request.getParameter("num"));
	String nowpage = request.getParameter("page");
%>

<html>
<head>
	<title>게시판 삭제 폼</title>
	<link rel="stylesheet" type="text/css" href="style.css">
	<script src="http://code.jquery.com/jquery-latest.js"></script>
	<script src="check.js"></script>
</head>   

<body bgcolor="<%=bodyback_c%>">  
<center><b>게시글 삭제</b>
<br>
<form method="post" name="writeform" action="deletePro.jsp">
<input type="hidden" name="num" value="<%=num%>">
<input type="hidden" name="page" value="<%=nowpage%>">
<table width="430" border="1" cellspacing="0" cellpadding="0"  bgcolor="<%=bodyback_c%>" align="center">
   <tr>
    <td align="right" colspan="2" bgcolor="<%=value_c%>">
	    <a href="list.jsp?page=<%=nowpage%>"> 글목록</a> 
   </td>
   </tr>
  <tr>
    <td  width="100"  bgcolor="<%=value_c%>" align="center" >비밀번호</td>
    <td  width="330">
     <input type="password" size="8" maxlength="12" id="passwd" name="passwd"> 
	 </td>
  </tr>
<tr>      
 <td colspan=2 bgcolor="<%=value_c%>" align="center"> 
	<input type="submit" value="글삭제" >  
	<input type="reset" value="다시작성">
	<input type="button" value="목록보기" onClick="location.href='list.jsp?page=<%=nowpage%>'">
</td></tr></table>    
   
</form>      
</body>
</html>
