<%@ page contentType="text/html;charset=utf-8"%>

<html>
	<body>

	<h2>포워딩하는 페이지: forwardTagFrom2.jsp</h2>

<%
   request.setCharacterEncoding("utf-8");

   String name = request.getParameter("name");
   String selectedColor = request.getParameter("color");
%>

<!-- 선택한 색깔 페이지로 이동한다. -->
<!-- 입력된 값을 이동할 페이지로 가지고 이동한다. -->
<jsp:forward page="<%=selectedColor+\".jsp\"%>">
	<!-- jsp:param으로 넘어가는 값을 받을 때도 
	request.getParameter()를 이용하여 받는다. -->
    <jsp:param name="selectedColor" value="<%=selectedColor%>"/>
	<jsp:param name="name" value="<%=name%>"/>
</jsp:forward>