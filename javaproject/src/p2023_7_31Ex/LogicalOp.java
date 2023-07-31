package p2023_7_31Ex;

public class LogicalOp {

	public static void main(String[] args) {

//		System.out.println(1 == 1);
		
		// 논리 연산자
		// 좌항과 우항에 모두 boolean
		
		// AND &&
		System.out.println(true && true); // true
		System.out.println(true && false); // false
		System.out.println(false && true); // false
		System.out.println(false && false); // false
		System.out.println();
		
		// OR ||
		System.out.println(true || true); // true
		System.out.println(true || false); // true
		System.out.println(false || true); // true
		System.out.println(false || false); // false
		System.out.println();
		
		// NOT !
		System.out.println(!true); // false
		System.out.println(!false); // true
		
	}

}
