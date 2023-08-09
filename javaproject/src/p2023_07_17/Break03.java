package p2023_07_17;

public class Break03 {

	public static void main(String[] args) {
		
		int i = 0; // 초기값 변수 선언
		while(true) {
			i++; // 증감식
			int num = (int)(Math.random() * 6) + 1; // 난수 발생 : 1 ~ 6
				System.out.println(i + "번 : " +num); // 난수 출력
				if(num == 6)
					break; // 무한 루프를 빠져 나옴
		}
		System.out.println("프로그램 종료");
		System.out.println("루프 횟수 : " + i);
		
	}
}
