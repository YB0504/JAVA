<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>selProduct.jsp</title>
</head>
<%
	request.setCharacterEncoding("utf-8");

	// 세션 설정
	session.setAttribute("username", request.getParameter("username"));
%>
<body>
	<center>
		<H2>상품선택</H2>
		<HR>
		<!-- 공유된 세션 블러와서 출력 -->
		<%=session.getAttribute("username")%>님이 로그인 한 상태 입니다.
		
		<!-- 표현언어 --> 
		${username}		<!-- username이 출력된다. -->
		<HR>
		<form name="form1" method="POST" action="add.jsp">
			<SELECT name="product">
				<option>사과</option>
				<option>귤</option>
				<option>파인애플</option>
				<option>자몽</option>
				<option>레몬</option>
			</SELECT> 
				<input type="submit" value="추가" />
		</form>
		<a href="checkOut.jsp">계산</a>
	</center>
</body>
</html>