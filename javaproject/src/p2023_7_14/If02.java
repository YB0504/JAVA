package p2023_7_14;

import java.util.Scanner;

public class If02 {

	public static void main(String[] args) {
		
//		if(조건식){
//	         조건식이 참인경우 실행될 문장;
//	    }else{
//	         조건식이 거짓인경우 실행될 문장;
//	    }
		
//		키보드로 입력한 정수가 짝수, 홀수인지를 판별하는 프로그램을 작성
		
		System.out.println("정수를 입력하세요.");
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt(); // n = 5
		
//		2로 나누어야 0 아니면 1이 나오기 때문에 꼭 2로 나누어야 한다.
		if(n % 2 == 0) {
			System.out.println(n + "은(는) 짝수");
		}else {
			System.out.println(n + "은(는) 홀수");
		}
		
		
		
		
		
		
		
	}

}
