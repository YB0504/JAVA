package p2023_7_20;

public class UseNoneObject {

	public static void main(String[] args) {

		NoneObject no = new NoneObject();
		// 사용 가능하지만 잘 쓰지 않는다.
		System.out.println("no.number = " + no.number);
		no.printNumber();
		
		// 정적필드와 정적 메소드는 객체를 생성하지 정적필드를 가진 클래스명으로 .(점)으로
		// 접근해서 사용한다.
		
		// 정적필드로 접근해서 출력함 : 클래스. 정적필드명
		System.out.println("NoneObject.number = " + NoneObject.number);
		
		// 정적메소드를 호출해서 실행함 : 클래스.정적메소드명
		NoneObject.printNumber();

	}
}