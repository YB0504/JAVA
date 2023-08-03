package p2023_8_3;

public class ThrowsEx1 {

//	예외가 발생하면 setData() 메소드를 호출한 메인 메소드로 예외를 양도해서
//	예외처리를 한다.
	public void setData(String n) throws NumberFormatException {
		if (n.length() >= 1) {	// 문자열의 길이
			String str = n.substring(0, 1);	// 문자열의 일부를 추출
			printData(str);	// 메소드 호출
		}
	}

//	예외가 발생하면 printData() 메소드를 호출한 곳에 예외를 양도한다.(떠넘기기)
	private void printData(String n) throws NumberFormatException {
		int dan = Integer.parseInt(n);
		System.out.println(dan + "단");
		System.out.println("-----------");
		for (int i = 1; i < 10; i++)
			System.out.println(dan + "*" + i + "=" + (dan * i));
	}

	public static void main(String[] args) {
		// 클래스 객체 생성
		ThrowsEx1 t1 = new ThrowsEx1();
				// args[0] = "a";	// 예외 발생
				// args[0] = "5";	// 예외 발생 X
		try {
			// 가장 위쪽의 메소드 호출
			// 양도된 예외를 받아서 처리
			t1.setData(args[0]);	// 예외 발생
		} catch (Exception e) {
			System.out.println("첫문자가 숫자가 아닙니다.");
			e.printStackTrace();
		}
	}// main() end

}
