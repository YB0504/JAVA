<%@ page contentType="text/html;charset=utf-8"%>

<html>
	<body>

	<h1>포함하는 페이지 includeMain.jsp 입니다.</h1>

	<%
		request.setCharacterEncoding("utf-8");
	%>

	<hr>

	<!-- forward와는 다르게 문서를 불러오기 때문에 페이지 안에 내용이 출력된다. -->
	<!-- 불러온 위치에 불려진 파일 전체가 출력된다. -->
	<jsp:include page="includeSub.jsp" flush="false"/>
	includeMain.jsp의 나머지 내용입니다.

	</body>
</html>