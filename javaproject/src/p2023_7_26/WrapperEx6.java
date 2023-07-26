package p2023_7_26;

public class WrapperEx6 {

	public static void main(String[] args) {

//	숫자를 문자열로 변환

		String str1 = String.valueOf(10);
		String str2 = String.valueOf(10.5);
		String str3 = String.valueOf(true);

		Integer it = new Integer(30);
		String str4 = it.toString();
		// Integer객체를 String형태로 변환해주는 메소드

		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
		System.out.println(str4);

	}

}
