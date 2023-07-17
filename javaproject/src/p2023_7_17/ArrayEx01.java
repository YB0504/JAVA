package p2023_7_17;

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
		
//		* 1차원 배열
//		i. 
//		    int[]       score     =     new        int[3];
//		    
//		   자료형    배열변수        연산자   배열의 크기(=방의 갯수)
//		   score[0]=80;
//		   score[1]=90;
//		   score[2]=100;
//
//		ii.
//		    int[]  score = {80, 90, 100};
//		    int[]  score = new int[]{80, 90, 100};
//		    double[] d = {3.14, 10.5, 42.195};
//		    char[]  c = {'j', 'a', 'v', 'a', '안'};
//		    String[]  str = {"java", "jsp", "oracle"};
//		    String[]  str = new String[]{"java", "jsp", "oracle"};

		
		
		
		
		
		
	}

}
