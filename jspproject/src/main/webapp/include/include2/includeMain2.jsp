<%@ page contentType="text/html;charset=utf-8"%>

<html>
	<body>
	
	<h2>includeMain2.jsp 페이지 입니다</h2>

	<%
		request.setCharacterEncoding("utf-8");
		String siteName1 = request.getParameter("siteName1");
	%>

	<hr>
	
	<!-- 불러오는 파일에 값을 전달하여 불러온다. -->
	<jsp:include page="includeSub2.jsp">
		<jsp:param name="siteName" value="<%=siteName1%>"/>
	</jsp:include>

	includeMain2.jsp 페이지의 나머지 내용입니다.<p>

	</body>
</html>