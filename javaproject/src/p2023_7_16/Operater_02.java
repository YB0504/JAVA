package p2023_7_16;

public class Operater_02 {

	public static void main(String[] args) {
		
//		 조건 연산자 ? :
		
		int score = 85;
		char grade = (score > 90) ? 'A' : ((score > 80) ? 'B' : 'C');	
		System.out.println(score + "점은" + grade + "등급입니다");
		
		
		
	}

}
