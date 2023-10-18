<%@page import="model.Product"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<% request.setCharacterEncoding("utf-8"); %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>EL 예제</title>
</head>
<body>
	<div align="center">
		<h2>EL 예제-상품선택</h2>
		<hr>
		<!-- 표현언어 -->
		1. 선택한 상품은 : ${param.sel} <br>
		
		<!-- 표현식 태그 -->
		1. 선택한 상품은 : <%=request.getParameter("sel") %> <br>
		
		<!-- 표현언어 -->
		<!-- session객체로 공유한 name값으로 session값을 구해온다. -->
		<!-- sessionScope.공유한 session name.호출할 프로퍼티명 -->
		2. num1 + num2 = ${product.num1 + product.num2} <br>
		3. num1 + num2 = ${sessionScope.product.num1 + sessionScope.product.num2} <br>
		
		<!-- 표현식 태그 -->
		<%
			// 공유된 값을 받기위해서 Object형으로 돌려준 값을
			// 받는 자료형으로 다운 캐스팅 해야 사용할 수 있다.
			Product pro = (Product)session.getAttribute("product");
		%>
		
		3. num1 + num2 = <%=pro.getNum1() + pro.getNum2() %> <br>
		
	</div>
</body>
</html>