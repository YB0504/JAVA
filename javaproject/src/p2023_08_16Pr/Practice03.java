package p2023_08_16Pr;

class Solution03 {
	public int solution(int[] num_list) {
		int answer = 1;

//		for (int i = 0; i < num_list.length; i++) {
//			if (num_list.length >= 11) {
//				answer += num_list[i];
//			}else if(num_list.length <= 10) {
//				answer *= num_list[i];
//			}
//		}
		
		
		if (num_list.length >= 11) {
            // 리스트의 길이가 11 이상일 때, 모든 원소의 합을 계산
            for (int i = 0; i < num_list.length; i++) {
                answer += num_list[i];
            }
        } else {
            // 리스트의 길이가 10 이하일 때, 모든 원소의 곱을 계산
            for (int i = 0; i < num_list.length; i++) {
                answer *= num_list[i];
            }
        }

		return answer;
	}
}


