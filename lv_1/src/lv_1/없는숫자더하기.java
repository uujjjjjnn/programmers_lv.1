package lv_1;

public class 없는숫자더하기 {
	
	class Solution {
	    public int solution(int[] numbers) {
	        int answer = 45;
	        
	        for(int n:numbers) {
	            answer -= n;    
	        }
	        
	        return answer;
	    }
	}

}
