package p2023_8_09Pr;

public class BasicPractice01 {

	public static void main(String[] args) {

		class Solution {
			public String solution(String my_string, String overwrite_string, int s) {

				// 주어진 문자열의 일부를 추출하여 대체할 부분과 나머지 부분을 구하는 코드
				String answer = my_string.substring(0, s) + overwrite_string
							  + my_string.substring(s + overwrite_string.length());

				return answer;
			}

		}
	}
}
