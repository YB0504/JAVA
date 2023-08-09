package p2023_07_25;

import java.util.Scanner;

public class JuminCheck {

	public static void main(String[] args) {

//	키보드로 주민번호를 입력 받아서 남자인지, 여자인지를 판별하는 프로그램을 작성하세요.
//	단, 주민번호 앞자리는 6자리, 뒷자리는 7자리 인지를 유효성 검사를 한다.		

		Scanner sc = new Scanner(System.in);
		
		
		// try 안에 들어가 문장은 예외가 발생할 가능성이 있는 문장이 들어감
	try {	
		System.out.println("주민번호 앞자리를 입력하세요.");
		// String 클래스에서 지원하는 메소드에 입력할 때 nextLine으로 입력받아야 한다.
		String jumin1 = sc.nextLine();

		System.out.println("주민번호 뒷자리를 입력하세요.");
		String jumin2 = sc.nextLine(); // jumin2 = "1234567"

		// 주민번호 뒷자리 첫 번째까지 추출
		// 프로그램을 안전하게 만들기 위해서 예외처리를 해야한다.
		// 추출을 해야 하는 곳에서 예외가 발생하고 예외가 발생한 구문 밑의 구문은
		// 실행되지 않고 catch 구문으로 전달된다.
		String g = jumin2.substring(0, 1);	// 예외 발생

		// 조건식을 만족하면 빠져나가 버린다.
		if (jumin1.equals("")) { // null값 : 아무런 번호를 입력하지 않았을 때 빠져나간다.
			System.out.println("주민번호 앞자리를 입력하세요.");
		} else if (jumin1.length() != 6) { // length 메소드를 사용
			System.out.println("주민번호 앞자리 여섯 자리를 입력하세요.");
		} else if (jumin2.equals("")) {
			System.out.println("주민번호 뒷자리를 입력하세요.");
		} else if (jumin2.length() != 7) {
			System.out.println("주민번호 뒷자리 일곱 자리를 입력하세요.");
			// 유효성 검사

		} else if (g.equals("1") || g.equals("3")) {
			System.out.println("남자");
		} else if (g.equals("2") || g.equals("4")) {
			System.out.println("여자");
		} else {
			System.out.println("다시 입력하세요.");
		}
	}catch(Exception e) {	//	예외가 발생하면 catch구문이 받아서 안에 들어간 구문을 출력
		System.out.println("잘못된 정보입니다.");
	}

	}

}
