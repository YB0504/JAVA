package p2023_08_20;

class Solution03 {
	public String solution(String my_string, int[] index_list) {
//		StringBuilder answer = new StringBuilder();
		String answer = "";

//		for (int index : index_list) {
//			answer.append(my_string.charAt(index));
//		}

		for (int i = 0; i < index_list.length; i++) {
			answer += my_string.charAt(index_list[i]);
		}

		return answer;
//		return answer.toString();
	}
}
