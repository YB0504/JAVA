package p2023_08_06;

class Car {
	private int speed;
	private boolean stop;

	public int getSpeed() {
		return speed;
	}

	public boolean isStop() {
		return stop;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public void setStop(boolean stop) {
		this.stop = stop;
	}

}

public class MethodEx04 {

	public static void main(String[] args) {

		Car myCar = new Car();

		myCar.setSpeed(60);

		if (!myCar.isStop()) {
			myCar.setStop(true);
		}
		System.out.println(myCar.getSpeed());

	}

}
