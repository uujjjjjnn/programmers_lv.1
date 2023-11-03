package lv_1;

public class 짝수와홀수 {
	
	class Solution {
	    public String solution(int num) {
	        String answer = "";
	        
	        
	        if(num%2==0) {
	            // System.out.print("Even");
	            answer = "Even";
	        } else {
	            // System.out.print("Odd");
	            answer = "Odd";
	        }
	        return answer;
	    }
	}

}
