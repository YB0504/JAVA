package p2023_08_16Pr;

class Solution03 {
	public int solution(int[] num_list) {
		int answer = num_list.length;

		// if문 안에서도 for문을 사용할 수 있다.
		if (answer >= 11) {
			int sum = 0;
			for (int num : num_list) {
				sum += num;
			}
			return sum;
		} else {
			int i = 1;
			for (int num : num_list) {
				i *= num;
			}
			return i;
		}
	}
}
//	int answer = 0;
//
//	if (num_list.length >= 11) {
//    	for (int x : num_list) {
//        	answer += x;
//    }
//	} else {
//    	answer = 1;
//    	for (int x : num_list) {
//        	answer *= x;
//    	}
//	}
//	return answer;
//	}
//}
