package p2023_7_31Ex;

public class LoopApp {

	public static void main(String[] args) {

		// 반복문
		// while 문
		System.out.println(1);
		System.out.println("=== while ===");
		int i = 0; // 반복문의 카운팅을 위한 변수
		while (i < 3) { // 조건문
			System.out.println(2);
			System.out.println(3);
			i++; // 돌아가는 수의 제한을 위한 증감식
		}

		// for문
		// 코드의 문제가 생길 가능성이 적다.
		System.out.println("=== for ===");
		for (int i1 = 0; i1 < 3; i1++) {
			// 초기값 	boolean  증감식
			System.out.println(2);
			System.out.println(3);
		}

		System.out.println(4);

	}

}
