package p2023_7_20;

class Korean { // 필드
	String nation = "대한민국";
	String name;
	String ssn;

//	public Korean(String n, String s) { // 생성자
//		// 반드시 클래스와 이름이 동일해야 한다.
//		// 매개변수의 초기 값 설정
//		name = n;
//		ssn = s;
	public Korean(String name, String ssn) { // 생성자
		this.name = name;
		this.ssn = ssn;
	}
}

public class KoreanEx {

	public static void main(String[] args) {
		Korean k1 = new Korean("박자바", "011225-1234567");
		// 				생성자 호출 (필드 값을 초기화)
		System.out.println("k1.name : " + k1.name);
		// 							 k1이 가진 주소를 통해서 접근
		System.out.println("k1.ssn : " + k1.ssn);

		Korean k2 = new Korean("김자바", "930525-1234567");
		System.out.println("k2.name : " + k2.name);
		System.out.println("k2.ssn : " + k2.ssn);

	}

}
