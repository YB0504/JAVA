package p2023_07_18;

import java.util.Scanner;

public class ArrayEx00 {

	public static void main(String[] args) {
		
		System.out.println("각 과목의 점수를 입력하세요.");
		Scanner sc = new Scanner(System.in);
		
		int[] score = new int[5];
		
		int sum = 0;
		for(int i = 0; i < score.length; i++) {
			score[i] = sc.nextInt();
			sum += score[i];
		}		
//		for(int i = 0; i < score.length; i++) {
			double avg = (double)sum / 5;
			System.out.println("평균 : " + avg);
			System.out.println("총합 : " + sum);
		

		

		
		
		
	}

}
