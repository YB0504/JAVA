package p2023_7_18;

public class ArrayEx02 {

	public static void main(String[] args) {
		
		int[] scores = {83, 90, 87};
		
		System.out.println("scores[0] : " +scores[0]);
		System.out.println("scores[1] : " +scores[1]);
		System.out.println("scores[2] : " +scores[2]);
//		초기값 설정
		int sum = 0; // 지역변수이기 때문에 자동으로 초기화가 되지 않는다.
		for(int i = 0; i < scores.length; i++) {
			sum += scores[i]; // 배열의 값들을 sum변수에 누적
		}
		System.out.println("총합 : " + sum);
		double avg = (double) sum / 3; 
		// 소수점까지 표시하기 위하여 double형으로 강제형변환
		System.out.println("평균 : " + avg);
		
//		평균값을 소수점 둘째자리까지 출력하세요
		System.out.printf("평균 : %.1f", avg );
//		System.out.printf("%.1f\n", d); // 소수 첫째자리까지 출력
//		System.out.printf("%.2f\n", d); // 소수 둘째자리까지 출력
//		5이상 반올림
//		printf는 줄바꿈 기능이 없음
		
	}

}
