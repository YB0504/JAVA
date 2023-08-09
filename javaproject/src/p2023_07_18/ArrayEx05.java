package p2023_07_18;

public class ArrayEx05 {

	public static void main(String[] args) {
		
		int[] scores; // 주소를 할당 받지 못한 상태
//		int a;
		scores = new int[] {83, 90, 87}; // heap메모리상에 저장공간을 만듦
//		a = 10;
//		int[] scores = new int[] {83, 90, 87};
		
		int sum1 = 0; // 합이 누적될 변수
		for(int i = 0; i < 3; i++) {
			sum1 += scores[i];
		}
		System.out.println("총합 : " + sum1);
		
//		 add 메소드를 호출해서 리턴된 총점을 sum2에 저장
		int sum2 = add(new int[] {83, 90, 87}); // add 메소드 호출
//		밑의 메소드에 주소값을 전달
		System.out.println("총합 : " + sum2);
		System.out.println();
	}
	
//	사용자 정의 메소드 : 합을 구해서 리턴
	public static int add(int[] scores) { 
		// int형 배열뒤가 참조형 변수기 떄문에
		// 아직  주소값을 할당 받지 못한 상태 
		// 같은 int형 배열의 주소값을 전달
		int sum = 0;
		for(int i = 0; i < 3; i++) {
			sum += scores[i]; // 주소값을 받은 후 값을 참조해서 루프
		}
		return sum;
		// 메소드 앞이 자료형 변수이기 때문에 값을 리턴 시켜줘야한다.
	}
}
