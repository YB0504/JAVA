package p2023_7_15;

import java.util.Scanner;

public class Practice02 {

	public static void main(String[] args) {
		
//		비교 연산자로 정수 3개 비교
		
		System.out.println("정수 3개를 입력하세요.");
		Scanner sc = new Scanner(System.in);
		
		int n1, n2, n3, max, min;
		
		n1 = sc.nextInt();
		n2 = sc.nextInt();
		n3 = sc.nextInt();
		
		max = (n1 > n2) ? n1: n2;
		max = (max > n3) ? max : n3; // ?(참) : (거짓)
		
		min = (n1 < n2) ? n1 : n2;
		min = (min < n3) ? min : n3;
		
		System.out.println("max = " + max);
		System.out.println("min = " + min);
		
		
	}

}
