package p2023_07_13;

import java.util.Scanner;

// api 찾아보기
public class Oper05 {

	public static void main(String[] args) {

// 예비처리를 하지않아도 되는 클래스 (import 필요)
// java.io.* 패키지에 있는 클래스로도 가능하나 예비처리가 필요
// Scanner 객체를 생성 해야만 입력장치로 받을 수 있음
		
		System.out.println("정수 2개를 입력하세요?");
		// 출럭 System.out.
		// 표준입력 장치인 키보드로 입력을 받기 위해서 Scanner 객체 생성
		Scanner sc = new Scanner(System.in);
		// 입력을 받아야 하기 때문에 (System.in) - 정적 필드
		// 정수형태로 입력을 받기 위해서 nextInt() 메소드로 입력을 받는다.
		int n1 = sc.nextInt(); // 스페이스바 or 엔터키로 구분함 (콘솔에 입력
		int n2 = sc.nextInt();
		System.out.println("n1 : " +n1);
		System.out.println("n2 : " +n2);
		
		if(n1 > n2 ) { // 조건식이 참이면 if문 아랫쪽을 실행
			System.out.println(n1 + "이" + n2 + "보다 크다");
		}else {			// 조건식이 거짓이면 else 아랫쪽을 실행
			System.out.println(n2 + "이" + n1 + "보다 크다");			
		}
		
	}

}