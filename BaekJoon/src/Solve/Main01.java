package Solve;

import java.util.Scanner;

public class Main01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		같은 눈이 3개가 나오면 10,000원+(같은 눈)×1,000원의 상금을 받게 된다. 
//		같은 눈이 2개만 나오는 경우에는 1,000원+(같은 눈)×100원의 상금을 받게 된다. 
//		모두 다른 눈이 나오는 경우에는 (그 중 가장 큰 눈)×100원의 상금을 받게 된다.

		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		int n3 = sc.nextInt();
		int result;
		

		if (n1 == n2 && n1 == n3) {

			result = 10000 + (n1 * 1000);

			System.out.println(result);

		} else if (n1 == n2 && n1 != n3) {

			result = 1000 + (n1 * 100);

			System.out.println(result);

		} else if (n1 != n2 && n2 != n3 && n1 != n3) {

			int max = (n1 > n2) ? n1 : n2;
			max = (max > n3) ? max : n3;

			result = max * 100;
			System.out.println(result);
		}
	}

}
