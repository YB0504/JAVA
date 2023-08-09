package p2023_07_26;

public class Homework {
	

	public static void main(String[] args) {
		
		int[] r = new int[46];
		int count = 0;
		for (;count < 6;) { 
			int r1 = (int)(Math.random() * 45) + 1;
			if(r[r1] == 0) {
				System.out.println(r1);
				r[r1] = 1;
				count++;
			}
		}
	}
}