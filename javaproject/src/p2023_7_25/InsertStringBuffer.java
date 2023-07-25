package p2023_7_25;

public class InsertStringBuffer {
	public static void main(String[] args) {

		StringBuffer sb1 = new StringBuffer("gemini is beautiful");
		System.out.println(sb1);

		// insert 메소드 : 위치를 지정하여 해당 위치에 삽입을 시켜주는 역할
		sb1.insert(10, "very");
		System.out.println(sb1);

		sb1.insert(0, 1004);
		System.out.println(sb1);
	}
}
