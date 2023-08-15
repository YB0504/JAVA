package p2023_08_15Pr;

class Solution02 {
    public int solution(int[] num_list) {
        int answer = 0;
    	int sum = 0;
        int i = 1;
        
//      향상된 for문
        for (int num : num_list) {
            i *= num;
            sum += num;
        }
        
        int i2 = (int)(Math.pow(sum, 2));
        
        if (i < i2) {
            answer = 1;
        } else {
            answer = 0;
        }
        return answer;
    }
}
