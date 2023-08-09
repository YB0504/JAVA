package p2023_07_21;

import java.util.Scanner;

public class MemberInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 객체 배열 : 객체를 저장하는 배열
		MemberInfo[] m = new MemberInfo[5];
		int i = 0;
		String yn;
		Scanner sc = new Scanner(System.in);
//								// 정적 필드
		String name, email, address;
		int age;
//		각각의 변수값 초기화
//		do ~ while문 사용
		do {
			System.out.print("성명을 입력하세요? ");
			name = sc.nextLine();
//					  next로만 입력하면 띄어쓰기를 할 시 첫번째 문자만 입력된다.
			System.out.print("나이를 입력하세요? ");
			age = sc.nextInt();// 숫자를 입력받은후에 enter키를
			sc.nextLine(); // 누르면 null값을 return하게 됨
//			enter키 자체를 문자값으로 입력받기 떄문
			System.out.print("E-Mail을 입력하세요? ");
			email = sc.nextLine();
			System.out.print("주소를 입력하세요? ");
			address = sc.nextLine();

			m[i] = new MemberInfo(name, age, email, address);
//			객체 배열이름[값이 들어갈 배열 번호] 
//			= 생성자 호출(생성되 있는 생성자와 매개 변수 개수가 같아야함)
//			heap메모리 상에 새로운 공간 생성
			// m.name="홍길동"; 필드값이 private제어자로 되어있기 때문에 (.)접근불가능
			i++;

			System.out.print("계속할려면 y, 멈출려면 n을 입력?");
			yn = sc.nextLine();
			if (yn.equals("y") || yn.equals("Y")) {
				continue; // y 입력 반복문 재 실행
			} else if (yn.equals("n") || yn.equals("N")) {
				break; // n 입력 / 반복문을 빠져나옴
			}

		} while (true);

		for (int j = 0; j < i; j++) {
			System.out.println("성명:" + m[j].getName());
			System.out.println("나이:" + m[j].getAge());
			System.out.println("E-Mail:" + m[j].getEmail());
			System.out.println("주소:" + m[j].getAddress());
			
			m[j].print(); // print메소드를 만들고 호출하는 것이 훨씬 쉽자.
			System.out.println();
		}
	}

}

//	DTO (Data Transfer Object)
class MemberInfo { // 값을 저장하는 기능
	private String name;
	private int age;
	private String email;
	private String address;

	public MemberInfo(String name, int age, String email, String address) {
//		사용자가 키보드로 입력한 값을 배정해서 필드 값을 초기화하는 기능
//		 new연산자로 객체 생성할떄 호출함
		this.name = name;
		this.age = age;
		this.email = email;
		this.address = address;
//		this를 안쓸때는 매개변수와 필드값의 이름을 다르게 쓴다.
	}

	public void print() {
		System.out.println(name);
		System.out.println(age);
		System.out.println(email);
		System.out.println(address);
	}
	
	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public String getEmail() {
		return email;
	}

	public String getAddress() {
		return address;
	}

}
