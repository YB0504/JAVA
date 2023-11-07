package Solve;

import java.util.Scanner;

public class Main05 {

	public static void main(String[] args) {

//		첫째 줄에는 영수증에 적힌 총 금액 X가 주어진다.
//		둘째 줄에는 영수증에 적힌 구매한 물건의 종류의 수 N이 주어진다.
//		이후 N개의 줄에는 각 물건의 가격 a와 개수 b가 공백을 사이에 두고 주어진다.
//		구매한 물건의 가격과 개수로 계산한 총 금액이 영수증에 적힌 
//		총 금액과 일치하면 Yes를 출력한다. 일치하지 않는다면 No를 출력한다.

		System.out.println("테스트");
		Scanner sc = new Scanner(System.in);

		int x, n, a, b;
		
		// 총 금액
		x = sc.nextInt();
		
		// 물건 종류
		n = sc.nextInt();
		
		// 각 물건을 계산한 값을 저장할 변수
		int result = 0;

		// n 번까지 루프 돌리면서 가격과 개수를 곱하여 result에 더하여 다시 저장   
		for (int i = 0; i < n; i++) {
			// 물건의 종류 만큼 각 물건의 가격과 개수를 곱하려면 for문 안에서
			// 값을 입력 받는다.
			a = sc.nextInt();
			b = sc.nextInt();
			result = result + (a * b);
		}
		
		if (result == x) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
		
//		테스트 결과!!
//		10000
//		2
//		2500 2
//		5000 1
//		Yes

	}

}
