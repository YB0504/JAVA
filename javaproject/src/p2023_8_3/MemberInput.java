package p2023_8_3;

import java.util.ArrayList;
import java.util.Scanner;

public class MemberInput {

	public static void main(String[] args) {

		ArrayList li = new ArrayList();
		MemberInfo mm;
		String yn;

		Scanner sc = new Scanner(System.in);

		do {
			System.out.print("성명을 입력하세요? ");
			String name = sc.nextLine();
			System.out.print("나이를 입력하세요? ");
			int age = sc.nextInt();
			sc.nextLine();
			System.out.print("E-Mail을 입력하세요? ");
			String email = sc.nextLine();
			System.out.print("주소를 입력하세요? ");
			String address = sc.nextLine();

			// 반복문 안에 멤버인포 클래스 객체 생성
			MemberInfo m = new MemberInfo();

//		 	m.name="홍길동"; 필드의 접근제어자가 private이기 때문에 직접 접근 불가능
			// set메소드로 매개변수에 값을 전달
			m.setName(name);
			m.setAge(age);
			m.setEmail(email);
			m.setAddress(address);

			// 저장된 값 m을 add메소드로 list에 저장
			// boolean add(Object e)
			// Object e = new MemberInfo(); 업캐스팅
			li.add(m);

			System.out.println("계속할려면 y, 멈출려면 n을 입력?");
			yn = sc.nextLine();
			if (yn.equals("y")) {
				continue;
			} else if (yn.equals("n")) {
				break;
			}

		} while (true);

		for (int i = 0; i < li.size(); i++) {

			// Object get(int index)
			// 다운캐스팅
			// 제네릭을 쓰지 않았기 때문에 다운캐스팅할 자료형을
			// 생략하면 안된다.
			mm = (MemberInfo) li.get(i);

			// 입력한 값을 get메소드로 리턴
			System.out.println("성명:" + mm.getName());
			System.out.println("나이:" + mm.getAge());
			System.out.println("E-Mail:" + mm.getEmail());
			System.out.println("주소:" + mm.getAddress());
		}
	}

}

// DTO(Data Transfer Object)
class MemberInfo extends Object {
	private String name;
	private int age;
	private String email;
	private String address;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

}
