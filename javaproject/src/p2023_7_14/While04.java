package p2023_7_14;

public class While04 {

	public static void main(String[] args) {
		
// while 문을 이용해서 구구단(2 ~ 9)단을 출력하는 프로그램을 작성
		
		int dan = 2, i = 1;		// 초기값
		while(dan <= 9) {		// 조건식 : 단
			System.out.println("[" + dan + "단]");
			i = 1;	// i 변수의 값을 다시 초기화 하지않으면 2단만 실행된다.
			while(i <= 9) {		// 조건식
				System.out.println(dan + " * " + i + " = " + dan * i);
				i++;			// 증감식
			}
			dan++;				// 증감식 : 단
//			i = 1; 여기서 초기화 하여도 문제없이 실행
			System.out.println();
		}
		
	}

}
