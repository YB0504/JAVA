$(document).ready(function() {

	// ID 중복검사
	$("#idcheck").click(function() {
		if ($("#id").val() == "") {
			alert("ID를 입력 하세요.");
			$("#id").focus();
			return false;
		} else {

			var id = $("#id").val();

			$.ajax({
				type: "post",
				url: "/model2Pr/Idcheck.do",
				data: { "id": id },
				success: function(data) {
					alert(data);

					if (data == 1) {	// 중복 ID
						$("#myid").text("중복 ID입니다.");
						$("#id").val("").focus();
					} else {			// 사용 가능한 ID
						$("#myid").text("사용 가능한 ID입니다.");
						$("#passwd").focus();
					}
				}

			}); // $.ajax() end

		}// else end	

	});

	// 주민번호 뒷자리로 포커스 이동
	$("#jumin1").keyup(function() {

		if ($("#jumin1").val().length == 6)
			$("#jumin2").focus();
	});

	// 도메인 선택
	$("#email").change(function() {
		if ($("#email").val() == "") {	// 직접 입력 선택	
			//			$("#domain").attr("readonly", false);
			$("#domain").removeAttr("readonly");
			$("#domain").val("").focus();
		} else {							// 도메인명 선택
			$("#domain").val($("#email").val());
			$("#domain").attr("readonly", "readonly");
		}
	});

	// 유효성 검사
	$("form").submit(function() {

		if ($("#id").val() == "") {
			alert("ID를 입력하세요");
			$("#id").focus();
			return false;
		}
		if ($("#passwd").val() == "") {
			alert("비밀번호를 입력하세요");
			$("#passwd").focus();
			return false;
		}
		if ($("#name").val() == "") {
			alert("이름을 입력하세요");
			$("#name").focus();
			return false;
		}
		if ($("#jumin1").val() == "") {
			alert("주민번호 앞자리를 입력하세요");
			$("#jumin1").focus();
			return false;
		}
		if ($("#jumin1").val().length != 6) {
			alert("주민번호 앞자리 6자리 입력하세요");
			$("#jumin1").val("").focus();
			return false;
		}
		if (isNaN($("#jumin1").val())) {
			alert("숫자만 입력하세요");
			$("#jumin1").val("").focus();
			return false;
		}
		if ($("#jumin2").val() == "") {
			alert("주민번호 뒷자리를 입력하세요");
			$("#jumin2").focus();
			return false;
		}
		if ($("#jumin2").val().length != 7) {
			alert("주민번호 뒷자리 7자리 입력하세요");
			$("#jumin2").val("").focus();
			return false;
		}
		if (isNaN($("#jumin2").val())) {
			alert("숫자만 입력하세요");
			$("#jumin2").val("").focus();
			return false;
		}
		if ($("#mailid").val() == "") {
			alert("EMail 주소를 입력하세요");
			$("#mailid").focus();
			return false;
		}
		if ($("#domain").val() == "") {
			alert("도메인을 입력하세요");
			$("#domain").focus();
			return false;
		}

		if ($("#post").val() == "") {
			alert("우편번호를 입력하세요");
			$("#post").focus();
			return false;
		}
		if ($("#address").val() == "") {
			alert("주소를 입력하세요");
			$("#address").focus();
			return false;
		}

		if ($("#intro").val() == "") {
			alert("자기소개를 입력하세요");
			$("#intro").focus();
			return false;
		}
		if ($("#intro").val().length > 100) {
			alert("자기소개를 100자 이내로 입력하세요");
			$("#intro").focus();
			return false;
		}

	}); // submit() end		

});  // ready() end