package lv_1;

public class 콜라츠추축 {
	
	class Solution {
	    public int solution(int num) {
	        int answer = 0;
	        
	        while(num!=1) {
	            if(answer>=500) return -1;
	            if(num%2==0) {
	                num /= 2;
	            } else {
	                num = num*3+1;
	            }
	            answer++;
	            
	        }
	        
	        return answer;
	    }
	}

}
