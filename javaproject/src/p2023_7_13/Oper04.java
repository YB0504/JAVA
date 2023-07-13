package p2023_7_13;

public class Oper04 {

	public static void main(String[] args) {

// 비교 연산자 >, >=, <, <=, ==(같다), !=(같지 않다)
// 비교 연산자의 결과가 참이면 true, 거짓이면 false 값을 리턴한다.		
		
		// str1 과 "자바" 가 저장되는 영역이 다르다
		String str1 = "자바";
		String str2 = "자바"; // 주소값이 같다면 새롭게 저장하지않고 리턴받아 사용
		String str3 = new String ("자바"); // new 연산자를 이용 String객체를 생성
		// new 연산자를 써도 되고 안써도 되는 연산자는 String 클래스가 유일
		// new 연산자를 사용 하면
		
		// 비교 연산자로 주소값을 비교
		if(str1 == str2) {
			System.out.println("같은 주소"); // 같은 주소
		}else {
			System.out.println("다른 주소");
		}
		if (str1 == str3) {
			System.out.println("같은 주소"); 
		}else {
			System.out.println("다른 주소"); // 다른 주소
		}
		
		// 값을 비교 (equals 메소드로 비교)
		System.out.println(str1.equals(str2)); // true
		System.out.println(str1.equals(str3)); // true
	}

}
