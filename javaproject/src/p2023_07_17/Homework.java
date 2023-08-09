package p2023_07_17;

import java.util.Scanner;

public class Homework {

	public static void main(String[] args) {
		
//		1. 키보드를 이용해서 입력한 정수의 팩토리얼을
//		   구하는 프로그램을 작성 하세요?
//			ex) 3! = 3 * 2 * 1
//		        5! = 5 * 4 * 3 * 2 * 1
		
		System.out.println("입력한 정수의 팩토리얼을 구하시오.");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int result;

		result = 1;
		for(int i = n; i >= 1; i--) {
			result *= i; // result = result * i
//			if(i <= 0)continue; 필요없는 문장
			if(i==1) {
				System.out.print(i); // i가 1일떄 i만 출력
			}else {
				System.out.print(i + " * ");
			}
		}
		System.out.println(); // 한줄 띄우기
		System.out.println(n + "! = " + result); // 팩토리얼 결과 출력
	}

}
