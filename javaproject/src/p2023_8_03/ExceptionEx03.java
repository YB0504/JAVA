package p2023_8_03;

// p460
public class ExceptionEx03 {

	public static void main(String[] args) {

		try {
			String data1 = args[0]; // 예외발생
			String data2 = args[1];
			int value1 = Integer.parseInt(data1);
			int value2 = Integer.parseInt(data2);
			int result = value1 + value2;
			System.out.println(data1 + "+" + data2 + "=" + result);
		} catch (ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
			System.out.println("실행 매개값의 수가 부족합니다.");
			
// 1. Exception 클래스는 예외처리 클래스 중 최상위 클래스이기 때문에
//	  모든 자식 클래스의 예외를 받아서 처리할 수 있다.
		} catch (Exception e) { // 가장 마지막에 정의해야 한다.
			System.out.println(e.getMessage());
			System.out.println("실행에 문제가 있습니다.");
		} finally {
			System.out.println("다시 실행하세요.");
		}

	}

}
