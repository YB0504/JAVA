package p2023_7_25;

import java.util.Scanner;

public class Homework {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("주민등록번호 앞자리를 입력하세요.");
		String id1 = sc.nextLine();

		System.out.println("주민등록번호 뒷자리를 입력하세요.");
		String id2 = sc.nextLine();

		// 주민번호를 입력하는 루프
		if (id1.length() != 6) {
			System.out.println("주민번호 앞자리 여섯 자리를 입력하세요.");
		} else if (id2.length() != 7) {
			System.out.println("주민번호 뒷자리 일곱 자리를 입력하세요.");
		} else if (!idCheck(id1 + id2)) {
			System.out.println("잘못된 주민등록번호입니다");
		} else {
			System.out.println("올바른 주민등록번호입니다");
		}

	}

	private static boolean idCheck(String id) {

		// 주민번호 각 자리에 곱할 숫자
		int[] idCheck = { 2, 3, 4, 5, 6, 7, 8, 9, 2, 3, 4, 5 };

		// 주민번호가 옮은지 잘못됬는지 검증하는 for문
		for (int i = 0; i < id.length(); i++) {
//			for (int j = 0; j < idCheck.length; j++) {

			int sum = 0;
			sum += idCheck[i] * Integer.parseInt(id.substring(i, i + 1));

			int total = 11 - (sum % 11);
		}

		return false;
	}

}
