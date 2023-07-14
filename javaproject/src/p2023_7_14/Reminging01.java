package p2023_7_14;

public class Reminging01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 증감 연산자

		int x = 10;
		int y = 10;
		int z;

		System.out.println("--------------");
		x++;
		++x;
		System.out.println("x = " + x);

		System.out.println("--------------");
		y--;
		--y;
		System.out.println("y = " + y);

		System.out.println("--------------");
		z = x++;
		System.out.println("z = " + z);
		System.out.println("x = " + x);

		System.out.println("--------------");
		z = ++x;
		System.out.println("z = " + z);
		System.out.println("x = " + x);

		System.out.println("--------------");
		z = ++x + y++;
		System.out.println("z = " + z);
		System.out.println("x = " + x);
		System.out.println("y = " + y);

	}

}
