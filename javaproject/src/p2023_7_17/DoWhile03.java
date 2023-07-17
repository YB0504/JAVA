package p2023_7_17;

import java.util.Scanner;

public class DoWhile03 {

	public static void main(String[] args) {
		
		
		System.out.println("메시지를 입력하세요");
		System.out.println("프로그램을 종료하려면 q를 입력하세요.");
		
		Scanner sc = new Scanner(System.in);
		String input; // 문자열 변수 형성
//		참조 자료형
		do {
			System.out.println(">");
			input = sc.nextLine(); // 문자로 입력 받는다
			System.out.println("입력문자 : " + input);
			
		}while(!input.equals("q")); // 조건식이 참이면 루프하고 거짓이면 빠져나온다.
//	ex) 	   !"자바".equals("q")) 거짓 -> 참 (루프)
//	ex) 	   !"q".equals("q")) 참 -> 거짓 (빠져나옴)
		
//			not연산자		값들끼리 비교할때 equals변수
//			not연산자를 이용하여 input 변수를 false에서 true로 변환하여 재루프
		System.out.println("프로그램 종료");
		sc.close();
		
	}

}
