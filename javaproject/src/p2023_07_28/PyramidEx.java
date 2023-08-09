package p2023_07_28;

public class PyramidEx {

	public static void main(String[] args) {
		
		// 역방향 피라미드
		for(int i = 1; i < 5; i++) {
			for(int j = 4; j > 0; j--) {
				if(i < j) {
					System.out.print(" ");
				}else {
					System.out.print("*");
				}
			}System.out.println();
		}
		
	}

}
