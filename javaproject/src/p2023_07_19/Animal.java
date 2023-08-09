package p2023_07_19;

public class Animal {
//			사용자 정의 클래스
	
	int age;
	// 메소드 바깥쪽에 선언되는 변수를
	// 필드, 멤버변수라고 한다. (heap 메모리 상에 값을 저장하게 된다.)
	// 배열과 똑같은 방식으로 초기화된다.
	// 클래스 전역에서 사용가능
	public Animal() { // 생성자 : 형식상 반드시 ()를 가져야 한다.
					  // 매개변수를 가지지 않은 생성자를 **기본생성자**라고 한다
					  // 반드시 클래스와 같은 이름으로 생성하여야 한다.
		System.out.println("생성자 호출 성공");
	}
	
	public static void main(String[] args) {
		
		int a = 10; // 지역 변수 : stack 영역에 저장
		
		String str = new String("자바");
		
		Animal 	a1 = 	new 	Animal();
//		클래스 레퍼런스변수 연산자	생성자 호출
//		해당 클래스 안에 들어있는 멤버변수의 기억공간을 
//		heap메모리상에 생성하라는 뜻
//		String 클래스와 마찬가지로 객체 생성
		
//		System.out.println(age); 오류 발생
		System.out.println(a1.age); // 참조하는 방법
		a1.age = 5;
		System.out.println(a1.age);
//		반드시 주소값을 가지고 있는 a1을 참조하여야만 출력된다. ( a1 . age )
//		수정을 할 때도 마찬가지 방법으로 해야한다.
		Animal a2 = new Animal();
//		heap 메모리상의 기억공간이 다시 생성되고
//		해당 공간에 age값이 0으로 초기화되어있다.
		System.out.println(a2.age);
		a2.age = 10;
		System.out.println(a2.age);
		
		if(a1 == a2) {
			System.out.println("같은 주소");
		}else
			System.out.println("다른 주소");
	}
}
