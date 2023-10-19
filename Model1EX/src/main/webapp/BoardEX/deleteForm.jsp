<%@page import="Model1EX.DTOEX"%>
<%@page import="Model1EX.DAOEX"%>
<%@ page contentType="text/html; charset=utf-8" %>

<%
	int num = Integer.parseInt(request.getParameter("num"));
	String nowpage = request.getParameter("page");
	
	DAOEX dao = DAOEX.getinstance();
	
	DTOEX board = dao.getContent(num);
%>


<html>
<head>
<title>게시판</title>
<script src="http://code.jquery.com/jquery-latest.js"></script>
<script src="check.js"></script>
</head>

<!-- form태그 내부에 hidden으로 값 전달 -->
<form method="post" action="deletePro.jsp">
<input type="hidden" name="num" value="<%=num%>">
<input type="hidden" name="page" value="<%=nowpage%>">
<input type="hidden" name="ref" value="<%=board.getRef()%>">
<input type="hidden" name="re_step" value="<%=board.getRe_step()%>">
<input type="hidden" name="re_level" value="<%=board.getRe_level()%>">
<table width="400" border="1" cellspacing="0" cellpadding="0" align="center">
   <caption><h3>글 삭제</h3></caption>
  <tr>
    <td  width="70" align="center" >비밀번호</td>
    <td  width="330" >
     <input type="password" size="8" maxlength="12" id="passwd" name="passwd"> 
	 </td>
  </tr>
<tr>      
 <td colspan=2 align="center"> 
  	<input type="submit" value="삭제" >  
  	<input type="button" value="목록보기" onClick="location.href='list.jsp?page=<%=nowpage%>'">
 </td></tr></table>    
    
</form>      
</body>
</html>      
