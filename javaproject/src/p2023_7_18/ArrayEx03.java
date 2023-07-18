package p2023_7_18;

import java.util.Scanner;

public class ArrayEx03 {

	public static void main(String[] args) {
		
//	키보드로 5과목의 점수를 입력하여, 총점과 평균을 구하는 프로그램을 작성
		System.out.println("5과목의 점수를 입력하세요.");
		Scanner sc = new Scanner(System.in);

		int[] score = new int[5];
		
		int sum = 0; // 합을 구하는 문장이기때문에 sum변수를 0으로 초기화
		for(int i = 0; i < score.length; i++) { // 초기값, 조건식, 증감식
			score[i] = sc.nextInt();
			sum += score[i];
		}System.out.println("총합 : " + sum);
		double avg = (double)sum / 5;
		System.out.printf("평균 : %.1f", + avg);
	}

}
