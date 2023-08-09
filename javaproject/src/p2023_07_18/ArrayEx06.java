package p2023_07_18;

public class ArrayEx06 {

	public static void main(String[] args) {
		
//	향상된 for문 (확장 for문)
//	형식 : for( 변수 : 순차적인 자료구조(배열, List)){
//			  실행될 문자;
//		순차적인 자료구조에서 변수로 값을 넘겨준다
//		}
		int[] scores = {95, 71, 84, 93, 87};
		
//		1. 기본 for문	
		
		int sum =0;
		for(int i = 0; i < scores.length; i++) {
			sum += scores[i];
		}System.out.println("총합 : " + sum);
		
		
//		2. 향상된 for문
		int sum1 = 0;
		for(int s: scores) // 변수 : 배열
			sum1 += s;
		System.out.println("총합 : " + sum1);
	}

}
