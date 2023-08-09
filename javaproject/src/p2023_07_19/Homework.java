package p2023_07_19;

public class Homework {

	public static void main(String[] args) {
//		배열 방 개수 
		int[][] gugudan = new int[8][9];

//		반복문 행과 열을 곱하는 루프
		for (int g = 0; g < gugudan.length; g++) { // 행
			for (int i = 0; i < gugudan[g].length; i++) { // 열
//							// g배열 행의 식을 모든 열에 반속 수행

//				구구단을 각 배열의 값에 설정
				gugudan[g][i] = (g + 2) * (i + 1);
			}//					 0 + 2	   0 + 1
		}
//				 출력 하는 루프
		for (int g = 0; g < gugudan.length; g++) {
			for (int i = 0; i < gugudan[g].length; i++) {
				System.out.print(gugudan[g][i] + "\t");
//				System.out.print((g+2) + "*" + (i+1) + "=" + gugudan[g][i] + " ");
			}
			System.out.println();
		}
	}

}
