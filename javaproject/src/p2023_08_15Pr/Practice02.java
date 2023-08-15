package p2023_08_15Pr;

class Solution01 {
	public int solution(int a, int b, int c) {
		int answer = 0;
		
//		Math.pow() : 앞의 정수에 뒤의 정수만큼 거듭제곱 pow(double a, double b)

		if (a == b && b == c) {
            return (int) ((a + b + c) * (Math.pow(a, 2) + Math.pow(b, 2) + Math.pow(c, 2))
                    * (Math.pow(a, 3) + Math.pow(b, 3) + Math.pow(c, 3)));
        } else if (a == b || a == c || b == c) {
            return (int) ((a + b + c) * (Math.pow(a, 2) + Math.pow(b, 2) + Math.pow(c, 2)));
        } else {
            return (int) (a + b + c);
        }
		
		
		
//		if (a != b && b != c && a != c) {
//			answer = a + b + c;
//		} else if ((a == b && a != c) || (a == c && a != b) || (b == c && b != a)) {
//			int sum = a + b + c;
//			int sum2 = a * a + b * b + c * c;
//			answer = sum * sum2;
//		} else if (a == b && b == c) {
//            int sum = a + b + c;
//            int sum2 = a * a + b * b + c * c;
//            int sum3 = a * a * a + b * b * b + c * c * c;
//            answer = sum * sum2 * sum3;
//        }
//		return answer;
	}
}