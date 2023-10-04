<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%
	request.setCharacterEncoding("utf-8");
%>

<jsp:useBean id="member" class="member.MemberDataBean"/>
<!-- setProperty의 name값은 useBean의 id와 같은 값을 작성해야한다. -->
<jsp:setProperty property="*" name="member"/>

getProperty 사용 방식<br>
ID : <jsp:getProperty property="id" name="member"/><br>
password : <jsp:getProperty property="passwd" name="member"/><br><br>

<!-- 직접 getter메소드를 호출해서 사용하는 방식이 더 많이 사용된다. -->
getter메소드 직접 호출 방식<br>
ID : <%=member.getId() %><br>
password : <%=member.getPasswd()%>