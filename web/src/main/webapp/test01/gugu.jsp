<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%
int gugudan = Integer.parseInt(request.getParameter("gugu"));
%>
<%="구구단 " + gugudan + "단"%><br>
<br>

<%
for (int i = 1; i <= 9; i++) {
	out.println(gugudan + " * " + i + " = " + gugudan * i);
	out.print("<br>");
}
%>




