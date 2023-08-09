package p2023_07_12;

import java.util.ArrayList;
import java.util.List;

public class Variable {
// 변수
	public static void main(String[] args) {
		
// 변수 : 메모리상에 데이터를 저장하기 위한 기억 공간의 이름
// 변수를 만드는 방법 : 자료형 변수명 = 데이터(값);

// 기본 자료형 변수 (자료형에 할당하는 데이터가 일치가 되야함)
// 1. 정수형 변수
		byte b1 = 10; // -128 ~ 127 1byte
		// byte b2 = 130; // 오버플로우 발생
		
		System.out.println("b1-" + b1); // 변수명은 "",'' 를 써서는 안됨
		
		short s = 100; // -32,768 ~ 32767 2byte
		System.out.println("s=" + s);
		
		int i = 1000; // 약 -21억 ~ 21억 4byte
		System.out.println("i=" + i);
		// 일반적인 정수 값을 저장하기에 많이 사용
		
		long l = 100000L; // 가장 큰 숫자 
		System.out.println("l=" + l);
		//끝에 L, l을 붙여야만 long변수로 인식 8byte
		
// 2. 실수형 변수
		float ft1 = 3.14f; //끝에 F, f를 반드시 붙여서 사용
		float ft2 = 3.14F; //끝에 F, f를 반드시 붙여서 사용
		float ft3 = (float)3.14; // double형 을 float형으로 강제 형변환
		// 소수점 7자리, 4byte
		double d = 42.195;
		// 소수점 15자리, 8 byte 거의 대부분의 실수를 double형으로 출력		
		
		System.out.println("ft1=" + ft1);
		System.out.println("ft2=" + ft2);
		System.out.println("ft3=" + ft3);
		System.out.println("d=" + d);
		
		System.out.printf("%.1f\n", d); // 소수 첫째자리까지 출력
		System.out.printf("%.2f\n", d); // 소수 둘째자리까지 출력
		// 5이상 반올림
		// printf는 줄바꿈 기능이 없음
		
// 3. 문자형
		char c1 = 'A';
//		char c2 = 'AB'; //오류발생 
		char c3 = '안';
		// 영한 상관없이 한글자만 저장 가능
		// 대부분 String 변수로 표현하기에 잘 사용하지 않음
		
		System.out.println("c1=" + c1);
		System.out.println("c3=" + c3);
		
// 4. 논리형 변수 (참, 거짓)
		boolean bn1 = true;
		boolean bn2 = false;

		System.out.println("bn1=" + bn1);
		System.out.println("bn2=" + bn2);
		
// 참조형 변수 : 클래스 (주소값을 저장하는 것으로 따짐)
// Stack 메모리 영역에 주소값, Heap 메모리 영역에 값을 저장		
		String s1 = "자바"; // 반드시 ""안에 저장
		String s2 = new String("자바"); 
		
		System.out.println("s1=" + s1);
		System.out.println("s2=" + s2);
		
		if(s1 == s2) { // 주소를 비교 (비교 연산자)
			System.out.println("같은 주소");
		}else {
			System.out.println("다른 주소");
		}
		
		if(s1.equals(s2)) { //데이터 (값)을 비교
			System.out.println("같은 값");
		}else {
			System.out.println("다른 값");
		}
		
// 참조형 변수 : 배열 (동일한!! 자료형 데이터를 저장하기 위한 정적인 자료구조)
		int[] score = {80, 90, 100}; // 변수가 가진 주소의 방(배열)의 갯수
		
		System.out.println(score[0]);
		System.out.println(score[1]);
		System.out.println(score[2]);
		
		for(int j = 0; j < score.length; j++) { // 반복문
			System.out.print(score[j] + "\t"); // println 이아닌 print
		}
		System.out.println();
		
// 참조형 변수 : 인터페이스(List) 배열을 확장한 개념
// 1. 순차적인 자료구조		
// 2. 여러가지 자료형의 데이터를 모두 저장할 수 없다.
// 3. 동적으로 공간의 크기를 늘릴 수 있다.
		// 인터페이스는 자체적으로 객체생성읋 하지 못함
//		List list = new List(); // 오류발생
		List list = new ArrayList(); // 상속받을 클래스가 있어야 한다
		list.add(30);
		list.add(3.14);
		list.add('j');
		list.add(true);
		list.add("자바");
		
		for(int k = 0; k < list.size(); k++) { // 증감 연산자
			System.out.print(list.get(k) + "\t");
			
		}
	}

}
