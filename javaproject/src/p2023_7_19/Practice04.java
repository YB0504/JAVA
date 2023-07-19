package p2023_7_19;

import java.util.Scanner;

public class Practice04 {

	public static void main(String[] args) {

		int score = 0;
		char grade = ' ';

		System.out.println("점수를 입력하세요");
		Scanner sc = new Scanner(System.in);
		score = sc.nextInt(); // 입력한 숫자를 변수에 저장

		if (score >= 90) {
			grade = 'A';
		} else if (90 > score && score >= 80) {
			grade = 'B';
		} else if (70 <= score && score < 80) {
			grade = 'C';
		} else {
			grade = 'D';
		}
		System.out.println("학점 : " + grade);
	}

}
