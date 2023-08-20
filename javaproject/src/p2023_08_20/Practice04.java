package p2023_08_20;

class Solution04 {
	public int[] solution(int[] arr, int k) {
		int[] answer = arr;

		if (k % 2 != 0) {
			for (int i = 0; i < arr.length; i++) {
				arr[i] = arr[i] * k;
			}
		} else {
			for (int j = 0; j < arr.length; j++) {
				arr[j] = arr[j] + k;
			}
		}

		return answer;
	}
}