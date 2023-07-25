package p2023_7_25;

import java.util.Scanner;

public class Homework {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// 키보드로 주민번호를 입력받은 값을 각각의 변수에 입력하는 코드
		System.out.println("주민등록번호 앞자리를 입력하세요.");
		String id1 = sc.nextLine();

		System.out.println("주민등록번호 뒷자리를 입력하세요.");
		String id2 = sc.nextLine();

		// 주민번호를 입력받는 루프
		if (id1.length() != 6) {
			System.out.println("주민번호 앞자리 여섯 자리를 입력하세요.");
		} else if (id2.length() != 7) {
			System.out.println("주민번호 뒷자리 일곱 자리를 입력하세요.");
		} else if (!idCheck(id1 + id2)) {
			// 작성한 메소드 호출과 조건식
			// id1과 id2의 길이를 확인하여 idCheck 메소드로
			// 돌려주고 유효성을 검사 하고 그 값을 전달 받아
			// 논리 연산자(부정)를 활용하여 검사 결과를 출력하는 코드
			System.out.println("올바른 주민등록번호입니다");
		} else {
			System.out.println("잘못된 주민등록번호입니다");
		}

	}

	private static boolean idCheck(String id) {
		// boolean 자료형의 메소드 작성
		// 입력받은 값의 유효성을 검사하고 그 결과를 boolean형태
		// 로 반환하는 정적 메소드
		// 주민등록번호가 올바른 번호인지 검사하는 메소드

		// 주민번호 각 자리에 곱할 숫자
		// 배열 선언과 동시에 각 배열방에 해당 값을 초기화하는
		// 1차원 배열의 두 번째 유형
		int[] idCheck = { 2, 3, 4, 5, 6, 7, 8, 9, 2, 3, 4, 5 };

		// 입력된 주민번호와 각 자리에 곱한 값을
		// 더한 값을 구하는 코드와 그 초기화 값
		// 덧셈에 영향을 주지 않기 위해 0으로 초기화
		int sum = 0;

		// 주민번호가 옮은지 잘못됬는지 검증하는 for문
		// idCheck.length는 idCheck배열의 크기(속성)
		for (int i = 0; i < idCheck.length; i++) {

			sum += idCheck[i] * Integer.parseInt(id.substring(i, i + 1));
			// sum = sum + idCheck[i] * Integer.parseInt(id.substring(i, i + 1));
			// id문자열에서 i번째 인덱스부터 i+1번째 인덱스까지 추출하고
			// 그 값을 문자열에서 정수로 변환하여 i번째 배열값과 계산하는 코드
		}
		// sum 값을 11로 나눈 나머지를 구하고
		// 11에서 나머지를 뺸값을 total변수에 저장
		int total = 11 - (sum % 11);

		// total과 id문자열에서 추출한 주민번호의 마지막 번호를
		// 비교 연산자로 비교하여 해당 boolean값을 메인메소드로 리턴하는 코드
		if (total == Integer.parseInt(id.substring(12, 13))) {
			return false;
		} else {
			return true;
		}

	}

}
