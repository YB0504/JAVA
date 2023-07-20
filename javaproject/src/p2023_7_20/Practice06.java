package p2023_7_20;

import java.util.Scanner;

public class Practice06 {

	public static void main(String[] args) {
		boolean run = true;
		int studentNum = 0;
		int[] scores = null;
		// 학생 수를 입력할 때에 해당 값이 저장됨
		Scanner sc = new Scanner(System.in);

		while (run) { // boolean 조건식 true 인동안 루프를 실행
			System.out.println("---------------------");
			System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
			System.out.println("---------------------");
			System.out.print("선택>");

			int selectNo = Integer.parseInt(sc.nextLine());

			if (selectNo == 1) {
				System.out.print("1.학생수> ");
//									문자열을 숫자로 변환
				studentNum = Integer.parseInt(sc.nextLine());
//				int[] scores = new int[studentNum];
				scores = new int[studentNum];
				// scores 배열을 studentNum만큼의 숫자로 생성
			} else if (selectNo == 2) {
				for (int i = 0; i < scores.length; i++) {
//					배열의 각 방에 점수를 배정할 루프
					System.out.print("scores[" + i + "]>");
//											// 배열번호 출력
					scores[i] = Integer.parseInt(sc.nextLine());
//					scores[i] 각 배열에 입력한 점수값 배정
				}
			} else if (selectNo == 3) {
				for (int i = 0; i < scores.length; i++) {
//					위의 for문에서 입력된 점수값이 배열 순서대로 출력될 루프
					System.out.println("scores[" + i + "]>" + scores[i]);
				}
			} else if (selectNo == 4) {
				// 분석 자료에 쓰일 변수 값을 0 으로 초기화
				int max = 0;
				int min = 0;
				int sum = 0;
				double avg = 0.0;

				for (int i = 0; i < scores.length; i++) {
					// 배열에 저장된 수를 이용하여 max, min값을 비교할 루프
					max = (max < scores[i]) ? scores[i] : max;
					min = scores[0]; // min 값을 먼저 정의
					min = (min > scores[i]) ? scores[i] : min;
					// min 값 비교 작성
					sum += scores[i];
//					평균을 구할 때 사용할 각 배열에 저장된 점수의 합을 구할 식
				}
				avg = (double) sum / scores.length;
				System.out.println("max : " + max);
				System.out.println("min : " + min);
				System.out.printf("평균 : %.1f\n", + avg);
			} else if (selectNo == 5) {
				run = false;
				// while문 루프를 끝내기 위한 코드
				System.out.println("프로그램 종료");
			}

		}
	}
}
