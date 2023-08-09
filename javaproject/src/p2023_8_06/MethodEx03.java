package p2023_8_06;

class Printer {

	static void println(int value) {
		System.out.println(value);
	}

	static void println(boolean value) {
		System.out.println(value);
	}

	static void println(double value) {
		System.out.println(value);
	}

	static void println(String value) {
		System.out.println(value);
	}

}

public class MethodEx03 {

	public static void main(String[] args) {

		Printer pt = new Printer();
		
		pt.println(10);
		pt.println(true);
		pt.println(5.7);
		pt.println("홍길동");
	}

}
