package lv_1;

public class 핸드폰번호가리기 {
	
	class Solution {
	    public String solution(String ph) {

	        int end = ph.length()-4;
	        
	        String answer = "";
	        for(int i=0; i<end; i++) {
	            answer += "*";
	        }
	        for(int i=end; i<ph.length(); i++) {
	            answer += ph.charAt(i);
	        }
	        
	        return answer;
	    }
	}

}
