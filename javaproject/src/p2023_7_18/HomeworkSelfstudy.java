package p2023_7_18;

import java.util.Scanner;

public class HomeworkSelfstudy {

	public static void main(String[] args) {
		
		System.out.println("정수 5개를 입력하시오.");
		Scanner sc = new Scanner(System.in);
		
		int[] s1 = new int[5];
		
		int max, min; // 변수 정의
		for(int i = 0; i < s1.length; i++) 
			s1[i] = sc.nextInt(); // 키보드로 입력하여 배열에 저장할 값
			max = s1[0];
			min = s1[0];
			// max, min값 배열의 초기화
		for(int i = 0; i < s1.length; i++) {
				if(s1[i] > max) max = s1[i];
				if(s1[i] < min) min = s1[i];
			} // max, min값을 찾는 루프
		System.out.println("max : " + max);
		System.out.println("min : " + min);
		
		
		
	}

}
