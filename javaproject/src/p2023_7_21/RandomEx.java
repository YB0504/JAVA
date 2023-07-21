package p2023_7_21;

import java.util.Random;

public class RandomEx {

	public static void main(String[] args) {
		
//	난수 발생 방법 : 1. Math.random()
//				  2. Random 클래스
		
		//	다시 Random을 사용하게 되면 다시 작성해야 해서 추천하지 않는다.
		java.util.Random r1 = new java.util.Random();
		
		Random r = new Random();
//		정수 형태의 난수를 발생시키는 경우
//		nextInt(), nextInt(int bound)
//						  난수의 범위를 정할 때
		int n1 = r.nextInt(10);		// 0 ~ 9
		System.out.println("n1 = " + n1);
		
		int n2 = r.nextInt(45) + 1;	// 1 ~ 45
		System.out.println("n2 = " + n2);
		
		for(int i = 0; i <= 5; i++) {
			System.out.print(r.nextInt(45) + 1 + "\t");
//			위의 방법이 난수 발생시에 다루기 수월하다.
		}
		System.out.println();
		// 0.0 <= Math.random() < 1.0
		int n3 = (int)(Math.random() * 45) + 1;
		System.out.println("n3 = " + n3);
		
		for(int i = 0; i <= 5; i++) {
			System.out.print((int)(Math.random() * 45) + 1);
		}
		
		
		
		
	}

}
