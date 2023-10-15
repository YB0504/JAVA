<%@ page contentType="text/html; charset=utf-8" %>

<html>
<head>
<title>게시판</title>
<script src="http://code.jquery.com/jquery-latest.js"></script>
<script src="check.js"></script>
</head>

   
<form method="post" action="writePro.jsp">

<table width="400" border="1" cellspacing="0" cellpadding="0" align="center">
   <caption><h3>게시글 작성</h3></caption>
   <tr>
    <td  width="70" align="center">이 름</td>
    <td  width="330">
       <input type="text" size="10" maxlength="10" id="writer" name="writer" autofocus></td>
  </tr>
  <tr>
    <td  width="70" align="center" >제 목</td>
    <td  width="330">
       <input type="text" size="40" maxlength="50" id="subject" name="subject"></td>
  </tr>
  <tr>
    <td  width="70" align="center">Email</td>
    <td  width="330">
       <input type="text" size="40" maxlength="30" id="email" name="email" ></td>
  </tr>
  <tr>
    <td  width="70" align="center" >내 용</td>
    <td  width="330" >
     <textarea id="content" name="content" rows="13" cols="40"></textarea> </td>
  </tr>
  <tr>
    <td  width="70" align="center" >비밀번호</td>
    <td  width="330" >
     <input type="password" size="8" maxlength="12" id="passwd" name="passwd"> 
	 </td>
  </tr>
<tr>      
 <td colspan=2 align="center"> 
  	<input type="submit" value="글쓰기" >  
  	<input type="reset" value="다시작성">
  	<input type="button" value="목록보기" onClick="location.href='list.jsp'">
 </td></tr></table>    
    
</form>      
</body>
</html>      
