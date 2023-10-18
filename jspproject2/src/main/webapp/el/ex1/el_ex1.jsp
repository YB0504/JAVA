<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>산술연산자</title>
</head>
<body>

<h3>표현언어의 산술연산자</h3>
<table border="1" width="400">
	<tr>
		<th>표현식</th>
		<th>값</th>
	</tr>
	<tr><!-- 더하기 -->
	<!-- \다음의 문자들은 문자로 처리하여 연산을 처리하지 않는다. -->
		<td>\${10+20}</td>
		<td>${10+20}</td>
	</tr>
	<tr><!-- 빼기 -->
		<td>\${10-20}</td>
		<td>${10-20}</td>
	</tr>
	<tr><!-- 곱하기 -->
		<td>\${10*20}</td>
		<td>${10*20}</td>
	</tr>
	<!-- 기존 자바와 다르게 int형끼리 나누어도 실수형으로 결과가 나온다. -->
	<tr><!-- 나누기 -->
		<td>\${10/20}</td>	<!-- 0.5 -->
		<td>${10/20}</td>
	</tr>
	<tr><!-- 나누기 -->
		<td>\${10 div 20}</td>
		<td>${10 div 20}</td>
	</tr>
	<tr><!-- 나머지 -->
		<td>\${10 % 20}</td>
		<td>${10 % 20}</td>
	</tr>
	<tr><!-- 나머지 -->
		<td>\${10 mod 20}</td>
		<td>${10 mod 20}</td>
	</tr>
</table>

</body>
</html>