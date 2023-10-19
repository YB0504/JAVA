<%@ page contentType = "text/html; charset=utf-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ page import="java.util.Date"%>

<html>
<head><title>formatDate 태그</title></head>
<body>

<c:set var="now" value="<%= new Date() %>" />
현재 날짜 : ${now }<br>

<!-- 
	type : 출력할 포맷
	dateStyle : 날짜에 대한 자세한 설정
	timeStyle : 시간에 대한 자세한 설정
	pattern : 원하는 포맷으로 날짜,시간을 출력
-->
<fmt:formatDate value="${now}"/><br>
<fmt:formatDate value="${now}" type="date" dateStyle="full" /><br>
<fmt:formatDate value="${now}" type="date" dateStyle="short" /><br>
<fmt:formatDate value="${now}" type="time" /><br>
<fmt:formatDate value="${now}" type="both" 
                dateStyle="full" timeStyle="full" /><br>
<fmt:formatDate value="${now}" pattern="z a h:mm" /><br>

<!-- 12시간제 날짜,시간 출력 -->
<fmt:formatDate value="${now }" pattern="yyyy-MM-dd a hh:mm:ss EEE요일"/>
<br><br>

<!-- 24시간제 날짜, 시간 출력-->
<fmt:formatDate value="${now }" pattern="yyyy-MM-dd HH:mm:ss EEE요일"/>

<!-- 
2023. 10. 19.
2023년 10월 19일 목요일
23. 10. 19.
오전 11:05:00
2023년 10월 19일 목요일 오전 11시 5분 0초 대한민국 표준시
KST 오전 11:05
2023-10-19 오전 11:05:00 목요일

2023-10-19 11:05:00 목요일 
-->

</body>
</html>
