package p2023_07_19;

//* 자바의 접근 제어자
//
//
// 접근제어자  	자신의클래스  	    같은패키지              하위클래스     다른패키지
//
// private 			O	      	    X	   	            X            X
//
// 생략(default)   	O      	       	O            		X	         X
//
// protected      	O              	O             		O	         X
//
// public         	O     	       	O	    			O	         O

class MyDate { // 필드 (멤버 변수)
	// 접근제어자는 필드 생성자 메소드 앞에 붙을 수 있다.
	// private 접근 제어자는 외부에서의 접근을 허용하지 않는다.
	private int year;
	private int month;
	private int day;

//	기본 생성자
	public MyDate() { // 생성자 : 반드시 클래스 명과 동일한 명으로 작성
//		객체를 new연산자로 생성할 때 생성자를 호출하게 되고 객체의 초기화를 담당
		System.out.println("[생성자] : 객체가 생성될 때 자동 호출됩니다.");
	}

	public void print() { // 메소드 : 앞에 void나 자료형이 반드시 와야한다.
		// 자료형이 온다면 반드시 return; 구문을 써서 값을 돌려줘야 한다.
		// 지금은 필드 값을 출력시키는 역할이고 이외에 두 가지의 역할이 더 있다.
		System.out.println(year + "/" + month + "/" + day);
	}
}// MyDate end

public class ConstructorTest02 {
	public static void main(String[] args) {

		// 생성자는 객체를 생성할 때 호출된다.
		MyDate d = new MyDate();
		// 생성자 호출 : 실행하면 생성자 안에 있는 내용을 실행
		d.print();

//		System.out.println(d.year); 
//		System.out.println(d.month); 
//		System.out.println(d.day); 
		// 접근 제어자가 private이기 떄문에 외부 클래스에서 접근할 수 없다.
//		MyDate dd = new MyDate();
	}
}