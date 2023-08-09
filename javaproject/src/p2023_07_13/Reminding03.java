package p2023_07_13;

public class Reminding03 {

	public static void main(String[] args) {
		
		// 기본 타입과 문자열 간의 변환
		
		// 문자열을 기본타입으로 강제 변환
		int i1 = Integer.parseInt("10");
		double b2 = Double.parseDouble("3.14");
		boolean b3 = Boolean.parseBoolean("true");
		
		System.out.println("i1 : " + i1);
		System.out.println("b2 : " + b2);
		System.out.println("b3 : " + b3);
		
		// 기본타입을 문자열로 강제 변환
		String s1 = String.valueOf(10);
		String s2 = String.valueOf(3.14);
		String s3 = String.valueOf(true);
		
		System.out.println("s1 : " + s1);
		System.out.println("s2 : " + s2);
		System.out.println("s3 : " + s3);
		
	}

}
