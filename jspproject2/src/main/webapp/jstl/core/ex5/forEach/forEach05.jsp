<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix ="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="java.util.List"%>
<%@ page import="java.util.ArrayList"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>forEach 태그</title>
</head>
<body>

<h3>List 객체</h3>

<%
	List list = new ArrayList();
	list.add("자바");
	list.add("웹표준");
	list.add("JSP");
	list.add("오라클");
	list.add("스프링");
	list.add("파이썬");
	list.add("텐스플로우");
	list.add("케라스");
	
	request.setAttribute("slist", list);	// 공유 설정
%>

<!-- 제시된 list를 바로 forEach에 전달하면 값을 출력할 수 없다 -->

<!-- 방법1 -->
<!-- list값를 set태그로 새로운 변수에 저장한다. -->
<c:set var="s1" value="<%=list%>"/>
<c:forEach var="s2" items="${s1}">
    ${s2} <br>  
</c:forEach>
<br><br>

<!-- 방법2 -->
<!-- request객체로 공유된 name값을 items속성에 할당한다. -->
<%-- <c:forEach var="s" items="${requsetScope.slist}"> --%>
<c:forEach var="s" items="${slist}">
    ${s} <br>
</c:forEach>
<br><br>

</body>
</html>