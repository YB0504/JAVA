package p2023_08_20;

class Solution01 {
	public int solution(String num_str) {
		int answer = 0;

//      각각의 문자가 숫자로 변활될때의 아스기 코드값에서 
//		0의 아스기코드 값을 빼면서 계산  ('5' - '0'은 53 - 48 = 5)
		for (int i = 0; i < num_str.length(); i++) {
			int num = num_str.charAt(i) - '0';
			answer += num;
		}

		return answer;
	}
}