package p2023_7_14;

import java.util.Scanner;

public class If04 {

	public static void main(String[] args) {
		
//		if(조건식1){
//			조건식1이 참인 경우 실행될 문장;
//		}else if(조건식2){
//			조건식2가 참인 경우 실행될 문장;
//		}else{
//			위의 조건 식을 만족하지 않을 때 실행될 문장;
//		}
//		(필요 하다면 else if문을 추가함)
//		마지막 else문은 필요없다면 없어도 됨
		
// 		키보드로 입력한 점수가 어느 학점에 해당 되는지 판별하는 프로그램을 작성
//		90점 이상 - A 학점
//		80점 이상 - B 학점
//		70점 이상 - C 학점
//		60점 이상 - D 학점
//		60점 미안 - F 학점
		
		System.out.println("0 ~ 100점 사이의 점수를 입력 하세요.");
		Scanner sc = new Scanner(System.in);
		
		int s = sc.nextInt();
		
// if else if 문은 여러개의 조건식이 모두 만족하더라도, 가장 먼저 만족하는 조건절
// 아래쪽의 문장만 실행된다.
		
		if(s >= 90) {
			System.out.println("A");
		}else if (s >= 80) {
			System.out.println("B");			
		}else if (s >= 70) {
			System.out.println("C");
		}else if (s >= 60) {
			System.out.println("D");
		}else {
			System.out.println("F");			
		}
		
	}

}
