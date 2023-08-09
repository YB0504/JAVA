package p2023_07_17;

public class Pyramid {

	public static void main(String[] args) {
		
//		for문을 활용한 역방향 *그리기
		
		for(int i = 1; i < 5; i++) {
			for(int j = 4; j > 0; j--) {
				if(i < j) {
					System.out.print(" ");
				}else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
		
		
		
	}

}
