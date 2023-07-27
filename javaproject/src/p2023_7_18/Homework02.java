package p2023_7_18;

public class Homework02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] score = {
						{ 85, 60, 70 },
						{ 90, 95, 80 }, 
						{ 75, 80, 100 }, 
						{ 80, 70, 95 }, 
						{ 100, 65, 80 } };
		int[] subject = new int[3]; // 열
		int[] student = new int[5];	// 행

		String[] subName = { "국어", "영어", "수학" };
		String[] stuName = { "1", "2", "3", "4", "5" };

		int r, c;

		System.out.println("각 과목별 총점구하기 ");

		for (c = 0; c < 3; c++) {
			for (r = 0; r < 5; r++) {
				subject[c] += score[r][c];
			}
			System.out.println(subName[c] + " 총점 : " + subject[c]);

		}

		System.out.println("학생별 총점구하기");
		for (r = 0; r < 5; r++) {
			for (c = 0; c < 3; c++) {
				student[r] += score[r][c];
			}
			System.out.println(stuName[r] + "번 학생" + "총점 : " + student[r]);
		}

	}
}