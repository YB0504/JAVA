package p2023_7_26;

public class WrapperEx4 {

	public static void main(String[] args) {
		
//		Double형의 Wrapper클래스
		
//		Double d = new Double(); // 오류 발생
		
		Double d1 = new Double(3.14); // 박싱
		Double d2 = 3.14;			  // 자동 박싱
		
		double value1 = d1.doubleValue();	// 언박싱
		double value2 = d2;					// 자동 언박싱
		
		Double s1 = new Double("3.14");	// 박싱(문자열값 전달)
		// 문자 데이터의 경우 자동 박싱이 일어나지 않는다.
//		Double s2 = "3.14";				// 오류 발생
		
		double value3 = s1.doubleValue();	// 언박싱
		double value4 = s1;					// 자동 언박싱
		
//		자료형 변환
		double num = Double.parseDouble("3.14");
		System.out.println("num : " + num);
		
	}

}
