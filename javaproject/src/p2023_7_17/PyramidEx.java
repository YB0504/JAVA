package p2023_7_17;

public class PyramidEx {

	public static void main(String[] args) {
		
//		다중 포문 * 그리기
		
		for(int i = 1; i < 5; i++) {
			for(int j = 1; j <= i; j++) {
				System.out.print("*");
				if(j == i) {
					System.out.println();
				}
			}
		}
		
		
	}

}
