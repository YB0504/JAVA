package p2023_07_14;

public class For02 {

	public static void main(String[] args) {
		
//		1 ~ 10 까지의 합을 구하는 프로그램을 작성
		
		int sum = 0; //지역 변수 + 연산에 영향을 주지 않게 0으로 초기값을 설정한다
		for(int i = 1; i <= 10; i++) {
			sum = sum + i;   // sum += i
//			  1    0  + 1 0으로 초기값을 설정하지 않으면 + 연산 과정에서 오류 발생
//			  3    1  + 2
			System.out.println("1 ~ " + i + " = " + sum);
		}
//		System.out.println(i);  for문 안에서 사용된 i는 지역변수이기에 
//		                        for문 바깥에서 사용 불가능
		System.out.println("sum = " + sum); // sum 변수는 메인 메소드에서 정의 되었기에
//		                                       for문 바깥에서도 사용가능
		
		

	}

}
