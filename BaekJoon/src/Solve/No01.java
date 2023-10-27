package Solve;

import java.util.*;

public class No01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		if(a > 0 && b < 10) {
			int result = a + b;
			System.out.println("result :" + result);
		}

	}

}
