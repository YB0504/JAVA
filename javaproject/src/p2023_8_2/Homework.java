package p2023_8_2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class MemberInfo {
	private String name;
	private int age;
	private String email;
	private String address;

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

public class Homework {

	public static void main(String[] args) {

		ArrayList<MemberInfo> list = new ArrayList<>();
		boolean stop = false;

		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("회원 정보를 입력하세요");
			System.out.print("성명");
			String name = sc.nextLine();
			System.out.print("나이");
			int age = sc.nextInt();
			sc.nextLine();
			System.out.println("이메일");
			String email = sc.nextLine();
			System.out.println("주소");
			String address = sc.nextLine();

			MemberInfo m = new MemberInfo();
			m.setName(name);
			m.setAge(age);
			m.setEmail(email);
			m.setAddress(address);

			list.add(m);

			System.out.println("계속히려면 y, 멈추려면 n입력?");
			String yn = sc.nextLine();
			if (yn.equals("y") || yn.equals("Y")) {
				continue;
			} else if (yn.equals("n") || yn.equals("N")) {
				break;
			}

		}

		for (int i = 0; i < list.size(); i++) {
			MemberInfo m = list.get(i);

			System.out.println("성명:" + m.getName());
			System.out.println("나이:" + m.getAge());
			System.out.println("email:" + m.getEmail());
			System.out.println("주소ㅓ:" + m.getAddress());
		}

	}

}
