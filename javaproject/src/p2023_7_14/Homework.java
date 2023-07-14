package p2023_7_14;

import java.util.Scanner;

public class Homework {

	public static void main(String[] args) {
		
//		1.키보드로 정수 3개를 입력 받았을때, 최대값과 최소값을 구하는 프로그램을 작성하세요?
//		단, if else구문으로 작성하세요.
//
//		2.구구단(2~9단)을 열방향(세로방향)으로 출력하는 
//		   프로그램을 작성 하세요?
		
		System.out.println("정수 3개의 최대, 최소값을 구하시오");
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
			min = n1;
		}
		if(n3 > max) max = n3;
		
		if(n3 < min) min = n3;
//			max = n1;
//			min = n2;
//		}else if(n1 > n3){
//			max = n1;
//			min = n3;
//		}else if(n2> n3){
//			max = n1;
//			min = n3;
//		}else if(n2 > n1){
//			max = n2;
//			min = n3;
//		}else {
//			max = n3;
//			min = n1;
//		}
		System.out.println("max = " + max);
		System.out.println("min = " + min);
		
		
		
		
		
		
		
	}

}
