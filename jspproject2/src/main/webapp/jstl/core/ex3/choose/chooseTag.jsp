<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<!-- 
	다중 조건식 : choose 태그
	1. 조건식을 만들 때는 if태그 대신 when태그로 조건식을 만든다.
	2. when조건식이 모두 참이더라도 가장 먼저 만족하는 조건식 아래의 문장만 
	   실행하고 식을 빠져 나간다.
	3. 모든 조건식을 만족하지 않을 때는 otherwise 아래의 문장을 실행한다.
--> 
	<ul>
		<!-- 처음 만족하는 조건식 아래의 문장만 실행한다. -->
		<!-- when조건을 모두 만족하지 않으면 otherwise아래의 문장을 실행한다. -->
		<c:choose>
			<c:when test="${param.name == 'toto'}">
				<li>이름 : ${param.name }</li>
			</c:when>
			<c:when test="${param.age >= 20 }">
				<li>나이 : ${param.age }</li>
			</c:when>
			<c:otherwise>
				<li>당신의 이름은 toto가 아니고, 20세 미만입니다.</li>
			</c:otherwise>
		</c:choose>
	</ul>

</body>
</html>
