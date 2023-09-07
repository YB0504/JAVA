<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	
<!-- header.jsp 파일 불러오기 -->
<%@ include file="header.jsp" %>

<!DOCTYPE html>
<html>

<head>
<meta charset="UTF-8">
<title>로그인 폼</title>
</head>

<body>

	<!-- form 태그의 속성
	1. method : 값을 전달하는 방식을 설정하는 속성 (get, post)
	2. action : 값이 전달될 파일명을 설정하는 속성
	-->

	<form method="post" action="login.jsp">
		<table border="1" width="350" align="center" class="table table-bordered">
			<caption>로그인</caption>
			<!-- caption 태그안의 내용이 표의 위에 나타난다.-->
			<tr>
				<td>ID</td>
				<td>
					<!-- 한줄에 입력할 수 있게 해준다.--> 
					<input type="text" size="20" maxlength="10" autofocus name="id" id="id"
					class="form-control">
				</td>
			</tr>
			<tr>
				<td>비밀번호</td>
				<td>
					<!-- 비밀번호 값이 화면에 노출되지 않는다. --> 
					<input type="password" size="20" required name="passwd" id="passwd" 
					class="form-control">
				</td>
			</tr>
			<tr>
				<td colspan="2" align="center">
				<input type="submit"value="login" class="btn btn-outline-primary"> 
				<!-- submit : 전송기능이 있는 버튼 -->
				<input type="reset" value="cancel" class="btn btn-outline-primary"> 
				<!-- reset : 초기화 버튼 --></td>
			</tr>
		</table>
	</form>



</body>

</html>

<!-- footer.jsp 파일 불러오기 -->
<%@ include file="footer.jsp" %>




