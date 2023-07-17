package p2023_7_17;

public class MethodEx02 {

//	1 ~ n까지 합을 구하는 메소드
	static void sum(int n) { // 변수가 두개 필요
//							 // int n = 3
		int hap = 0; // 합이 누적될 변수
		for(int i = 1; i <= n; i++) { // for문을 이용해서 n까지 합을 구하라는 문장
			hap += i;
		}
		System.out.println("i ~ " + n + " = " + hap);
	}
	
	public static void main(String[] args) {
		
		sum(3);
		sum(5);
		sum(10);
		sum(30);
		sum(100);
		sum(1000);
		sum(10000);
		
		
	}

}
