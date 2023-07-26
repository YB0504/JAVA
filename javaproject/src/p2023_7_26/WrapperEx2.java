package p2023_7_26;

public class WrapperEx2 {

	public static void main(String[] args) {

		// 박싱
		Integer obj1 = new Integer(100);
		Integer obj2 = new Integer("200");
		Integer obj3 = Integer.valueOf("300");

		// 언박싱 (각 자료형에 맞는 Value메소드 사용)
		int value1 = obj1.intValue();
		int value2 = obj2.intValue();
		int value3 = obj3.intValue();

		System.out.println(value1);
		System.out.println(value2);
		System.out.println(value3);

	}

}
