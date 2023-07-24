package p2023_7_24;

public class FindBlankIndex {
	public static void main(String[] args) {

		String message = "Java program creates many objects.";

//	length() : 문자열의 길이를 구해주는 역할
//	charAt(index) : index번호에 해당하는 문자를 1개를 구해주는 역할
		// message의 길이를 구함.
		int len = message.length();

		System.out.println(len); // len = 34;

		// message 중에서 ' '을 찾음
		for (int i = 0; i < len; i++) {
			char c = message.charAt(i);
			// 해당 인덱스의 번호를 구해서 돌려준다.
			if (c == ' ') {
				System.out.println("index = " + i);
			}
		} // for end
	}
}
