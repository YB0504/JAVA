package p2023_07_26;

public class WrapperEx1 {

	public static void main(String[] args) {

		// Integer클래스는 기본 생성자를 지원하지 않기 때문에
		// 기본 생성자를 Integer 객체를 생성하면 오류가 발생한다.
//		Integer num = new Integer(); // 오류 발생

		// 박싱 (boxing) : heap 메모리를 박스로 생각하고, stack메모리에 저장된 10을
		// heap 메모리에 복사하는 것(박스에 집어 넣는다)
		// 주로 Integer객체를 생성할 때 일어난다.
		int n = 10; // 지역 변수
		Integer num01 = new Integer(n); // 박싱(boxing)

		// 언박싱(unboxing) : heap 메모리(박스)에 있는 데이터를 stack메모리 영역으로 가져오는 것.
		int n01 = num01.intValue(); // 언박싱(unboxing)
		// 객체 . inValue메소드(자료형에 따라 다른 메소드 사용)

		// 자료형 변환 : "20" --> 20
		String s = "20"; // heap 메모리 상에 저장되어 있다.
		Integer num02 = new Integer(s); // 박싱

		int n02 = num02.intValue(); // 언박싱

	}

}
