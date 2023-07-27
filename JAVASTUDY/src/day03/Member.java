package day03;

public class Member {

//	필드 (멤버 변수) : 메소드 바깥 쪽에 정의된 변수
//	클래스 전역에 사용 가능하다
//	객체의 속성을 저장하는 역할
//	클래스로 객체가 생성될때 heap메모리 상에 저장공간이 형성
	private int age;
	String name;
	String email;
	String address;

	public static void main(String[] args) {

//		객체 생성 방식
//		참조형은 대부분 이런 식으로 처리한다.
		int[] i = new int[3];

		String s = new String("자바");

//		주소 값을 m이라는 변수가 가지고 있다.
//		원래는 생성자가 해야하는 역할( 데이터 값 초기화 )
//		다이렉트로 접근이 가능할 때는 생성자가 필요없다.
		Member m = new Member();
		m.age = 25;
		m.name = "홍길동";
		m.email = "naver.com";
		m.address = "서울";

//		출력할 때도 (.)을 이용해서 필드로 접근해야한다.
		System.out.println(m.age);
		System.out.println(m.name);
		System.out.println(m.email);
		System.out.println(m.address);
	}

}
