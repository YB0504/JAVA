<%@ page contentType="text/html; charset=utf-8" %>
<%@ include file="color.jsp"%>

<html>
<head>
<title>댓글 작성 폼</title>
<link rel="stylesheet" type="text/css" href="style.css">
<script src="http://code.jquery.com/jquery-latest.js"></script>
<script src="check.js"></script>
</head>

<% 
	int num=0, ref=1, re_step=0, re_level=0;	// 원문
	
	String nowpage = request.getParameter("page");
	
	if(request.getParameter("num") != null){	// 댓글버튼을 누르고 페이지를 넘어왔을 시
		num = Integer.parseInt(request.getParameter("num"));
		ref = Integer.parseInt(request.getParameter("ref"));
		re_level = Integer.parseInt(request.getParameter("re_level"));
		re_step = Integer.parseInt(request.getParameter("re_step"));
		nowpage = request.getParameter("page");
	}
%>
   
<body bgcolor="<%=bodyback_c%>">  
<center><b>댓글 작성</b>
<br>
<!-- 댓글을 insert 할 때 반드시 값을 가져가야 한다. -->
<form method="post"  action="replyPro.jsp">
<input type="hidden" name="num" value="<%=num%>">
<input type="hidden" name="page" value="<%=nowpage%>">
<input type="hidden" name="ref" value="<%=ref%>">
<input type="hidden" name="re_step" value="<%=re_step%>">
<input type="hidden" name="re_level" value="<%=re_level%>">

<table width="400" border="1" cellspacing="0" cellpadding="0"  bgcolor="<%=bodyback_c%>" align="center">
   <tr>
    <td align="right" colspan="2" bgcolor="<%=value_c%>">
	    <a href="list.jsp?page=<%=nowpage%>">글목록</a> 
   </td>
   </tr>
   <tr>
    <td  width="70"  bgcolor="<%=value_c%>" align="center">이 름</td>
    <td  width="330">
       <input type="text" size="10" maxlength="10" id="writer" name="writer"></td>
  </tr>
  <tr>
    <td  width="70"  bgcolor="<%=value_c%>" align="center" >제 목</td>
    <td  width="330">
       <input type="text" size="40" maxlength="50" id="subject" name="subject" value="Re."></td>
  </tr>
  <tr>
    <td  width="70"  bgcolor="<%=value_c%>" align="center">Email</td>
    <td  width="330">
       <input type="text" size="40" maxlength="30" id="email" name="email" ></td>
  </tr>
  <tr>
    <td  width="70"  bgcolor="<%=value_c%>" align="center" >내 용</td>
    <td  width="330" >
     <textarea id="content" name="content" rows="13" cols="40"></textarea> </td>
  </tr>
  <tr>
    <td  width="70"  bgcolor="<%=value_c%>" align="center" >비밀번호</td>
    <td  width="330" >
     <input type="password" size="8" maxlength="12" id="passwd" name="passwd"> 
	 </td>
  </tr>
<tr>      
 <td colspan=2 bgcolor="<%=value_c%>" align="center"> 
  	<input type="submit" value="댓글작성" >  
  	<input type="reset" value="다시작성">
  	<input type="button" value="목록보기" onClick="location.href='list.jsp?page=<%=nowpage%>'">
 </td></tr></table>    
    
</form>      
</body>
</html>      