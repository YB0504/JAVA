package p2023_7_18;

import java.util.Scanner;

public class FatorialEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//	 	for반복문을 사용하여 작성
		int n, f=1; // 팩토리얼을 계산할 변수 f
//		*를 수행해야 하기 떄문에 0이 아닌 1로 초기화
		System.out.print("정수를 입력 하세요?");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		
		for(int i=n; i>=1; i--){ // ++과 부등호를 반대로 하여 증가하면서도 가능
			f = f * i;      // f *= i; 팩토리얼 식
//			3	1	3
//			6	3	2
//			6	6	1
		}
		System.out.println(n+"!="+f);	
	}

}
