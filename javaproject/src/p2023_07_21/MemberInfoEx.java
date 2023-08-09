package p2023_07_21;

import java.util.Scanner;

class MemberInfo1 {
	private String name;
	private int age;
	private String email;
	private String address;

//	클래스 안에 setter 메소드 선언
	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void print() {
		System.out.println("성명 : " + name);
		System.out.println("나이 : " + age);
		System.out.println("이메일 : " + email);
		System.out.println("주소 : " + address);
	}

}

public class MemberInfoEx {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("회원 수");
		// 문자열 정수 변환
		int member = Integer.parseInt(sc.nextLine());
		// 객체 배열 생성
		MemberInfo1[] m = new MemberInfo1[member];
		MemberInfo1 s = new MemberInfo1();

		// 각 배열에 값을 입력할 코드 반복문
		for (int i = 0; i < member; i++) {
			System.out.println("회원 정보 입력");
			String name = sc.nextLine();
			int age = Integer.parseInt(sc.nextLine());
			String email = sc.nextLine();
			String address = sc.nextLine();

			m[i] = new MemberInfo1();
//			m배열의 객체를 생성하고 i 인덱스에 값을 할당
			m[i].setName(name);
			m[i].setAge(age);
			m[i].setEmail(email);
			m[i].setAddress(address);
//		m[i]배열에 각각의 set메소드값을 각각 전달
		}

		for (int j = 0; j < member; j++) {
			m[j].print();
		}

	}

}
