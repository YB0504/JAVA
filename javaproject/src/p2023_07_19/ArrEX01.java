package p2023_07_19;

public class ArrEX01 {

	public static void main(String[] args) {
		
		int max = 0;
		int[] array = {3, 5, 4, 8, 9};
		
		for(int i = 0; i < array.length; i++) {
			if(array[i] > max) max = array[i];
		} System.out.println("max : " + max);
		
		
	}

}
