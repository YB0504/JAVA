package p2023_08_02.report;

import java.util.ArrayList;
import java.util.Scanner;

class MemberInfo {
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

public class MemberInput {
	public static void main(String[] args) {
		ArrayList<MemberInfo> memberList = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		boolean isStop = false;
		while (!isStop) {
			printMenu();
			String menu = sc.nextLine();
			switch (menu) {
			case "1":
				memberList.add(inputMember(sc));
				break;
			case "2":
				printMember(memberList);
				break;
			case "3":
				isStop = true;
				break;
			}
		}
	}

	static void printMenu() {
		System.out.println("[회원 관리 시스템]");
		System.out.println("1. 회원 정보 입력");
		System.out.println("2. 회원 목록 출력");
		System.out.println("3. 프로그램 종료");
		System.out.println("------------------");
		System.out.println("원하시는 메뉴의 번호를 입력하세요");
	}

	static MemberInfo inputMember(Scanner sc) {
		
		// 멤버인포 객체 생성
		MemberInfo tmp = new MemberInfo();
		System.out.println("[회원 정보를 입력하세요]");
		System.out.print("이름\t: ");
		tmp.setName(sc.nextLine());
		System.out.print("나이\t: ");
		tmp.setAge(Integer.parseInt(sc.nextLine()));
		System.out.print("이메일\t: ");
		tmp.setEmail(sc.nextLine());
		System.out.print("주소\t: ");
		tmp.setAddress(sc.nextLine());
		System.out.println("------------------");
		return tmp;
	}

	static void printMember(ArrayList<MemberInfo> memberList) {
		System.out.println("[회원 목록 출력]");
		int i = 1;
		for (MemberInfo tmp : memberList) {
			String str = "이름 : " + tmp.getName() + " 나이 : " + tmp.getAge() + " 이메일 : " + tmp.getEmail() + " 주소 : "
					+ tmp.getAddress();
			System.out.println("[" + i++ + ".] " + str);
		}
		System.out.println("------------------");
	}
}
