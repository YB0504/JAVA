package p2023_07_12;

//변수의 범위 : 지역 변수(local variavle)
public class VariableEx02 {

	public static void main(String[] args) {
		
		// if문 안에서 정의된 지역변수 v2는 if문 안에서만 사용할 수 있다.
		
		int v1 = 15;
		if(v1 > 10) {
			int v2;			  // v2 : 지역변수(메모리영역 중 Stack 메모리 영역에 저장됨)
			v2 = v1 -10;      // 같은 지역변수여도 어디서 선언되었냐에 따라 사용여부가 다름
			
		}
		//int v3 = v1 + v2 + 5; // 오류발생 v2를 if 밖에서 사용해서 사용 불가
	}

}
