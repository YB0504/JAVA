package p2023_07_20;

import java.util.Scanner;

class MemberInfo {
	// 필드
	private String name;
	private int age;
	private String email;
	private String address;

	// 생성자 매개변수 4개
	public MemberInfo(String name, int age, String email, String address) {
		this.name = name;
		this.age = age;
		this.email = email;
		this.address = address;

	}

	public void print() {
		System.out.println("성명 : " + name);
		System.out.println("나이 : " + age);
		System.out.println("이메일 : " + email);
		System.out.println("주소 : " + address);
	}

}

public class MemberInput {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

//		String[] costomer = new String[2];

		System.out.println("회원 수를 입력하세요.");
		int member = Integer.parseInt(sc.nextLine());
		MemberInfo[] n1 = new MemberInfo[member];
		for (int i = 0; i < member; i++) {
			System.out.println("회원정보를 입력하세요.");
			String name = sc.nextLine();
			int age = Integer.parseInt(sc.nextLine());
			String email = sc.nextLine();
			String address = sc.nextLine();
			n1[i] = new MemberInfo(name, age, email, address);
		}
		for (int j = 0; j < member; j++) {
			n1[j].print();
		}
	}

}
