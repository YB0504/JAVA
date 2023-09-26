<%@ page contentType = "text/html; charset=utf-8" %>
<%@ page isErrorPage = "true" %>
<!-- isErrorPage속성의 값을 true값으로 설정 -->

<html>
<head><title>에러 발생</title></head>
<body>

<br>요청 처리 과정에서 에러가 발생하였습니다.<br>
빠른 시간 내에 문제를 해결하도록 하겠습니다.
<p>
에러 타입: <%= exception.getClass().getName() %> <br>
에러 메시지: <b><%= exception.getMessage() %></b>
</body>
</html>

