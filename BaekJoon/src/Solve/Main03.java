package Solve;

import java.util.Scanner;

public class Main03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// 테스트 케이스의 개수를
		int t = sc.nextInt();
		
		// 0 < a , b < 10 은 b가 0일수도 있다.
		// 반복문에 0을 포함시켜야 한다.
		for(int i = 0; i < t; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			int result = a + b;
			System.out.println(result);
			
		}
		
	}

}
