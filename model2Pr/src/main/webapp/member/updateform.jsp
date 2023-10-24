<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원 수정 폼</title>
<script src="http://code.jquery.com/jquery-latest.js"></script>

<script src="http://dmaps.daum.net/map_js_init/postcode.v2.js"></script>
<script>
	function openDaumPostcode() {
		new daum.Postcode({
			oncomplete : function(data) {
				document.getElementById('post').value = data.zonecode;
				document.getElementById('address').value = data.address;
			}
		}).open();
	}
</script>


<!-- 외부 자바스크립트 파일 불러오기 -->
<script src="<%=request.getContextPath() %>/member/member.js"></script>

</head>
<body>
							<!-- 확장자를 잘 찾아가지 못할 때 프로젝트명을 같이 작성한다. -->
<form method="post" action="<%=request.getContextPath() %>/Update.do">
<input type="hidden" name="id" value="${member.id }">
<table border=1 width=500 align=center>
	<caption>회원 정보 수정</caption>
	<tr><td>ID</td>
		<td>${member.id }</td>
	</tr>
	<tr><td>비밀번호</td>
		<td><input type=password id="passwd" name="passwd"></td>
	</tr>
	<tr><td>성명</td>
		<td><input type=text id="name" name="name" value="${member.passwd }"></td>
	</tr>
	<tr><td>주민번호</td>
		<td><input type=text size=6 maxlength=6 id="jumin1" name="jumin1" value="${member.jumin1 }">-
			<input type=text size=7 maxlength=7 id="jumin2" name="jumin2" value="${member.jumin2 }">
		</td>
	</tr>
	<tr><td>E-Mail</td>
		<td><input type=text size=10 id="mailid" name="mailid" value="${member.mailid }">@
		    <input type=text size=10 id="domain" name="domain" value="${member.domain }">
		    <select id="email">
		    	<option value="">직접입력</option>
		    	<option value="naver.com">네이버</option>
		    	<option value="daum.net">다음</option>
		    	<option value="nate.com">네이트</option>
		    	<option value="gmail.com">gmail</option>
		    </select>		    
		 </td>
	</tr>
	<tr><td>우편번호</td>
		<td><input type=text size=5 id="post" name="post" value="${member.post }">
			<input type=button value="우편번호검색" 
			       onClick="openDaumPostcode()">
		</td>
	</tr>
	<tr><td>주소</td>
		<td><input type=text size=45 id="address" name="address" value="${member.address }"></td>
	</tr>
	<tr><td>자기소개</td>
		<td>
			<textarea id="intro" name="intro" rows="5" 
			cols="50" placeholder="자기소개를 100자 이내로 입력하세요">${member.intro }</textarea>
		</td>
	</tr>
	<tr><td colspan=2 align=center>
			<input type=submit value="수정">
			<input type=reset value="취소">
		</td>
	</tr>		
</table>
</form>


</body>
</html>