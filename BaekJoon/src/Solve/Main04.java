package Solve;

import java.util.Scanner;

public class Main04 {

	public static void main(String[] args) {
		
		// n이 주어졌을 때, 1부터 n까지 합을 구하는 프로그램을 작성하시오.
		
		System.out.println("n을 입력했을 때 n까지 합을 구하시오");
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int result = 0;
		
		for(int i = 1; i <= n; i++) {
			result += i;
		}
		System.out.println(result);
		
	}

}
