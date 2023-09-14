function check() {
	var id = document.getElementById('id');
	var passwd = document.getElementById('passwd');

	// 유효성 검사
	if (id.value == '') {
		alert('아이디를 입력하세요.');
		id.focus();
		return false;
	}
	if (passwd.value == '') {
		alert('비밀번호를 입력하세요.');
		passwd.focus();
		return false;
	}
}