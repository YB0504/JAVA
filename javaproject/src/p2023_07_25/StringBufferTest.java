package p2023_07_25;

public class StringBufferTest {
	public static void main(String[] args) {

		// StringBuffer 객체 생성
		StringBuffer sb1 = new StringBuffer("gemini"); // String형 매개변수 생성자
		System.out.println("sb1.length() : " + sb1.length());
		// heap메모리상에 생성된 공간의 크기
		System.out.println("sb1.capacity() : " + sb1.capacity());

		// 새로운 값 추가
		sb1.append("A string buffer implements" + "a mutable sequence of characters");
		// 메모리 상의 공간이 동적으로 늘어난다.
		System.out.println("sb1.length() : " + sb1.length());
		System.out.println("sb1.capacity() : " + sb1.capacity());

		// StringBuffer의 기본생성자는 16글자가 저장될 공간을 자동 생성한다.
		StringBuffer sb2 = new StringBuffer();
		System.out.println("sb2.length() : " + sb2.length());
		System.out.println("sb2.capacity() : " + sb2.capacity());
	}
}
