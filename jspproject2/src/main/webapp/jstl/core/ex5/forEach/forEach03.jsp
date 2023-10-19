<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix ="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>forEach 태그</title>
</head>
<body>

<h3>int형 배열</h3>
<!-- 배열을 set태그로 변수 지정을 해준다. -->
<c:set var="intArray" value="<%= new int[] {1,2,3,4,5} %>" />

<!-- items속성 : 배열,List를 가지고 있는 변수명이 자리한다. -->
<c:forEach var="i" items="${intArray}">
    ${i}
</c:forEach>

</body>
</html>