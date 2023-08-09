package p2023_07_18;

public class ArrayEx01 {

	public static void main(String[] args) {
		
//	배열 : 동일한 자료형의 데이터를 저장하기 위한 정적인 자료구조
//	변수 -> 배열 -> 자료구조(List)
		
//	1차원 배열 첫번째 형식 : 배열에 저장될 값이정해져 있지 않은 경우
//	1차원 배열 두번째 형식 : 배열 선언과 동시에 초기화를 해야하는 경우
//						(배열에 할당될 값이 정해져 있는 경우)
		
		int[] score = new   int[3];
//		자료형  배열변수  연산자 자료형[배열의 크기]
//		[]는 자료형이나 배열변수명 뒤에 와도 상관없다.
//		int score[] = new   int[3];
		
//		int형 배열은 자동으로 0으로 초기화가 되기 때문에
//		꼭 값을 할당 해줘야 원하는 값이 출력된다.
		System.out.println(score[0]);
		System.out.println(score[1]);
		System.out.println(score[2]);
		
		score[0] = 80;
		score[1] = 90;
		score[2] = 100;
		
		System.out.println(score[0]);
		System.out.println(score[1]);
		System.out.println(score[2]);
		
		double[] d = new double[3]; // 8byte 공간을 자동으로 생성
//		double 형의 배열은 0.0으로 초기화
		
		System.out.println(d[0]);
		System.out.println(d[1]);
		System.out.println(d[2]);
		
//		char 배열은 자동으로 초기화가 되지 않는다.
		char[] c = new char[3];
		System.out.println(c[0]);
		System.out.println(c[1]);
		System.out.println(c[2]);
		
//		boolean 배열은 false값으로 초기화가 된다.
		boolean [] b = new boolean[3];
		System.out.println(b[0]);
		System.out.println(b[1]);
		System.out.println(b[2]);
		
//		따로 초기화가 되지 않지만 null값으로 출력됨
		String[] str = new String[3];
		System.out.println(str[0]); // null : 값이 없다
		System.out.println(str[1]);
		System.out.println(str[2]);
		
		str[0] = "자바";
		str[1] = "오라클";
		str[2] = "스프링";
		System.out.println(str[0]);
		System.out.println(str[1]);
		System.out.println(str[2]);
		
//		1차원 배열의 두번째 형식 : 배열 선언과 동시에 초기화를 할때 주로 사용
//							  (배열에 할당될 값이 정해져 있는 경우에 주로 사용)
		
		int[] s = {80, 90, 100};
//		int[] s = {80, 90, 100, 3.14}; // 반드시 한가지 자료형의 데이터만 저장가능
		int[] s1 = new int[] {80, 90, 100}; //new 연산자는 써도되고 쓰지 않아도 된다.
		System.out.println(s[0]);
		System.out.println(s[1]);
		System.out.println(s[2]);
		
		System.out.println("배열의 크기 : " + s.length); // 배열의 크기를 구하는 방법(방의 개수)
//											  속성(속성은 괄호가 없다)
		for(int i = 0; i < s.length; i++) // 반드시 배열의 크기보다 작도록 부등호 설정
			System.out.print(s[i] + "\t");
		System.out.println();
		
		double[] dd = {3.14, 10.5, 42.195, 50}; 
		// double형은 정수값을 넣어도 자동형변환 되어 출력
		System.out.println("배열의 크기 : " + dd.length);
		for(int i = 0; i < dd.length; i++) {
			System.out.print(dd[i] + "\t"); // 3.14 	10.5	42.195	50.0
		}System.out.println();
		
		char[] cc = {'j', 'a', 'v', 'a', '자', '바'};
		for(int i = 0; i < cc.length; i++) {
			System.out.print(cc[i] + "\t");
		}System.out.println();
		
		boolean[] bb = {true, false, true};
		for(int i = 0; i < bb.length; i++) {
			System.out.print(bb[i] + "\t");
		}System.out.println();
		
		String[] str1 = {"java", "jsp", "oracle"};
		String[] str2 = new String[] {"java", "jsp", "oracle"};
		for(int i = 0; i < str1.length; i++) {
			System.out.print(str1[i] + "\t");
		}System.out.println();
		
		
		
		
		
	}

}
