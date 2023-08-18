package p2023_08_18;

class Solution01 {
    public String solution(String rny_string) {
        String answer = "";
        
        if(rny_string.contains("m")) {
        	answer = rny_string.replace("m", "rn");
        }else {
        	answer = rny_string;
        }
        
        return answer;
        
        
    }
}