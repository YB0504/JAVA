package p2023_07_17;

public class Continue01 {

	public static void main(String[] args) {
		
//	continue문
//	다시 반복문으로 돌아가라는 뜻으로 사용 (주로 if문과 사용)
//  for, while, do ~ while 문에서만 사용
//	1. 반복문 안에서 사용되며, 다시 반복문으로 돌아가라는 의미를 가짐
//	2. continue문이 실행되면, 
//	   continue아래쪽의 내용은 실행되지 않고 다시 반복문으로 돌아간다
		
		for(int i = 1; i <= 10; i++) {
			
			if(i == 5) continue;
			System.out.println("출력 :  " + i);
//			출럭 : 5 는 출력되지 않는다
		}
		
	}

}
