package p2023_7_30;

import java.util.Scanner;

public class practice03 {

	public static void main(String[] args) {
		
		int n, f = 1;
		System.out.println("정수를 입력하세요");
		Scanner sc = new Scanner(System.in);
		
		n = sc.nextInt();
		
		for(int i = n; i >= 1; i--) {
			f = f * i;
		}
		System.out.println(n + " != " + f);
		
		
		
	}

}
