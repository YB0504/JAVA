package p2023_8_5;

public class ArrayEx02 {

	public static void main(String[] args) {
		
		int[][] arr = {
				{5, 5, 5, 5, 5,},
				{20, 20, 20, 20, 20},
				{30, 30, 30, 30, 30},
				{40, 40, 40, 40, 40}
		};
		
		int total = 0;
		float avg = 0;
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				total += arr[i][j]; 
			}
		}
		
		avg = total / (float)(arr.length * arr[0].length);
		System.out.println("total : " + total);
		System.out.println("avg : " + avg);
		

	}

}
