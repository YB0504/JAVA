$(document).ready(function() {
	$("#idcheck").click(function() {
		if ($('#id').val() == '') {
			alert('ID를 입력하세요.')
			$('#id').focus();
			return false;
		} else {
			var idc = 'idcheck.jsp?id=' + $('#id').val();
			open(idc, 'myWin', 'width=400, height=300');
		}
	});
	$('#email').change(function() {
		if ($('#email').val() == '') {
			$('#domain').val('').focus();
			$('#domain').removeAttr('readonly');
		} else {
			$('#domain').val($('#email').val());
			$('#domain').attr('readonly', true);
		}
	});

	$('form').submit(function() {
		if ($('#id').val() == '') {
			alert('ID를 입력하세요.');
			$('#id').focus();
			return false;
		}
		if ($('#passwd').val() == '') {
			alert('비밀번호를 입력하세요.');
			$('#passwd').focus();
			return false;
		}
		if ($('#name').val() == '') {
			alert('성명을 입력하세요.');
			$('#name').focus();
			return false;
		}
		if ($('#mailid').val() == '') {
			alert('이메일 ID를 입력하세요.');
			$('#mailid').focus();
			return false;
		}
		if ($('#domain').val() == '') {
			alert('이메일 주소를 입력하세요.');
			$('#domain').focus();
			return false;
		}
		if ($('#phone1').val() == '') {
			alert('핸드폰번호 앞자리를 선택하세요.');
			$('#phone1').focus();
			return false;
		}
		if ($('#phone2').val() == '') {
			alert('핸드폰번호 가운데자리를 입력하세요.');
			$('#phone2').focus();
			return false;
		}
		if (isNaN($('#phone2').val())) {
			alert('숫자만 입력하세요.');
			$('#phone2').val('').focus();
			return false;
		}
		if ($('#phone3').val() == '') {
			alert('핸드폰번호 뒷자리를 입력하세요.');
			$('#phone3').focus();
			return false;
		}
		if (isNaN($('#phone3').val())) {
			alert('숫자만 입력하세요.');
			$('#phone3').val('').focus();
			return false;
		}
		if ($(':radio').is(':checked') == false) {
			alert('성별을 선택하세요.');
			return false;
		}
		if ($("input:checkbox[name='hobby']:checked").length < 2) {
			alert('취미를 2개 이상 선택하세요.');
			return false;
		}
		if ($('#intro').val() == '') {
			alert('자기소개를 입력하세요.');
			$('#intro').focus();
			return false;
		}
		if ($('#intro').val().length > 100) {
			alert('자기소개를 100자 이내로 입력하세요.');
			$('#intro').focus();
			return false;
		}
	})
})