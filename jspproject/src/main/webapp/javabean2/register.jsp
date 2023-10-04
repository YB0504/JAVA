<%@page import="member.MemberInfo"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.sql.Timestamp"%>
<%@ page contentType = "text/html; charset=utf-8" %>

<%
    request.setCharacterEncoding("utf-8");
%>

<jsp:useBean id="memberInfo" class="member.MemberInfo" />
<jsp:setProperty name="memberInfo" property="*" />
<!-- 입력한 아이디값을 비밀번호 value값으로 전달 -->
<jsp:setProperty name="memberInfo" property="password"
                 value="<%=memberInfo.getId() %>" />
<!-- 입력하지않은 날짜 정보값을 강제로 날짜 value값으로 전달 -->
<!-- setRegisterDate의 매개 변수인 Timestamp로 객체를 생성하여 전달 -->
<jsp:setProperty name="memberInfo" property="registerDate"
                 value="<%=new Timestamp(System.currentTimeMillis()) %>" />
                 
<%
	// 원하는 포맷으로 변경하여 날짜를 출력하기 위해 SimpleDateFormat객체 생성
	SimpleDateFormat sd = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss EEE요일");
%>

<html>
		<head><title>가입</title></head>
		<body>

		<table width="400" border="1" cellpadding="0" cellspacing="0">
			<tr><td>아이디</td>
				<td><jsp:getProperty name="memberInfo" property="id" /></td>
				<td>암호</td>
				<td><jsp:getProperty name="memberInfo" property="password" /></td>
			</tr>
			<tr><td>이름</td>
				<td><jsp:getProperty name="memberInfo" property="name" /></td>
				<td>이메일</td>
				<td><jsp:getProperty name="memberInfo" property="email" /></td>
			</tr>
			<tr><td>주소</td>
				<td colspan="3"><jsp:getProperty name="memberInfo" property="address" /></td>
			</tr>
			<tr><td>날짜</td>
				<!-- sd.format(패키지명.getter메소드 명) -->
				<!-- getProperty를 사용할 수 없다. -->
				<td colspan="3"><%=sd.format(memberInfo.getRegisterDate()) %></td>
			</tr>
		</table>

		</body>
</html>