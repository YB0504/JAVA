<%@ page contentType = "text/html; charset=utf-8" %>
<%@ page import = "java.net.URLEncoder" %>

<%
    Cookie[] cookies = request.getCookies();	// 클라이언트에 저장된 쿠키정보 읽어오기
    if (cookies != null && cookies.length > 0) {
        for (int i = 0 ; i < cookies.length ; i++) {

        	// 쿠키 삭제
        	// 쿠키의 name값을 그전의 쿠키와 똑같이 설정하고
        	// value값을 null값으로 설정하고 시간 설정을 
        	// 0으로 설정하면 발행되자마자 삭제된다.
            if (cookies[i].getName().equals("name")) {
                Cookie cookie = new Cookie("name", "");
                cookie.setMaxAge(0);
                response.addCookie(cookie);
            }//if end

        }//for end
    }
%>

<html>
	<head><title>쿠키 삭제</title></head>
	<body>
		name 쿠키를 삭제합니다.
	</body>
</html>
