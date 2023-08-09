package p2023_08_05;

public class ArrayEx03 {

	public static void main(String[] args) {

		int[] ballarr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int[] ball3 = new int[3];

		for (int i = 0; i < ballarr.length; i++) {
			// 배열의 임의의 요소를 골라서 위치를 바꾼다.
			// 0 ~ 배열의 길이 값 미만의 정수
			int j = (int) (Math.random() * ballarr.length);
			int tmp = 0;

			// ballarr 배열의 요소를 랜덤으로 섞는 코드
			tmp = ballarr[i];
			ballarr[i] = ballarr[j];
			ballarr[j] = tmp;
			
		}
		
		// 배열ballarr의 앞에서 3개의 수를 ball3 배열로 복사한다.
		// 앞의 배열에서 뒤의 배열로 인덱스 0부터 시작해서 3개의 요소까지 복사
		System.arraycopy(ballarr, 0, ball3, 0, 3);
		
		for (int i = 0; i < ball3.length; i++) {
			System.out.print(ball3[i]);
		}

	}

}
