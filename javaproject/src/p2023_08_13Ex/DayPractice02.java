package p2023_08_13Ex;

class Solution01 {
    public String solution(String my_string, int k) {
        String answer = "";
        
        for(int i = 0; i < k; i++) {
        	answer += my_string;
        }
        
        return answer;
        
//        k 만큼 반복
//        return my_string.repeat(k);
    }
}