package p2023_07_16;

import java.util.Scanner;

public class Operater_05 {

	public static void main(String[] args) {
		
//		ifelse문을 이용 하여 정수 3개를 비교
		
		System.out.println("정수 3개를 비교하세요");
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		int n3 = sc.nextInt();
		
		if(n1 > n2) {
			System.out.println(n1 + "이" + n2 + "보다 크다.");
		}else{
			System.out.println(n2 + "이" + n1 + "보다 크다.");
		}			
		if(n1 < n3){
			System.out.println(n3 + "이" + n1 + "보다 크다.");
		}else if(n2 < n3) {
			System.out.println(n3 + "이" + n2 + "보다 크다.");
		}else {
			System.out.println(n3 + "이" + n1 + "," + n2 + "보다 작다.");
		}
	}

}
