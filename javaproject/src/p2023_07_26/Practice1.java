package p2023_07_26;

import java.util.Scanner;

public class Practice1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("정수 5개를 입력하세요.");

		int[] n1 = new int[5];
		int max, min;

		for (int i = 0; i < n1.length; i++)
			n1[i] = sc.nextInt();
		max = n1[0];
		min = n1[0];

		for (int i = 0; i < n1.length; i++) {
			if (n1[i] > max)
				max = n1[i];
			if (n1[i] < min)
				min = n1[i];
		}
		System.out.println("max : " + max);
		System.out.println("min : " + min);

	}

}
