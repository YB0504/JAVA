package p2023_07_18;

import java.util.Scanner;

public class SelfStudy01 {

	public static void main(String[] args) {

//	5과목의 점수의 총합을 구하시오
		
		System.out.println("각 과목의 점수를 입력하시오.");
		Scanner sc = new Scanner(System.in);
		
		int[] score = new int[5]; 
		
		int sum = 0;
		for(int i = 0; i < score.length; i++) {
			score[i] = sc.nextInt();
			sum += score[i]; // sum = sum + i
		}System.out.println("총합 : " + sum);
			double avg = (double) sum / 5;
			System.out.printf("평균 : %.1f", + avg);
	}

}
