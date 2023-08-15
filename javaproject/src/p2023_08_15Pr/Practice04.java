package p2023_08_15Pr;

class Solution03 {
	public int solution(int[] num_list) {
		String odd = "";
		String even = "";

		for (int num : num_list) {
			if (num % 2 != 0) {
				odd += Integer.toString(num);
			} else {
				even += Integer.toString(num);
			}
		}

		int oddSum = Integer.parseInt(odd);
		int evenSum = Integer.parseInt(even);

		return oddSum + evenSum;
	}
}