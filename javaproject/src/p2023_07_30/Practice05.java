package p2023_07_30;

import java.util.Scanner;

class MemberInfo {
	private String name;
	private int age;
	private String email;
	private String address;

	public MemberInfo(String name, int age, String email, String address) {
		this.name = name;
		this.age = age;
		this.email = email;
		this.address = address;
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

}

public class Practice05 {

	public static void main(String[] args) {

		System.out.println("회원 정보를 입력하세요");

		Scanner sc = new Scanner(System.in);

		MemberInfo[] m = new MemberInfo[5];

		for (int i = 0; i < m.length; i++) {
			String name = sc.nextLine();
			int age = Integer.parseInt(sc.nextLine());
			String email = sc.nextLine();
			String address = sc.nextLine();
			m[i] = new MemberInfo(name, age, email, address);

		}

		for (int j = 0; j < m.length; j++) {
			System.out.println("이름 : " + m[j].getName());
			System.out.println("나이 : " + m[j].getAge());
			System.out.println("이메일 : " + m[j].getEmail());
			System.out.println("주소 : " + m[j].getAddress());
			System.out.println();

		}
	}

}
