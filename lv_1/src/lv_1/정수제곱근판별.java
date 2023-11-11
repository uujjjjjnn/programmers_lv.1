package lv_1;

public class 정수제곱근판별 {
	
	class Solution {
	    public long solution(long n) {
	        long x = (long) Math.sqrt(n);
	        long answer = -1;
	        
	        if(x*x == n) {
	            answer = (x+1)*(x+1);
	        }
	        
	        return answer;
	    }
	}

}
