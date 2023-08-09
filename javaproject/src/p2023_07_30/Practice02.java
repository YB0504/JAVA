package p2023_07_30;

public class Practice02 {

	public static void main(String[] args) {

		for (int n = 2; n <= 9; n++) {
			System.out.print("[" + n + "단]" + "\t");
		}
		for (int i = 1; i <= 9; i++) {
			System.out.println();
			for (int n = 2; n <= 9; n++) {
				System.out.print(n + "*" + i + "=" + i * n + "\t");
			}
		}

	}

}
