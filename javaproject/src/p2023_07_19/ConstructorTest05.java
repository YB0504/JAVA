package p2023_07_19;

class MyDate05 { // 필드
	private int year;
	private int month;
	private int day;

//	기본 생성자는 객체를 생성할 때 컴파일러가 자동으로 생성하지만,
//	예외적으로, 매개 변수를 가진 생성자가 있을 경우에는 더 이상 기본 생성자를 만들어 주지 않는다.
	
	public MyDate05() { // 기본 생성자
	}

	public MyDate05(int new_year, int new_month, int new_day) {
		// 매개 변수가 있는 생성자 : 매개 변수로 생성된 값을 필드로 할당하는 역할
		// 매개 변수명과 필드 값이 같은 이름이면 매개 변수에서 필드로 값 전달이 안된다.
		year = new_year;
		month = new_month;
		day = new_day;
	}

	public void print() { // 생성자에서 초기화된 값들을 출력하는 역할
		System.out.println(year + "/" + month + "/" + day);
	}
}

public class ConstructorTest05 {
	public static void main(String[] args) {
		MyDate05 d = new MyDate05(); // 기본 생성자 호출
		d.print();

		MyDate05 d2 = new MyDate05(2023, 7, 19); 
		// 매개 변수가 int형이기 때문에 int형 값으로 생성자를 호출하여 초기값을 설정
		d2.print();
	}
}