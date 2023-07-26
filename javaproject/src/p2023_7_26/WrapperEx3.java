package p2023_7_26;

public class WrapperEx3 {

	public static void main(String[] args) {

		Integer ob = new Integer(100); 	// 박싱
		Integer obj = 100;				// 자동 박싱
		System.out.println("언박싱 : " + obj.intValue());
		System.out.println("자동 언박싱 : " + obj);

		// 언박싱
		int value1 = obj.intValue();
		
		// 대입 시의 자동 언박싱
		int value2 = obj;
		System.out.println("value : " + value2);

		// 연산 시의 자동 언박싱
		int result = obj + 100;
		System.out.println("result : " + result);

	}

}
