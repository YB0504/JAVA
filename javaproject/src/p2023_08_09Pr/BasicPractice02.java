package p2023_08_09Pr;

import java.util.Scanner;

public class BasicPractice02 {

	public static void main(String[] args) {

//		문자열 돌리기
		// 입력한 문자열을 String변수 a에 저장
		Scanner sc = new Scanner(System.in);
		String a = sc.nextLine();

		// a 문자열의 길이 만큼 반복문을 루프
		for (int i = 0; i < a.length(); i++) {
			// charAt메소드로 해당 인덱스 번호의 글자를 구해와서
			// char 자료형 변수 c에 저장
			char c = a.charAt(i);
			System.out.print(c);
			System.out.println();
		}

	}

}
