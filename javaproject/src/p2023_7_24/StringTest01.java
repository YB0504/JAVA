package p2023_7_24;

class StringTest01 {

//	String 클래스
//	1. String 객체를 생성한 후에 메소드에 의해서 값의 변화가 일어나면
//	   변경된 값을 heap메모리 영역에 다시 저장한다.
//	2. heap 메모리 영역에 변경된 값을 재사용 하기 위해서는 새로운 변수로
//	   변경된 값을 저장해서 사용해야 한다.
//	3. heap 메모리 영역에 변경된 값을 재사용 할 수 없을 경우에는
// 	   쓰레기로 인식하고 heap 메모리 영역의 데이터를 가비지 콜렉터 프로그램이 모아서 지워버린다.
//	4. Garbage Collection 기능(쓰레기 수집 기능)
//	   재사용 할 수 없는 heap 메모리 영역의 데이터를 모아서 지워주는 역할

	public static void main(String[] args) {

//	toUpperCase() : 문자를 대문자로 변환해주는 역할
//	toLowerCase() : 문자를 소문자로 변환해주는 역할

		String str1 = "Java Programming";

		str1.toUpperCase(); // 메서드 호출 후에도
		System.out.println(str1); // str1의 내용은 수정되지 않는다.
		System.out.println(str1.toUpperCase());

		String str2 = str1.toUpperCase(); // 메소드의 처리 결과를 str2에 저장
		System.out.println(str2);
	}
}