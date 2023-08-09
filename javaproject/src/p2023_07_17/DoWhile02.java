package p2023_07_17;

public class DoWhile02 {

	public static void main(String[] args) {
		
// do ~while문으로 1 ~ 100까지 홀수, 짝수의 합을 구하는 프로그램을 작성
		
		int i = 1, odd = 0, even = 0; // 초기값
		
		do {					// 정수를 2로 나눌때 나머지는 0, 1 밖에 없기에 짝수 홀수를 나눈다.
			if(i % 2 == 1) {	// 홀수
				odd += i;
			}else {				// 짝수
				even += i;
			}
			i++;				// 증감식
		}while(i <=100);		// 조건식
			System.out.println("1 ~ 100까지의 홀수의 합" + odd);
			System.out.println("1 ~ 100까지의 짝수의 합" + even);
		
		
	}

}
