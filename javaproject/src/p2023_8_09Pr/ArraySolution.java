package p2023_8_09Pr;

class Solution {
	public int[] solution(int[] num_list, int n) {

		// 배열값을 모를때 사용하는 배열 사용 방식으로 배열 생성
		int[] answer = new int[n];

		// for문을 사용하여 num_list배열의 0번방 원소부터
		// n에 입력되는 값까지 answer 배열에 복사
		for (int i = 0; i < n; i++) {
			answer[i] = num_list[i];
		}
		return answer;
	}
}

//	class Solution {
//    	public int[] solution(int[] num_list, int n) 

//			copyOfRange(int[] original, int from, int to)
			// 해당 배열의 0번방의 원소부터 n번방의 원소까지 복사
			// import 필요
//        	return Arrays.copyOfRange(num_list, 0, n);
//    }
//}