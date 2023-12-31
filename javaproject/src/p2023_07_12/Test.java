package p2023_07_12;

// java.lang 패키지 안에 들어있는 클래스는 import를 생략할 수 있다.

/*import java.util.String;
import java.util.System;
내부적으로 import 되어있는 클래스
import java.util.Date;
import java.util.Random;*/
import java.util.*; 
// 모든 클래스와 인터페이스를 포함하는 형태

public class Test {
// public = 접근제어자
// 사용자 정의 클래스
	public static void main(String[] args) {
// 접근제어자 공유(정적메소드) main = main메소드 [] 는 배열 (위치변경가능) args 매개변수(변경가능)
// main () 메인 메소드는 자바가상머신(JVM: java.exe)이 가장 먼저 호출하는 메소드이다.
// 1개의 클래스가 독립적으로 실행되기 위해서는 반드시 main메소드가 필요하다.

		System.out.println("java 출력 성공");
		System.out.println("java 출력 성공");
		System.out.println("오라클");
		System.out.println("파이썬");

		Date d = new Date();
		System.out.println(d);

		Random r = new Random();
		System.out.println(r.nextInt(10)); // 0 ~ 9 난수 발생

	}
}
