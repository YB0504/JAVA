package p2023_07_18;

public class ArrayEx09 {

	public static void main(String[] args) {

//	객체 배열 : 객체를 참조하는 배열

		// String 객체를 저장하기 위한 배열
		String[] strArray = new String[3];
		strArray[0] = "JAVA"; // String 객체를 생성해서 객체배열에 저장
		strArray[1] = "JAVA";
		strArray[2] = new String("JAVA");

		// == : 주소값을 비교
		// equals() : 값을 비교
		System.out.println(strArray[0] == strArray[1]); // 같은 주소값
		System.out.println(strArray[0] == strArray[2]);
		// 2번방의 배열이 new로 새로운 주소값을 만들었기 때문에 다른 주소값
		System.out.println(strArray[0].equals(strArray[2])); // 값을 비교

	}

}
