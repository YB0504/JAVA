package p2023_7_17;

import java.util.Scanner;

public class MethodEx03 {

//	키보드로 입력한 두 개의 정수 중에서 최대,최소값을 구하는 프로그램을 작성
//	단, 메소드를 이용해서 작성
	
	// 최대값
	static int max(int a, int b) { // 정적 메소드
		if(a > b) {
			return a;
		}else {
			return b;
		}
	}
	
	// 최소값
	static int min(int a, int b) { // 정적 메소드
		if(a < b) {
			return a;
		}else {
			return b;
		}
	}
	
	
	public static void main(String[] args) {
		
		int n1, n2, max, min;
		System.out.println("2개의 정수를 입력하시오.");
		Scanner sc = new Scanner(System.in);
		n1 = sc.nextInt();
		n2 = sc.nextInt();
		
		max = MethodEx03.max(n1, n2); // max() 메소드 호출
		min = MethodEx03.min(n1, n2); // min() 메소드 호출		
//		같은 클래스 안에 있다면 MethodEx03 생략가능
		
		System.out.println("max : " + max);
		System.out.println("min : " + min);
		
	}

}
