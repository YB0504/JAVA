<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%
String id = request.getParameter("id");
%>

<!-- 표현식 태그를 이용해서 변수에 자정된 값을 출력 시킨다. -->
ID :
<%=id%>