package p2023_08_02;

public class DivideZeroExceptionHandling2 {
	public static void main(String[] args) {

		int b = 20;
		int a = 0;
		int c = 0;

		try {
			c = b / a; 					// 예외 발생
			int total = a + b;
			int sub = b - a;
			System.out.println(c);
		} catch (Exception e) {

			// java.lang.Throwable의 메소드
			// 예외 정보를 자세히 출력
			e.printStackTrace();
//			System.out.println(e.printStackTrace()); 
//			출력기능이 내장되어 있기 때문에 이런 식으로 작성하면 오류가 발생한다.

			// 예외 정보를 문자열로 반환함.
			System.out.println(e.getMessage());

			// 예외의 간단한 설명문을 반환함.
			System.out.println(e.toString());
			
			System.out.println("0으로 나눌수 없습니다.");
			
		}
	}// main end
}
