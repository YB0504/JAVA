package p2023_7_19;

public class ArrEX02 {

	public static void main(String[] args) {
		
		int [][] array = {
				{95, 86},
				{83, 92, 96},
				{78, 83, 93, 87, 88},
		};
		
		int sum = 0;
		double avg = 0.0;
		
		int s1 = 0; // 배열 요소들의 개수를 세는 변수
		for(int i = 0; i < array.length; i++) {
			for(int j = 0; j < array[i].length; j++) {
				sum += array[i][j];
				s1++;
			}
		}
		avg = (double) sum / s1;
		System.out.println("총합 : " +sum);
		System.out.printf("평균 : %.1f", + avg);
	}

}
