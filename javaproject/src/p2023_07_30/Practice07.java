package p2023_07_30;

public class Practice07 {

	public static void main(String[] args) {

		String str = "12345";
		int sum = 0;

		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if (c >= '0' && c <= '9') {
//				추출한 c의 값이 0~9사이인지 확인
				int n = c - '0';
//				추출한 문자를 숫자로 변환한 값을 n에 저장
				sum += n;
			}

		}
		System.out.println("sum = " + sum);

	}

}
