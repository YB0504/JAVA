package p2023_7_13;

import java.util.Scanner;

public class OperPractice {

	public static void main(String[] args) {
		
		int n1, n2, n3, n4, max, min;
		System.out.println("정수 4개를 입력하세요.");
		
		Scanner sc = new Scanner(System.in);
		
		n1 = sc.nextInt();
		n2 = sc.nextInt();
		n3 = sc.nextInt();
		n4 = sc.nextInt();
		
		max = (n1 > n2) ? n1 : n2;
		max = (max > n3) ? max : n3;
		max = (max > n4) ? max : n4;
		
		min = (n1 < n2) ? n1 : n2;
		min = (min < n3) ? min : n3;
		min = (min < n4) ? min : n4;
		
		System.out.println("max : " + max);
		System.out.println("min : " + min);
		
		
	}

}
