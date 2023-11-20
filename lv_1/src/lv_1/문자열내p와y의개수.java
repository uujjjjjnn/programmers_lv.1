package lv_1;

public class 문자열내p와y의개수 {
	
	class Solution {
	    boolean solution(String s) {
	        
	        int p = 0;
	        int y = 0;
	        String lower = s.toLowerCase();
	        
	        for(int i=0; i<s.length(); i++) {
	            if(lower.substring(i,i+1).equals("p")) p++;
	            if(lower.substring(i,i+1).equals("y")) y++;        }

	        return p==y?true:false;
	    }
	}

}
