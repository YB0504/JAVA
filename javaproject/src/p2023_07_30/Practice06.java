package p2023_07_30;

public class Practice06 {

	public static void main(String[] args) {
//		for(int i = 0; i <= 10; i++) {
//			for(int j = 0; j <= i; j++)
//				System.out.print("*");
//			System.out.println();
//		}
//		int i = 0;
//		while (i <= 10) {
//			int j = 0;
//			if (j <= i) {
//				System.out.print("*");
//				j++;
//			}
//			System.out.println();
//			i++;
//		}
//		다중 while
		int i = 0;
		while (i <= 10) {
		    int j = 0; // j 변수는 루프 내부로 이동
		    while (j <= i) {
		        System.out.print("*");
		        j++;
		    }
		    System.out.println();
		    i++;
		}


	}

}
