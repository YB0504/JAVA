package day01;

//	클래스
public class Member {

//	멤버변수 (필드)
//	: 메소드 바깥 쪽에 정의된 변수
//	heap 메모리상에 값을 저장
//	클래스 . 으로 접근해서 출력할 수 있다.
//	자동으로 해당 자료 값으로 초기화 된다.
	int age;
	double l;
	double r;
	boolean b;

//	1. 생성자는 반드시 클래스와 이름이 동일해야 한다.
//	2. 생성자는 클래스로 객체를 생성할 때 호출된다.
	public Member() { // 생성자
		System.out.println("생성자 호출 성공");
		System.out.println(age);
		System.out.println(l);
		System.out.println(r);
		System.out.println(b);

	}

//	메소드
//	필드값을 출력
	public void print() {
		System.out.println(age);
		System.out.println(l);
		System.out.println(r);
		System.out.println(b);

	}
//	필드값을 수정
	public void setAge(int age) {
		// setters 메소드
		// 매개변수를 통하여 필드 값을 수정,변경 하는 메소드
		this.age = age;
	}
//	필드값을 리턴
	public int getAge() {
		// getters메소드
		// 필드 값을 메소드 호출한 곳에 돌려주는 역할
		// 반드시 return문을 작성하여 각 필드마다 개별적으로 돌려줘야 함
		return age;
	}

//	메인 메소드
	public static void main(String[] args) {

//		String 객체 생성
		String s = new String("자바");
//		new 연산자 : heap메모리 상에 자바라는 객체를 생성하기 위한 
//					기억공간을 생성하라는 의미

		Member m1 		= new   Member();
//		클래스 레퍼런스 변수	 연산자	생성자 호출
//		new 연산자 : heap메모리 상에 필드를 저장하기 위한 
//					기억공간을 생성하라는 의미
		
		m1.print();
		m1.setAge(10);
		int result = m1.getAge();
		System.out.println(result);
		System.out.println(m1.getAge());

	}

}
