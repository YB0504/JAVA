package p2023_07_19;

class MyDate04 { // 필드
// default 접근 제어자
	int year;
	int month;
	int day;

	public MyDate04() { // 기본 생성자
		year = 2023;
		month = 4;
		day = 1;
	}

	public MyDate04(int year, int month, int day) {
		// 매개 변수가 있는 생성자
		this.year = year;
		this.month = month;
		this.day = day;
	}

	public void print() {
		System.out.println(year + "/" + month + "/" + day);
	}
}// MyDate end

public class ConstructorTest04 {
	public static void main(String[] args) {
		MyDate04 d = new MyDate04();
		d.print(); // 기본 생성자 호출
		// 접근 제어자가 private가 아니기 때문에 직접 접근 가능
		System.out.println(d.year);
		System.out.println(d.month);
		System.out.println(d.day);

		MyDate04 d2 = new MyDate04(2023, 7, 19);
		d2.print(); // 매개 변수가 있는 생성자
	}
}