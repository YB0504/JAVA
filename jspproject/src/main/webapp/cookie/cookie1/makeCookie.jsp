<%@ page contentType = "text/html; charset=utf-8" %>
<%@ page import = "java.net.URLEncoder" %>

<%  
	// 쿠키값을 URLEncoder 클래스를 이용해서 인코딩 한다.
	// 쿠키 value값에 한글값이 들어가는 것은 좋은 방법이 아니다.
    Cookie cookie = new Cookie("name", URLEncoder.encode("최범균"));
    response.addCookie(cookie);	// 쿠키 발행
%>

<html>
	<head><title>쿠키생성</title></head>
	<body>

<!-- 한글 value값의 디코딩을 안했기때문에 제대로 출력되지 않는다. -->
<%= cookie.getName() %> 쿠키의 값 = "<%= cookie.getValue() %>"

	</body>
</html>