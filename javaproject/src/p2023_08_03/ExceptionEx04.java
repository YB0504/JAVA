package p2023_08_03;

public class ExceptionEx04 {

	public static void main(String[] args) {

		try {
			findClass(); // 메소드 호출
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			System.out.println("클래스가 존재하지 않습니다.");
		}

	}
	
	// 정적 메소드
	public static void findClass() throws ClassNotFoundException {
		Class clazz = Class.forName("java.lang.String2");
		//							후에 DB연동시에 쓰는 기본코드
	}

}
