<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>EL 예제</title>
</head>
<body>

<div align="center">
	<h2>EL 예제</h2>
	<hr>
	<form method="post" action="productSel.jsp">
	     
	     <%-- 
	     	  1. DTO객체(product)를 생성해서 세션에 저장하라는 의미
	          2. Product product = new Product();
	             session.setAttribute( "product", product );
	      --%>
	    <!-- 
	    	 scope 속성 = 네가지 영역명(생략시 기본값은 page영역) 
	    	 영역 공유 설정 
	    -->
		<jsp:useBean id="product" class="model.Product" scope="session"/>
		<select name="sel">
			<%
			   // option태그에 value값이 없다면 태그사이의 값이 sel값으로 전달된다.
			   for(String item : product.getProductList()) {
				 	out.println("<option>" + item + "</option>");
			   }
			%>
		</select>
		<input type="submit" value="선택">
	</form>
</div>

</body>
</html>