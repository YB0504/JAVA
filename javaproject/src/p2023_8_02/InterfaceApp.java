package p2023_8_02;

interface Calculable{
	double PI = 3.14;
	int sum(int v1, int v2);
}
interface Printable{
	void print();
}

class RealCal implements Calculable, Printable{
	public int sum(int v1, int v2) {
		return v1 + v2;
	}

	@Override
	public void print() {
		System.out.println("!!!!!");
	}
	
}

public class InterfaceApp {

	public static void main(String[] args) {
		RealCal c = new RealCal();
		System.out.println(c.sum(2, 1));
		c.print();
		System.out.println(c.PI);
	}

}
