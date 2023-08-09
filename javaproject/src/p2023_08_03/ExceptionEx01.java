package p2023_08_03;

// p456
// 예외처리
public class ExceptionEx01 {

	public static void main(String[] args) {

		String data1 = null;
		String data2 = null;
		try {
			data1 = args[0]; // 예외발생
			data2 = args[1];
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("실행 매개값의 수가 부족합니다.");
			System.out.println(e.toString());
			return; // 메소드를 완전히 빠져나가 버리려면 return구문을 쓰면 된다.
		} // 메인메소드를 빠져나가기 때문에 아랫쪽의 내용이 실행되지 않는다.

		try {
			int value1 = Integer.parseInt(data1);
			int value2 = Integer.parseInt(data2);
			int result = value1 + value2;
			System.out.println(data1 + "+" + data2 + "=" + result);
		} catch (NumberFormatException e) {
			System.out.println("숫자로 변환할 수 없습니다.");
			
// finally 안에 들어있는 내용은 예외가 발생하건, 안하건 무조건 실행된다.
		} finally {
			System.out.println("다시 실행하세요.");
		}

	}

}
