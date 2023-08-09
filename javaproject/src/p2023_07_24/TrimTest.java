package p2023_07_24;

public class TrimTest {

	public static void main(String[] args) {

//	trim() : 문자열 좌, 우의 공백을 없애주는 역할
//	boolean equals() : 문자열 값을 비교하는 역할

		String str1 = new String("gemini   ");
		String str2 = new String("   gemini ");

		System.out.println(str1.equals(str2));	// false
		System.out.println(str1.trim().equals(str2.trim())); // true
	}
}
