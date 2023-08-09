package p2023_07_30;

import java.util.Scanner;

public class Practice01 {

	public static void main(String[] args) {

		System.out.println("정수 3개를 입력하세요");
		Scanner sc = new Scanner(System.in);

		int n1, n2, n3, max, min;

		n1 = sc.nextInt();
		n2 = sc.nextInt();
		n3 = sc.nextInt();

		if (n1 > n2) {
			max = n1;
			min = n2;
		} else {
			max = n2;
			min = n1;
		}
		
		if(max < n3) {
			max = n3;
		}
		if(min > n3) {
			min = n3;
		}
		System.out.println("max : " + max);
		System.out.println("min : " + min);
	}

}
