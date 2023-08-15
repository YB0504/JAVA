package p2023_08_15Pr;

class Solution {
	public String solution(String code) {
		String answer = "";
		int mode = 0;

		for (int idx = 0; idx < code.length(); idx++) {
			if (mode == 0) {
				if (code.charAt(idx) != '1') {
					if (idx % 2 == 0) {
						answer += code.charAt(idx);
					}
				} else {
					mode = 1;
				}
			} else {
				if (code.charAt(idx) != '1') {
					if (idx % 2 == 1) {
						answer += code.charAt(idx);
					}
				} else {
					mode = 0;
				}
			}
		}

		if (answer.equals("")) {
			return "EMPTY";
		}

		return answer;
	}

}
