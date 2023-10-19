<%@ page contentType = "text/html; charset=utf-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head><title>forTokens 태그</title></head>
<body>

콤마와 점을 구분자로 사용:<br>
<!-- 구분기호가 혼용되어도 데이터를 자를 수 있다. -->
<!-- delims 속성 : 기준이 될 구분기호를 작성한다. -->
<c:forTokens var="token" 
             items="빨강색,주황색.노란색.초록색,파랑색,남색.보라색"
             delims=",.">
${token} 
</c:forTokens>

</body>
</html>
