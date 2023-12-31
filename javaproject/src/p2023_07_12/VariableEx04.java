package p2023_07_12;

// float 과 double의 차이점
public class VariableEx04 {

	public static void main(String[] args) {
		// 실수값 저장
//		float var1 = 3.14; //컴파일 오류 
		float var1 = (float)3.14; // 강제 형 변환
		float var2 = 3.14f;
		double var3 = 3.14;
		
		// 정밀도 테스트
		float var4 = 0.1234567890123456789f; // 7자리
		double var5 = 0.1234567890123456789; // 15자리
		// 해당 변수 이상의 자릿수는 정밀도가 떨어진다
		
		System.out.println("var2: " + var2);
		System.out.println("var3: " + var3);
		System.out.println("var4: " + var4);
		System.out.println("var5: " + var5); // double형의 var5가 float형보다 2배 이상 정밀한 값을 출력
		
		//e 사용하기 e는 10을 뜻함
		double var6 = 3e6; // 10의 6승
		float var7 = 3e6F; // 10의 6승
		double var8 = 2e-3; //10의 -3승
		System.out.println("var6 " + var6);
		System.out.println("var7 " + var7);
		System.out.println("var8 " + var8);
	
	}

}
