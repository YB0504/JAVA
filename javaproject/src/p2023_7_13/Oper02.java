package p2023_7_13;

public class Oper02 {

	public static void main(String[] args) {
		
// 연결 연산자 : +		
		String str1 = "자바";
		String str2 = str1 + "오라클";
		System.out.println("str1 = " + str1); // str1 = 자바
		System.out.println("str2 = " + str2); // str2 = 자바오라클
		
		String str3 = "파이썬";
		String str4 = "스프링";
		System.out.println(str3 + str4); // 파이썬스프링
		
		int i = 50;
		System.out.println(str3 + i); // 파이썬50
		// 산술적인 연산이 아니기 때문에 문자로서 결합됨
		
		String str5 = str3 +50;
		System.out.println("str5 = " + str5); // str5 = 파이썬50
		
		
		
	}

}
