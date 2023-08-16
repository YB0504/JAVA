package JavaTest2;

public class testNum {

	public static void main(String[] args) {

		int n1 = 60;
		int n2 = 24;

		for (int i = 24; i <= 60; i--) {
			if (n1 % i == 0 && n2 % i == 0) {
				System.out.println("60과 24의 최대 공약수 : " + i);
				break;
			}
		}

	}

}
