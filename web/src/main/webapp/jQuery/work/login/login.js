$(document).ready(function() {
	$('form').submit(function() {
		// $.trim함수로 문자열 좌우의 공백을 없앤다.
		if ($.trim($('#id').val()) == '') {
			alert('ID를 입력하세요.');
			$('#id').focus();
			return false;
		}
		if ($.trim($('#passwd').val()) == '') {
			alert('비밀번호를 입력하세요.');
			$('#passwd').focus();
			return false;
		}
	});
});