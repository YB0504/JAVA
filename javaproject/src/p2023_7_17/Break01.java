package p2023_7_17;

public class Break01 {

	public static void main(String[] args) {
		
//	무한루프 : for문
//	break : 반복문을 빠져 나오는 역할
// 		"무한 출력"을 100번 출력
		for(int i = 1;; i++) {
			System.out.println(i + "무한 출력");
			if(i == 100) break; // break문앞에 조건식을 사용하여
								// 무한루프를 빠져나옴
		}
		
	}

}
