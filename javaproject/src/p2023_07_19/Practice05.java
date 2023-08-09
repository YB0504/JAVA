package p2023_07_19;

import java.util.Scanner;

public class Practice05 {

	public static void main(String[] args) {
		// 초기값 설정
		int score = 0;
		char grade = ' ', opt = ' ';
		
		System.out.println("점수를 입력하시오.");
		Scanner sc = new Scanner(System.in);
		score = sc.nextInt();
		
		System.out.println("점수 : " + score);
		
		if(score >= 90) {
			grade = 'A';
			if(score >= 95) { // 90점 이상중에서 95점이상은 A+
				opt = '+';
			}else if(score < 95) { // 90점 이상중에서 95점 미만은 A-
				opt = '-';
			}
		}else if(score >= 80) {
			grade = 'B';
			if(score >= 85) {
				opt = '+';
			}else if(score < 85) {
				opt = '-';
			}
		}else {
			grade = 'C';
		}
		System.out.println("학점 : " + grade + opt);
//		System.out.println("학점 : " + grade + + opt);
										 // 변수를 단항 연산자로 연결한게 되어버려서
										 // 문자 + 문자가 아닌 문자 + 정수가 됨
		
	}

}
