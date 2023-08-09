package p2023_07_26;

public class Practice2 {

	public static void main(String[] args) {

		int[][] score = { 
				{ 80, 90, 54 }, 
				{ 75, 75, 84 }, 
				{ 84, 74, 89 }, 
				{ 95, 98, 78 }, 
				{ 87, 84, 57 }, };
		
		int[] n1 = new int[3];
		int[] n2 = new int[5];

		String[] sub = { "국어", "영어", "수학" };
		String[] stu = { "1", "2", "3", "4", "5" };

		int i, j;

		System.out.println("과목 총점");

		for (int j1 = 0; j1 < 3; j1++) {
			for (int i1 = 0; i1 < 5; i1++) {
				sub[j1] += score[j1][i1];

			}
		}

	}

}
