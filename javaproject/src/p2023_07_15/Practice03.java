package p2023_07_15;

public class Practice03 {

	public static void main(String[] args) {
		
//		다중 for문을 사용하여 구구단을 가로로 2~9단까지 출력하세요
		for(int dan = 2; dan <= 9; dan++) {
			System.out.print("[" + dan + "단]\t");
		}
		for(int i = 1; i <= 9; i++) {
			System.out.println();
				for(int dan = 2; dan <= 9; dan++) {
					System.out.print(dan + "*" + i + "=" + dan * i +"\t");
				}
			}		
		
		
		
	}

}
