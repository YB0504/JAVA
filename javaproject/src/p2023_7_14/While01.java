package p2023_7_14;

public class While01 {

	public static void main(String[] args) {
		
//		초기값 (의미 있는 식을 위해서 초기값을 설정)
//		while(조건식){
//		       반복 실행할 문장;
//			   증감식 무한루프를 방지
//		    }
		
//	while문을 이용해서 "사랑해요" 메세지 10번 출력
		
		int i = 1;		//초기값
		while(i <= 10) {	// 조건식
			System.out.println(i + " 사랑해요");
			i++;	// 증감식
		}
		
	}

}
