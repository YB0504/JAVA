package p2023_7_18;

public class ArrayEx04 {

	public static void main(String[] args) {
		
//	배열에 저장된 데이터중 최대,최소값을 비교
		
		double[] data = {9.5, 7.0, 13.6, 7.5, 10.5};
		
		double max, min;
		max = data[0]; // 0번 배열의 값을 각각의 초기값으로 설정
		min = data[0];
		
		for(int i = 1; i < data.length; i++) {
			if(data[i] > max) max = data[i];
			if(data[i] < min) min = data[i];
		}
			System.out.println("max : " + max);
			System.out.println("min : " + min);
		
		
	}

}
