package p2023_07_17;

public class Break02 {

	public static void main(String[] args) {
		
//	while문을 이용한 무한루프에 대해 break문 사용
		
		
		int i = 1;
		while(true) { // 조건식에 true를 쓰면 조건식이 항상 참이되어서 무한루프
//					  // while문을 이용한 무한루프는 조건식에 true를 작성하는
//					  // 방법이 가장 많이 쓰임
			System.out.println(i +"무한 출력");
			if(i == 100) break;
			i++;
		}
		
		
		
	}

}
