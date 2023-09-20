$(function() {
	$('form').submit(function() {
		if ($('#writer').val() == '') {
			alert('작성자명을 입력하세요.');
			$('#writer').focus();
			return false;
		}
		if ($('#passwd').val() == '') {
			alert('비밀번호를 입력하세요.');
			$('#passwd').focus();
			return false;
		}
		if ($('#passwd').val().length < 2 || $('#passwd').val().length > 8) {
			alert('2 ~ 8 이내의 비밀번호를 입력하세요.');
			$('#passwd').val('').focus();
			return false;
		}
		if ($('#subject').val() == '') {
			alert('제목을 입력하세요.');
			$('#subject').focus();
			return false;
		}
		// maxlength속성으로 html상에서 처리할 수도 있다.
		if ($('#subject').val().length > 50) {
			alert('50자 이내로 입력하세요.');
			$('#subject').val('').focus();
			return false;
		}
		if ($('#content').val() == '') {
			alert('내용을 입력하세요.');
			$('#content').focus();
			return false;
		}
		if ($('#content').val().length > 200) {
			alert("200자 이내로 입력하세요.");
			$('#content').focus();
			return false;
		}
	});
});