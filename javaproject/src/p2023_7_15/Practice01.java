package p2023_7_15;

import java.util.Scanner;

public class Practice01 {

	public static void main(String[] args) {
		
		System.out.println("정수 3개를 입력하세요.");
		Scanner sc = new Scanner(System.in);
		
		int n1, n2, n3, max, min;
		
		n1 = sc.nextInt();
		n2 = sc.nextInt();
		n3 = sc.nextInt();
		
		if(n1 > n2) {
			max = n1;
			min = n2;
		}else {
			max = n2;
			min = n1; // n1과 n2 사이의 max, min값이 저장
		}
		if(n3 > max) max = n3;
		if(n3 < min) min = n3;		
		
		System.out.println("max = " + max);
		System.out.println("min = " + min);
	}

}
