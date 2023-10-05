<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ page import="register.LogonDBBean" %>  
<%@ page import="register.LogonDataBean" %>  
<%@ page import="java.util.*" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>회원 목록</title>
</head>
<body>
<a href="registerForm.jsp">회원가입</a>

<table align=center width=1000 border=1>
	<tr><td>ID</td> 
		<td>비밀번호</td>
		<td> 이름 </td>
		<td> 주민번호 </td>
		<td> 이메일 </td>
		<td> BLOG </td>
		<td> 가입일 </td>
		<td>수정</td>
		<td>삭제</td>
	</tr>

<%

	//DAO클래스 내부의 메소드를 호출하여 DAO객체 생성
	// DAO클래스를 사용하기 위해 반드시 import하여야 한다.
	LogonDBBean manager = LogonDBBean.getInstance();

	// 전체 회원 목록을 검색
	// 매개변수로 전달할 값이 없기 때문에 매개변수는 필요없다.
	// 값을 리스트로 돌려주기 때문에 List로 값을 돌려줘야 한다.
	// 제네릭을 사용하여 DTO클래스 내부의 자료만 사용한다.
	List<LogonDataBean> li = manager.selectMember();


	for(int i = 0; i < li.size(); i++) {
		// Object get(int index)
		// 제네릭을 사용하기 때문에 다운캐스팅을 생략할 수 있다.
		LogonDataBean db = (LogonDataBean)li.get(i);
%>

	<tr><td><%=db.getId()%></td>
		<td><%=db.getPasswd()%></td>
		<td><%=db.getName()%></td>
		<td><%=db.getJumin1()%> - <%=db.getJumin2()%> </td>
		<td><%=db.getEmail()%></td>
		<td><%=db.getBlog()%></td>
		<td><%=db.getReg_date()%></td>
		<td><a href="updateForm.jsp?id=<%=db.getId()%>">수정</a></td>
		<td><a href="deleteForm.jsp?id=<%=db.getId()%>">삭제</a></td>
	</tr>
<% 
	}
%>

</table>
</body>
</html>