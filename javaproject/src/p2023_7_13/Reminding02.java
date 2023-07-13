package p2023_7_13;

public class Reminding02 {

	public static void main(String[] args) {
		
		
		//숫자 연산
		int i1 = 10 + 2 + 8;
		System.out.println("i1 : " + i1);
		
		// 문자열 결합 연산
		String s1 = 10 + 2 + "8";
		System.out.println("s1 : " + s1);
		
		String s2 = 10 + "2" + 8;
		System.out.println("s2 : " + s2);
	
		String s3 = "10" + 2 + 8;
		System.out.println("s3 : " + s3);
				
		String s4 = "10" + (2 + 8);
		System.out.println("s4 : " + s4);
		
	}

}
