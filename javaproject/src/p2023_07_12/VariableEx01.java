package p2023_07_12;

// x와 y값을 변환하는 예제
public class VariableEx01 {

	public static void main(String[] args) {
		
		int x = 3;
		int y = 5;
		System.out.println("x:" + x + ", y:" + y);
		
		int temp = x; // temp = 3
		x = y;
		y = temp;
		System.out.println("x:" + x + ", y:" + y);
		
		
	}

}
