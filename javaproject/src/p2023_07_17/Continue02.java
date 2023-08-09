package p2023_07_17;

public class Continue02 {

	public static void main(String[] args) {
		
//	continue문을 이용해서 1 ~ 100까지 정수 중에서 짝수만 출력
		
		for(int i = 1; i <= 100; i++) {
			if(i % 2 == 1) { // i % 2 != 0 도 가능 (짝수)
				continue; // 홀수값일때는 출력되지 않는다.
			}
			System.out.println("짝수 : " +i);
		}
		
		
		
	}

}
