package p2023_7_16;

public class ForEx01 {

	public static void main(String[] args) {

//		for(초기값; 조건식; 증감식){
//		반복 실행할 문장;
//		}
		
		for(int i = 1; i < 5; i++) { // 행의 번호
			for(int j = 1; j <= i; j++) { // 열의 번호
				System.out.print("*"); // 줄을 바꾸지 않고 나란히 출력
				if(j == i) {
					System.out.println(); // j가 i와 같다면 다음 줄로 출력
				}
			}
		}
		
		

	}

}
