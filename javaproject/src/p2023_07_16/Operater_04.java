package p2023_07_16;

public class Operater_04 {

	public static void main(String[] args) {
		
//		강제 형변환을 이용한 산술연산자 예제
//		출력 값이 5가 되도록 만드시오.
		
//		int var1 =5;
//		int var2 = 2;
//		double var3 = var1 / var2;
//		int var4 = (int)(var3 * var2);
//		System.out.println(var4);
		
		int var1 =5;
		int var2 = 2;
		double var3 = (double)var1 / var2; // 2.0
//		int로 선언된 변수인 var1, var2 중에 하나를 double로
//		강제 형변환 시켜야 소수점 아래 숫자를 버리지 않고 밑의 식에서 대입가능
		int var4 = (int)(var3 * var2);
		System.out.println(var4);
		
		
	}

}
