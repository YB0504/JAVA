package p2023_07_14;

public class For03 {

	public static void main(String[] args) {
		
// 1 ~ 100까지 홀수, 짝수의 합을 구하는 프로그램을 작성
		
		int odd = 0, even = 0;
		
		// 홀수의 합               i += 2		
		for(int i = 1; i <= 100; i = i + 2)
			odd += i;
//		for문을 벗어나면서 i의 지역변수 메모리가 삭제 된다
		// 짝수의 합
		for(int i = 0; i <= 100; i += 2)
			even += i;
		
		System.out.println("1 ~ 100 홀수의 합" + odd);
		System.out.println("1 ~ 100 짝수의 합" + even);
		
	}

}
