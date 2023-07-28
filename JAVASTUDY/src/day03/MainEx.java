package day03;


// DTO (Data Transfer Object) 데이터 전송 객체
class Member2 {

	// 접근제어자가 private인 필드
	// 캠슐화 ( 객체 지향 언어가 가지는 특징 )

// 1. 필드는 Member2 클래스로 객체를 생성할 때 heap메모리상에 공간을 할당
//	  받아서 값을 저장하는 역할
	private int age;
	private String name;
	private String email;
	private String address;

	public Member2() { // 기본 생성자

	}

	// 매개 변수를 가진 생성자

// 1. 생성자는 클래스와 동일한 이름으로 만들어야 한다.
// 2. 생성자는 객체를 new연산자로 생성할 때	호출 되면서 필드값을 초기화
	public Member2(int age, String name, String email, String address) {
//		각각의 필드에 매개변수를 통해서 값을 할당
		this.age = age;
		this.name = name;
		this.email = email;
		this.address = address;
	}

//	print 메소드
//  출력하는 역할이기 때문에 값을 돌려주지 않아도 된다.
	public void print() {
		System.out.println(age);
		System.out.println(name);
		System.out.println(email);
		System.out.println(address);
	}

//	getters 메소드
//	메소드를 호출한 곳에 값을 돌려주는 역할
	public int getAge() {
		return age;
	}

	public String getName() {
		return name;
	}

	public String getEmail() {
		return email;
	}

	public String getAddress() {
		return address;
	}

//	setters 메소드
//  매개 변수로 전달된 값을 필드 값으로 수정해주는 역할
	public void setAge(int age) {
		this.age = age;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setAddress(String address) {
		this.address = address;
	}

}

public class MainEx {

	public static void main(String[] args) {

		Member2 m = new Member2();
//		m.age = 25; 
//		필드의 접근제어자가 private로 되어있기 때문에 
//		외부 클래스에서 직접 접근할 수 없다.

		Member2 m1 = new Member2(25, "홍길동", "네이버", "서울");
		m1.print();	// 생성자 호출
//		print메소드를 활용하여 출력
	}

}
