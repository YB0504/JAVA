package p2023_7_16;

import java.util.Scanner;

public class SwitchAndCase {

	public static void main(String[] args) {

//		switch ~ case 문을 활용한 예제 (조건 제어문)
		System.out.println("사원 평가 등급을 입력하세요.");
		Scanner sc = new Scanner(System.in);
		String s1 = sc.nextLine();
		
		switch (s1) {
		case "A":
			System.out.println("진급");
			break;
		case "B":
			System.out.println("진급");
			break;
		case "C":
			System.out.println("진급 보류");
			break;
		default:
			System.out.println("진급 누락");
			break;
		}

	}

}
