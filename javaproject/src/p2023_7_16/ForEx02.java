package p2023_7_16;

public class ForEx02 {

	public static void main(String[] args) {
		
		for(int i = 1; i < 5; i++) { // 행의 번호
			for(int j = 4; j > 0; j--) { // 열의 번호
				if(i < j) { // i가 j보다 작다면
//					System.out.println(" ");
					System.out.print(" "); // 공백을 줄을 바꾸지 않고 출력하라
				}else {
					System.out.print("*"); // 아니라면 * 를 출력하라
				}
			}
			System.out.println(); // for문을 빠져나올때 행마다 줄을 바꿔라
		}
		
		
		
		
	}

}
