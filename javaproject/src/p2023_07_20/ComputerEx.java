package p2023_07_20;

class Computer {

	// 주소 값 전달에 의한 메소드 호출방식(Call by Reference)
	int sum1(int[] values) { // heap메모리 상에 주소값을 전달받지 못한 상태
		// 매개 변수가 참조형
		int sum = 0; // 합이 누적될 변수 sum 값 초기화
		for (int i = 0; i < values.length; i++) { // 루프를 돌릴 변수
			sum += values[i]; // sum = sum + values[i]
		}
		return sum;
	}
	// vargus : 전달된 값은 배열로 받는다.
	// 매개 변수의 개수와 상관없이 모두 받을 수 있다.
	int sum2(int... values) {
		int sum = 0;
		for (int i = 0; i < values.length; i++) {
			sum += values[i];
		}
		return sum;
	}
}

public class ComputerEx {

	public static void main(String[] args) {

		Computer myCom = new Computer();

		int[] values1 = { 1, 2, 3 }; // 1차원 배열의 두번째 형식
		// heap 메모리 상에 값을 만들고 values1이 주소값을 가진다
		int result1 = myCom.sum1(values1);
		//	값을 리턴받는 변수		sum1 변수를 호출
		System.out.println("result1 : " + result1);

		int result2 = myCom.sum1(new int[] {1, 2, 3, 4, 5});// 배열의 주소값을 저장
								// 값을 받는 변수가 없기 때문에 재사용이 안됨
		System.out.println("result2 : " + result2);

		int result3 = myCom.sum2(1, 2, 3);
		System.out.println("result3 : " + result3);

		int result4 = myCom.sum2(1, 2, 3, 4, 5);
		System.out.println("result4 : " + result4);

	}

}
