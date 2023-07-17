package p2023_7_17;

public class Continue03 {

	public static void main(String[] args) {
		
//	continue 문을 이용해서 1 ~ 100까지 정수 중에서 5의 배수만 출력
		
		for(int i = 1; i <= 100; i++) {
			if(i % 5 != 0) { 
				// i % 5 == 0 5의 배수가 되는 조건식이 되버리면
				// continue문을 만나서 출력이 되지않게 되버린다
				continue;
			}
			System.out.println("5의 배수 : " + i);
		}
	}

}
