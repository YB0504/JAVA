// ID 중복검사
// 팝업창을 띄워서 하는 방식과 띄우지 않고 바로 확인하는 방식이 있다.
// DB연동이 되어 있어야 한다.
function idcheck() {
	var id = document.getElementById('id');
	if (id.value == '') {
		alert('ID를 입력하세요')
		id.focus();
		return false;
	} else {
		// get 방식으로 넘어가기 때문에 ? 작성
		// '문서명 ? 변수명 =' 전달할 값
		var ref = 'idcheck.jsp?id=' + id.value;
		// open('팝업창에 실행될 문서명', '윈도우 이름', '옵션');
		window.open(ref, 'idcheck', 'width=300, height=200');
	}

}


// 주민번호 뒷자리로 focus이동
function move() {
	var jumin1 = document.getElementById('jumin1');
	var jumin2 = document.getElementById('jumin2');

	// 6자리가 입력됬다면 focus이동
	if (jumin1.value.length == 6) {
		jumin2.focus();
	}
}

// 도메인 선택
// 도메인을 직접 입력하는 경우와 선택하는 경우를 나눠서 처리
function sel() {
	var email = document.getElementById('email');
	var domain = document.getElementById('domain');

	if (email.value == "") {		// 직접 입력을 선택한 경우 
		//readOnly 속성 해제
		domain.readOnly = false;
		domain.value = '';
		domain.focus();
	} else {						// 도메인명을 선택한 경우
		domain.value = email.value;
		// 선택한 도메인명이 지워지지 않도록 비활성화
		domain.readOnly = true;
	}
}

// 유효성 검사
function check() {
	var id = document.getElementById('id');
	var passwd = document.getElementById('passwd');
	var name = document.getElementById('name');
	var jumin1 = document.getElementById('jumin1');
	var jumin2 = document.getElementById('jumin2');
	var mailid = document.getElementById('mailid');
	var domain = document.getElementById('domain');
	var tel1 = document.getElementById('tel1');
	var tel2 = document.getElementById('tel2');
	var tel3 = document.getElementById('tel3');
	var phone1 = document.getElementById('phone1');
	var phone2 = document.getElementById('phone2');
	var phone3 = document.getElementById('phone3');
	var post = document.getElementById('post');
	var address = document.getElementById('address');
	var male = document.getElementById('male');
	var female = document.getElementById('female');
	var h1 = document.getElementById('h1');
	var h2 = document.getElementById('h2');
	var h3 = document.getElementById('h3');
	var h4 = document.getElementById('h4');
	var h5 = document.getElementById('h5');
	var intro = document.getElementById('intro');

	if (id.value == '') {
		alert('ID를 입력하세요.');
		id.focus();
		return false;
	}
	if (passwd.value == '') {
		alert('비밀번호를 입력하세요.');
		passwd.focus();
		return false;
	}
	if (name.value == '') {
		alert('성명을 입력하세요.');
		name.focus();
		return false;
	}
	if (jumin1.value == '') {
		alert('주민번호 앞자리를 입력하세요.');
		jumin1.focus();
		return false;
	}
	if (jumin1.value.length != 6) {
		alert('주민번호 앞자리 6자리를 입력하세요.');
		jumin1.value = '';
		jumin1.focus();
		return false;
	}
	// isNaN() : 문자가 포함되면 true값을 리턴
	// 6자리를 입력하였지만 문자가 포함된 경우
	if (isNaN(jumin1.value)) {
		alert('숫자만 입력하세요.');
		jumin1.value = '';
		jumin1.focus();
		return false;
	}
	if (jumin2.value == '') {
		alert('주민번호 뒷자리를 입력하세요.');
		jumin2.focus();
		return false;
	}
	if (jumin2.value.length != 7) {
		alert('주민번호 뒷자리 7자리를 입력하세요.');
		jumin2.value = '';
		jumin2.focus();
		return false;
	}
	if (isNaN(jumin2.value)) {
		alert('숫자만 입력하세요.');
		jumin2.value = '';
		jumin2.focus();
		return false;
	}
	if (mailid.value == '') {
		alert('Email ID를 입력해주세요.');
		mailid.focus();
		return false;
	}
	if (domain.value == '') {
		alert('도메인명을 입력해주세요.');
		domain.focus();
		return false;
	}
	if (tel1.value == '') {
		alert('전화번호 앞자리를 입력해주세요.');
		tel1.focus();
		return false;
	}
	if (isNaN(tel1.value)) {
		alert('숫자만 입력하세요');
		tel1.value = '';
		tel1.focus();
		return false;
	}
	if (tel2.value == '') {
		alert('전화번호 가운데자리를 입력해주세요.');
		tel2.focus();
		return false;
	}
	if (isNaN(tel2.value)) {
		alert('숫자만 입력하세요');
		tel2.value = '';
		tel2.focus();
		return false;
	}
	if (tel3.value == '') {
		alert('전화번호 끝자리를 입력해주세요.');
		tel3.focus();
		return false;
	}
	if (isNaN(tel3.value)) {
		alert('숫자만 입력하세요');
		tel3.value = '';
		tel3.focus();
		return false;
	}
	if (phone1.value == '') {
		alert('핸드폰 번호 앞자리를 선택하세요.');
		phone1.focus();
		return false;
	}
	if (phone2.value == '') {
		alert('핸드폰 번호 가운데자리를 선택하세요.');
		phone2.focus();
		return false;
	}
	if (isNaN(phone2.value)) {
		alert('숫자만 입력하세요');
		phone2.value = '';
		phone2.focus();
		return false;
	}
	if (phone3.value == '') {
		alert('핸드폰 번호 끝자리를 선택하세요.');
		phone3.focus();
		return false;
	}
	if (isNaN(phone3.value)) {
		alert('숫자만 입력하세요');
		phone3.value = '';
		phone3.focus();
		return false;
	}
	if (post.value == '') {
		alert('우편번호를 입력해주세요');
		post.focus();
		return false;
	}
	if (address.value == '') {
		alert('주소를 입력해주세요');
		address.focus();
		return false;
	}
	// checked 속성으로 선택 유무를 구분한다.
	// &&연산자로 아무것도 선택을 하지 않았을 경우
	if (male.checked == false && female.checked == false) {
		alert('성별을 선택해주세요.');
		return false;
	}
	// checkbox를 2개 이상 선택해야만 하도록 설정
	var cnt = 0;
	// 해당 체크박스가 선택되면 cnt변수값이 1씩 증가 시킨다.
	if (h1.checked) cnt++;
	if (h2.checked) cnt++;
	if (h3.checked) cnt++;
	if (h4.checked) cnt++;
	if (h5.checked) cnt++;

	if (cnt < 2) {
		alert('취미를 2개 이상 선택하세요.');
		return false;
	}
	if (intro.value == '') {
		alert('자기소개를 작성해주세요.');
		intro.focus();
		return false;
	}
	if (intro.value.length > 100) {
		alert('100자 이내로 작성해주세요');
		intro.focus();
		return false;
	}
}