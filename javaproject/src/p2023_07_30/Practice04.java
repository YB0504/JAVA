package p2023_07_30;

import java.util.Scanner;

public class Practice04 {

	public static void main(String[] args) {

		System.out.println("정수를 입력하세요");
		Scanner sc = new Scanner(System.in);

		int[] n = new int[5];

		int max, min = 0;

		for (int i = 0; i < 5; i++) 
			n[i] = sc.nextInt();
			// max, min 값 배정
			max = n[0];
			min = n[0];

			for (int i = 0; i < 5; i++) {
				if (max < n[i])
					max = n[i];
				if(min > n[i]) min = n[i];
			}
			System.out.println("max : " + max);
			System.out.println("min : " + min);
		}
	

}
