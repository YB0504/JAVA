package p2023_7_18;

import java.util.Scanner;

public class Homework01 {

	public static void main(String[] args) {
		
		System.out.println("정수 5개를 입력하세요");
		Scanner sc= new Scanner(System.in);
		
		int[] s1 = new int[5];
		int max, min;
		for(int i = 0; i < s1.length; i++)
			s1[i] = sc.nextInt();
			max = s1[0];
			min	= s1[0];
		for(int i = 0; i < s1.length; i++) {
			if(s1[i] > max) max = s1[i];
			if(s1[i] < min) min = s1[i];
			
		}
		System.out.println("max : " + max);
		System.out.println("min : " + min);
	}

}
