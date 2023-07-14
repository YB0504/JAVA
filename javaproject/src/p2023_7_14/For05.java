package p2023_7_14;

import java.util.Scanner;

public class For05 {

	public static void main(String[] args) {
		
//	키보드로 입력한 구구단 1개 단을 출력하는 프로그램으 작성
		
		System.out.println("원하는 단을 입력하세요.");
		Scanner sc = new Scanner(System.in);
		int dan = sc.nextInt(); // 5
		
		System.out.println("[" + dan + "단]");
		for(int i = 1; i <=9; i++) // for문 중괄호 생략
			System.out.println(dan + " * " + i + " = " + dan * i);
			
		
		
		
	}

}
