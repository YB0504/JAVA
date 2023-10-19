<%@ page language="java" contentType="text/html; charset=utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql" %>

<html>
<head>
<title>sql 라이브러리 예제</title>
</head>
<body>

<sql:setDataSource var="conn" driver="oracle.jdbc.driver.OracleDriver" 
				url="jdbc:oracle:thin:@localhost:1521:xe"
				user="scott" 
				password="tiger"/>

<!-- executeUpdate SQL 실행문과 같은 역할 -->
<sql:update dataSource="${conn}">
	INSERT INTO test (num, name) VALUES (1, '홍길동')
</sql:update>
<sql:update dataSource="${conn}">
	INSERT INTO test (num, name) VALUES (2, '김길동')
</sql:update>
<sql:update dataSource="${conn}">
	INSERT INTO test (num, name) VALUES (3, '홍길동')
</sql:update>
<sql:update dataSource="${conn}">
	INSERT INTO test (num, name) VALUES (4, '홍길순')
</sql:update>

<!-- executeQuery SQL 실행문과 같은 역할 -->
<!-- select로 검색한 결과를 받기 위해 변수를 Resultset rs로 설정 -->
<sql:query var="rs" dataSource="${conn}">
	SELECT * FROM test WHERE name=?
	<sql:param>홍길동</sql:param>
</sql:query>

<c:forEach var="data" items="${rs.rows}">
	<c:out value="${data['num']}"/>
	<c:out value="${data['name']}"/>
	<br>
</c:forEach>

</body>
</html>
