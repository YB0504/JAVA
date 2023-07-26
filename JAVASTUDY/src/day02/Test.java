package day02;

public class Test {

	public static void main(String[] args) {

		int[] s = new int[3];
//		자료형 배열변수 	연산자	자료형[배열의 크기]
//	new 연산자 : heap메모리상에 배열 데이터를 저장하기 위한
//			   기억 공간을 생성 해주는 역할

		System.out.println(s[0]);
		System.out.println(s[1]);
		System.out.println(s[2]);

		String s1 = new String("자바");
//		자료형  변수명  연산자	생성자 호출
//		자바라고 하는 객체를 저장하기 위한 공간을 heap메모리 상에 생성하라는 표시

		String s2 = "자바"; // 처음 한번만 heap메모리상에 "자바"를 저장
		String s3 = "자바";
//		String 클래스만 new연산자를 안쓰고도 객체가 생성된다.

//		참조형 변수(클래스, 배열, 인터페이스)
//		1.stack메모리 영역에 주소값을 저장
//		2.비교 연산자(==)로 주소값을 비교한다.
//		3.값들끼리 비교할때는 equals메소드를 사용한다.
		if (s1 == s2) {
			System.out.println("same");
		} else {
			System.out.println("diffrent");
		}
		if (s2 == s3) {
			System.out.println("same");
		} else {
			System.out.println("diffrent");
		}
		//데이터 (값)을 비교
		if(s1.equals(s3)) {
			System.out.println("값이 같음");
		}else {
			System.out.println("값이 다름");
		}
	}

}
