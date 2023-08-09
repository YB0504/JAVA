package p2023_08_03;

public class ThrowException {

//	ArrayIndexOutOfBoundsException 
//	: 배열의 범위를 벗어 났을때 발생하는 예외

//	프로그래머가 강제로 예외를 발생시키는 방법
//	throw + new 예외클래스();

	public void exceptionMethod() throws ArrayIndexOutOfBoundsException {
		// 배열 선언
		int[] intA = { 1, 2, 3, 4 };

		// 배열의 저장된 값을 출력
		for (int i = 0; i < 10; i++) {
			if (i == 3) // 프로그래머가 예외를 발생시킴
				throw new ArrayIndexOutOfBoundsException();
			System.out.println(intA[i]);
		}
	}

	public static void main(String[] args) {
		ThrowException te = new ThrowException();

		try {
			te.exceptionMethod();
		} catch (ArrayIndexOutOfBoundsException ab) {
			System.out.println("배열의 index를 초과했습니다.");
			ab.printStackTrace();
		}

	}// main() end
}