package p2023_07_19;

class MyDate06 {
	// 필드 : 객체가 생성될 때 heap메모리 상에 값을 저장하는 역할
	private int year;
	private int month;
	private int day;

//	생성자 : 객체가 생성될 때 호출되면사, 필드 값을 초기화 시키는 역할
//  public MyDate(){//default 생성자
//  }  
	public MyDate06(int new_year, int new_month, int new_day) {
		year = new_year; // 2023
		month = new_month; // 7
		day = new_day; // 19
	}

//	1. 메소드 : 필드 값을 출력하는 역할
	public void print() {
		System.out.println(year + "/" + month + "/" + day);
	}
//	2. getters 메소드 : 필드 값을 메소드 호출한 곳에 돌려주는 역할
//		return문을 반드시 작성
	public int getYear() {
		return year;
	}

	public int getMonth() {
		return month;
	}

	public int getDay() {
		return day;
	}
//	3. setters 메소드 : 매개 변수를 통해서 필드 값을 수정, 변경시켜주는 역할
					// 생성자와 마찬가지로 this . (점)을 작성
	public void setYear(int year) {
		this.year = year;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public void setDay(int day) {
		this.day = day;
	}

}

public class ConstructorTest06 {
	public static void main(String[] args) {
		MyDate06 d = new MyDate06(2023, 7, 19);
		d.print(); // print 메소드
		
		d.setYear(2024); // year 값을 2024로 수정
		d.print();
		
		d.setMonth(10);
		d.print();
		
		d.setDay(25);
		d.print();
		
		System.out.println("돌려 받은 year : " + d.getYear());
		System.out.println("돌려 받은 month : " + d.getMonth());
		System.out.println("돌려 받은 day : " + d.getDay());
		
	}
}