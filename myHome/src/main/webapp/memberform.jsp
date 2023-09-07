<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	
<!-- header.jsp 파일 불러오기 -->
<%@ include file="header.jsp" %>

<!DOCTYPE html>
<html>

<head>
<meta charset="UTF-8">
<title>회원 가입 폼</title>
</head>

<body>
	<form method="post" action="member.jsp">
		<table border="1" width="600" align="center">
			<caption>회원가입</caption>
			<tr>
				<th>ID</th>
				<td><input type="text" name="id" id="id" autofocus> <input
					type="button" value="ID중복검사"></td>
			</tr>
			<tr>
				<th>비밀<br>번호
				</th>
				<td><input type="password" name="passwd" id="passwd"></td>
			</tr>
			<tr>
				<th>성명</th>
				<td><input type="text" name="name" id="name"></td>
			</tr>
			<tr>
				<th>주민<br>번호
				</th>
				<td><input type="text" size="6" maxlength="6" name="jumin1"
					id="jumin1"> - <input type="text" size="7" maxlength="7"
					name="jumin2" id="jumin2"></td>
			</tr>
			<tr>
				<th>이메일</th>
				<td><input type="text" size="10" name="mailid" id="mailid">
					@ <input type="text" size="15" name="domain" id="domain"> <select>
						<option value="">직접입력</option>
						<option value="naver.com">네이버</option>
						<option value="daum.net">다음</option>
						<option value="nate.com">네이트</option>
						<option value="gmail.com">구글</option>
				</select></td>
			</tr>
			<tr>
				<th>전화<br>번호
				</th>
				<td><select name="phone1" id="phone1">
						<option value="">번호 선택</option>
						<option value="02" selected>02</option>
						<option value="031">031</option>
						<option value="032">032</option>
						<option value="042">042</option>
						<option value="044">044</option>
				</select> <input type="text" size="4" maxlength="4" name="tel2" id="tel2">
					- <input type="text" size="4" maxlength="4" name="tel3" id="tel3">
				</td>
			</tr>
			<tr>
				<th>핸드폰</th>
				<td><select name="phone1" id="phone1">
						<option value="">번호 선택</option>
						<option value="010" selected>010</option>
						<option value="011">011</option>
						<option value="016">016</option>
						<option value="018">018</option>
						<option value="019">019</option>
				</select> <input type="text" size="4" maxlength="4" name="phone2" id="phone2">
					- <input type="text" size="4" maxlength="4" name="phone3"
					id="phone3"></td>
			</tr>
			<tr>
				<th>우편<br>번호
				</th>
				<td><input type="text" size="5" maxlength="5" name="post"
					id="post"> <input type="button" value="우편번호검색"></td>
			</tr>
			<tr>
				<th>주소</th>
				<td><input type="text" size="70" name="address" id="address">
				</td>
			</tr>
			<tr>
				<th>성별</th>
				<td><input type="radio" name="gender" value="남성" checked>남성
					<input type="radio" name="gender" value="여성">여성</td>
			</tr>
			<tr>
				<th>취미</th>
				<td>
					<!-- name값이 없어도 되고 동일하지 않아도 된다. --> <input type="checkbox"
					name="hobby" value="독서">독서 <input type="checkbox"
					name="hobby" value="등산">등산 <input type="checkbox"
					name="hobby" value="게임">게임 <input type="checkbox"
					name="hobby" value="운동">운동 <input type="checkbox"
					name="hobby" value="낚시">낚시 <input type="checkbox"
					name="hobby" value="쇼핑">쇼핑
				</td>
			</tr>
			<tr>
				<th>자기<br>소개
				</th>
				<td><textarea rows="5" cols="70" name="intro" id="intro"
						placeholder="100자 이내로 입력하세요."></textarea></td>
			</tr>
			<tr>
				<td colspan="2" align="center"><input type="submit"
					value="회원가입"> <input type="reset" value="취소"> <!-- 이미지 버튼 : 전송기능을 가지고 있다. -->
					<input type="image" src="img/clock.jpg" width="30"></td>
			</tr>
		</table>
	</form>

</body>

</html>

<!-- footer.jsp 파일 불러오기 -->
<%@ include file="footer.jsp" %>


