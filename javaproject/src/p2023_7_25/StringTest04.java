package p2023_7_25;

import java.util.*;

class StringTest04 {

	public static void main(String[] args) {

		// 생성자
		StringTokenizer str = 
						//	토큰
		new StringTokenizer("이순신#을지문덕#강감찬#광개토대왕", "#"); // # 구분기호
		
//		// 토큰을 구해오는 메소드
//		System.out.println(str.nextToken());	// 이순신
//		System.out.println(str.nextToken());	// 을지문덕
//		System.out.println(str.nextToken());	// 강감찬
//		System.out.println(str.nextToken());	// 광개토대왕
//		System.out.println(str.nextToken());	// 예외 발생
		
		
		// 파싱된 문자열이 모두 몇 개인지 되는지 알려줌
		int cnt = str.countTokens();
		System.out.println("파싱할 문자열의 총갯수-> " + cnt);
//
//		System.out.println(str.nextToken());
		
		// hasMoreToken 메소드 : 토큰의 유무를 판별하는 메소드
		while (str.hasMoreTokens()) { // 토큰이 있으면
			System.out.print(str.nextToken()+ "\t");// 차례대로 파싱된 문자열을 얻어온다.
		}	//	이순신	을지문덕	강감찬	광개토대왕	

	} // main() end

}