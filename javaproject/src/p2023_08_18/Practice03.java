package p2023_08_18;

class Solution03 {
    public String solution(String my_string, String alp) {
        String answer = "";
        
//        String a = alp.toUpperCase();
//        return my_string.replaceAll(alp, a);
        
        if(my_string.contains(alp)) {
        	for(int i = 0; i < my_string.length(); i++) {
        		answer = my_string.replace(alp, alp.toUpperCase());
        	}
        	
        }else {
        	answer = my_string;
        }
        
        return answer;
    }
}