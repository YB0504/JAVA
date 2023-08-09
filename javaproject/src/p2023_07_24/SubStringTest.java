package p2023_07_24;

public class SubStringTest {
	public static void main(String[] args) {

//	subString() : 전체 문자열에서 특정 범위의 문자를 추출하는 역할
//	1. subString(int beginIndex) : 해당 인덱스 번호부터 끝까지 문자를 추출하는 역할
//	2. subString(int beginIndex, int endIndex) : 해당 인덱스 번호부터
//	   endIndex - 1까지 문자를 추출하는 역할

		String message = "Java program creates many objects.";

		// 인덱스 번호 13번부터 끝까지 문자를 추출
		String str1 = message.substring(13);
		System.out.println(str1);

		// 인덱스 번호 13번부터 15번까지 문자를 추출
		String str2 = message.substring(13, 16);
		System.out.println(str2);
	}
}
