package p2023_7_14;

import java.util.Scanner;

public class Switch01 {

	public static void main(String[] args) {

// switch ~ case문
//		키보드로 입력한 점수가 어느 학점에 해당 되는지 판별하는 프로그램을 작성
//		90점 이상 - A 학점
//		80점 이상 - B 학점
//		70점 이상 - C 학점
//		60점 이상 - D 학점
//		60점 미안 - F 학점

		System.out.println("0 ~ 100점 사이의 점수를 입력 하세요.");
		Scanner sc = new Scanner(System.in);

		int s = sc.nextInt();

		switch (s / 10) { // int 형과 int형을 산술연산하면 int형이 된다
		case 10:
		case 9:
			System.out.println("A학점");
			break; // switch ~ case문을 완전히 빠져나가게 도와줌
		case 8:
			System.out.println("B학점");
			break;
		case 7:
			System.out.println("C학점");
			break;
		case 6:
			System.out.println("D학점");
			break;
		default:
			System.out.println("F학점");
		}

	}

}
