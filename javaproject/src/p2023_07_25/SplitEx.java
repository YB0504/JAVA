package p2023_07_25;

import java.util.StringTokenizer;

public class SplitEx {

	public static void main(String[] args) {

//	String[] split(String regex(구분 기호))
//	: 구분기호를 기준으로 각각의 값을 배열에 전달

		String jumin = "950101-1234567";

		// 방법 1 : StringTokenizer()
		StringTokenizer st = new StringTokenizer(jumin, "-");

		String j1 = st.nextToken();
		String j2 = st.nextToken();

		System.out.println("주민번호 앞자리 : " + j1);
		System.out.println("주민번호 뒷자리 : " + j2);

		// 방법 2 : split()
		String[] j = jumin.split("-");

		System.out.println("주민번호 앞자리 : " + j[0]);
		System.out.println("주민번호 뒷자리 : " + j[1]);

		// 기본 for문
		for (int i = 0; i < j.length; i++) {
			System.out.println(j[i]);
		}

		// 향상된 for문
		for (String s : j) // j 배열의 값을 하나씩 s 변수에 전달
			System.out.println(s);

		String tel = "010-1234-5678";

		String[] t = tel.split("-");

		System.out.println("전화번호 앞자리 : " + t[0]);
		System.out.println("전화번호 중간자리 : " + t[1]);
		System.out.println("전화번호 뒷자리 : " + t[2]);

		for (int i = 0; i < t.length; i++) {
			System.out.println(t[i]);
		}

		for (String t1 : t) {
			System.out.println(t1);
		}
		
		String email = "yeo9411@naver.com";
		
		String [] e = email.split("@");
		
		System.out.println("이메일 아이디 : " + e[0]);
		System.out.println("이메일 도메인 : " + e[1]);
		
		for (int i = 0; i < e.length; i++) {
			System.out.println(e[i]);
		}

		for (String e1 : e) {
			System.out.println(e1);
		}
		
		

	}

}
