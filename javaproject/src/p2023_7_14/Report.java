package p2023_7_14;

import java.util.Scanner;

public class Report {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.print("3개의 정수를 입력 하세요?");
		int n1, n2, n3, max, min;

		Scanner sc = new Scanner(System.in); // 가장 쉽게 입력을 받을 수 있는 class
		// 라이브러리의 도움을 받아서 해결
		n1 = sc.nextInt(); // n1=20;
		n2 = sc.nextInt(); // n2=10;
		n3 = sc.nextInt();

		// 최대값
		max = (n1 > n2) ? n1 : n2;
		max = (max > n3) ? max : n3;		
//		max = (n1>n2 && n1>n3) ? n1 : (n2>n3) ? n2: n3;
//		3개를 동시에 비교가 안되기에 n1, n2를 비교 후 max변수와 다시 n3를 비교		
		
		// 최소값		
		min = (n1 < n2) ? n1 : n2;
		min = (min < n3) ? min : n3;		
//		min = (n1<n2 && n1<n3) ? n1 : (n2<n3) ? n2: n3;
		
		System.out.println("max=" + max);
		System.out.println("min=" + min);		
		
	}

}
