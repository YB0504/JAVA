package p2023_07_16;

public class Operater_06 {

	public static void main(String[] args) {
		
//		논리 연산자
		int n1 = 300;
//		둘 모두 true여야 true		
		if(n1 > 100 && n1 < 100) {
			System.out.println(n1 + "이(가) 더 크다");
		}else {
			System.out.println(n1 + "이(가) 더 작다");
		}
		
		int n2 = 14;
//		둘 중 하나만 true여도 true
		if(n2 % 2 == 0 || n2 % 5== 0) {
			System.out.println("2 나 5의 배수이다.");
		}else {
			System.out.println("2나 5의 배수가 아니다.");
		}
	}

}
