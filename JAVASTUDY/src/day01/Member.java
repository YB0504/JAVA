package day01;

//	클래스
public class Member {

//	멤버변수 (필드)
//	: 메소드 바깥 쪽에 정의된 변수
//	heap 메모리상에 값을 저장
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

//	메인
//	필드값을 출력
	public void print() {
		System.out.println(age);
		System.out.println(l);
		System.out.println(r);
		System.out.println(b);

	}
//	필드값을 수정
	public void setAge(int age) {
		this.age = age;
	}
//	필드값을 리턴
	public int getAge() {
		return age;
	}

//	메인 메소드
	public static void main(String[] args) {

//		String 객체 생성
		String s = new String("자바");
//		new 연산자 : heap메모리 상에 자바라는 객체를 생성하기 위한 
//					기억공간을 생성하라는 의미

		Member m1 		= new   Member();
//		클래스 레퍼언스 변수	 연산자	생성자 호출
//		new 연산자 : heap메모리 상에 age필드를 저장하기 위한 
//					기억공간을 생성하라는 의미
		
		m1.print();
		m1.setAge(10);
		int result = m1.getAge();
		System.out.println(result);
		System.out.println(m1.getAge());

	}

}
