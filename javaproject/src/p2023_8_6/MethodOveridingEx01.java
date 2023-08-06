package p2023_8_6;

class Tire {
	public void run() {
		System.out.println("일반타이어");
	}
}

class SnowTire extends Tire {
	@Override
	public void run() {
		System.out.println("스노우 타이어");
	}

}

public class MethodOveridingEx01 {

	public static void main(String[] args) {

		SnowTire st = new SnowTire();
		Tire tr = st;
		
		st.run();
		tr.run();
	}

}
