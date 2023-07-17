package p2023_7_17;

import java.util.Scanner;

public class Homework02 {

	public static void main(String[] args) {
		
		System.out.println("입력한 정수의 팩토리얼을 구하시오.");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int result = 1;
		int i = n;
		
//		while 반복문을 사용한 팩토리얼 계산
		while(i >= 1) {
			result *= i;
			if(i == 1) {
				System.out.print(i);
			}else {
				System.out.print(i + " * ");
			}
			i--;
		}
		System.out.println();
		System.out.println(n + "! = " +result);
		
		
		
	}

}
