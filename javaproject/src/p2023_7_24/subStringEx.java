package p2023_7_24;

public class subStringEx {

	public static void main(String[] args) {

//	아래와 같은 주민번호가 있을 때, 남자인지 여자인지를 판별하는 프로그램을 작성

		String jumin = "950101-1234567";

		String str1 = jumin.substring(7, 8);

		// || : OR연산자
		if (str1.equals("1") || str1.equals("3")) {
			System.out.println("남자입니다.");
		} else if (str1.equals("2") || str1.equals("4")) {
			System.out.println("여자입니다.");
		} else {
			System.out.println("잘못된 정보입니다.");
		}

		char c = jumin.charAt(7);

		if (c == '1' || c == '3') {
			System.out.println("남자입니다.");
		} else if (c == '2' || c == '4') {
			System.out.println("여자입니다.");
		} else {
			System.out.println("잘못된 정보입니다.");
		}

	}
}
