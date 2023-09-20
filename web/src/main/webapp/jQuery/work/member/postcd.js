function openDaumPostcode() {
	new daum.Postcode({
		oncomplete: function(data) {	// 콜백 함수(검색한 우편번호와 주소를 부모창으로 돌려준다.)
			document.getElementById('post').value = data.zonecode;	// zonecode 속성(우편번호)
			document.getElementById('address').value = data.address;	// address 속성(주소)
		}
	}).open();	// 팝업창을 띄운다.
}