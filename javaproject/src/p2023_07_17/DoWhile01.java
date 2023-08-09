package p2023_07_17;

public class DoWhile01 {

	public static void main(String[] args) {

//	    do{
//	           반복 실행할 문장;
//	    }while(조건식);

//	do ~ while문으로 사랑해요 "사랑해요" 메세시를 10번 출력
//	조건식이 거짓인 경우에도 최소 1번은 실행된다.

		int i = 1; 			// 초기값

		do { 				// while 문과는 다르게 실행 문장이 먼저오기에 한번은 실행됨
			System.out.println(i + "사랑해요"); // 반복 실행될 문장
			i++; 			// 증감식 (증감식이 없으면 무한루프가 돌아감)
		} while (i < 11); 	// 조건식

	}

}
