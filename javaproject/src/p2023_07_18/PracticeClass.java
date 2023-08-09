package p2023_07_18;

public class PracticeClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str1 = "ㅇㅇㅇ";
		String str2 = "ㅇㅇㅇ";
		// 주소값과 값이 같다
		
		if(str1 == str2) {
			System.out.println("str1 과 str2는 주소값이 같음");
		}else {
			System.out.println("str1 과 str2는 주소값이 다름");
		}
		if(str1.equals(str2)) {
			System.out.println("str1과 str2는 값이 같다");
		String str3 = new String ("ㅇㅇㅇ");
		String str4 = new String ("ㅇㅇㅇ");
//		new연산자를 사용함으로서 주소값과 값이 따로 비교된다
		
		if(str3 == str4) {
			System.out.println("str3 과 str4는 주소값이 같음");
		}else {
			
		}		System.out.println("str3 과 str4는 주소값이 다름");
		
		if(str3.equals(str4)) {
			System.out.println("str3과 str4는 값이 같다");
		}
}
}
}