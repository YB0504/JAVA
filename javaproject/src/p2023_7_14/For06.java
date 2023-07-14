package p2023_7_14;

public class For06 {

	public static void main(String[] args) {
		
//	구구단 2 ~ 9단까지 출력하는 프로그램을 작성
		
//		다중 for 문
		for(int dan = 2; dan <= 9; dan++) { // 단을 처리하기 위한 for문
			System.out.println("[" + dan + "단]");
			for(int i = 1; i <= 9; i++) {
				System.out.println(dan + " * " + i + " = " + dan * i);
//				System.out.println();
			}
			System.out.println(); // 각 단 줄간격 벌리기
		}
		
		
		
		
		
		
		
	}

}
