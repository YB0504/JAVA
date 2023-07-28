package p2023_7_28;

public class RealPyramid {

	public static void main(String[] args) {

		int r = 4;
		for (int i = 1; i <= r; i++) {
			for (int j = 1; j <= r - i; j++) {
				System.out.print(" ");
			}
			for (int k = 1; k <= i; k++)
				System.out.print("* ");
			System.out.println();
		}

//		int rows = 4;
//		for (int i = 1; i <= rows; i++) {
//		    // 공백 출력
//		    for (int j = 1; j <= rows - i; j++) {
//		        System.out.print(" ");
//		    }
//		    
//		    // '*' 출력
//		    for (int k = 1; k <= i; k++) {
//		        System.out.print("* ");
//		    }
//		    
//		    System.out.println();
//		}
	}

}
