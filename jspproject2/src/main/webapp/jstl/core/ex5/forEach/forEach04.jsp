<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix ="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="java.util.Map" %>
<%@ page import="java.util.HashMap"%>
<%@ page import="java.util.Date"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>forEach 태그</title>
</head>
<body>

<%
    HashMap hm = new HashMap();
	// key, value
    hm.put("num", "1");
    hm.put("today", new Date());
%>

<c:set var="map" value="<%= hm %>" />

<h3>Map 객체</h3>
<c:forEach var="i" items="${map}">
	<!-- key값과 value 값을 각각 가져와서 출력할 수 있다. -->
    ${i.key} = ${i.value}<br>
</c:forEach>

</body>
</html>