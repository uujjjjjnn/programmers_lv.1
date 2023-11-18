package lv_1;

public class 하샤드수 {
	
	class Solution {
	    public boolean solution(int x) {
	        boolean answer = true;
	        int xx = x;
	        int sum = 0;
	        while(xx>0) {
	            sum += xx%10;
	            xx /= 10;
	        }
	        answer = x%sum==0?true:false;
	        
	        return answer;
	    }
	}

}
