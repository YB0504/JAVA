package p2023_8_3;

public class ThrowsException {

	// 나눗셈을 구하는 메소드
	public void occurException() {
		
		try {
			int result = 3 / 0;		// 예외발생
			System.out.println(result);
			
		}catch(ArithmeticException e) {
			e.printStackTrace();
			System.out.println("0으로 나눌 수 없습니다.");
		}
	}

	public static void main(String[] args) {
		// 객체를 생성
		ThrowsException te = new ThrowsException();

		// 메소드 호출
		te.occurException();
	}
}