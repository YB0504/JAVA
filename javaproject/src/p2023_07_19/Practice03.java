package p2023_07_19;

import java.util.Scanner;

public class Practice03 {

	public static void main(String[] args) {
		
		System.out.println("숫자를 하나 입력하시오.");
		Scanner sc = new Scanner(System.in);
		
		int input = sc.nextInt();
		
		if(input == 0) {
			System.out.println("입력하신 숫자가 0이 아닙니다.");
		}else {
			System.out.println("입력하신 숫자가 0입니다.");
		}
		
	}

}
