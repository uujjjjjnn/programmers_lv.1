package lv_1;

public class 자연수뒤집어배열로만들기 {
	
	class Solution {
	    public int[] solution(long n) {
	        String a = "" + n;
	        int[] answer = new int[a.length()];
	        
	        int cnt = 0;
	        while(n>0) {
	            answer[cnt] = (int)(n%10);
	            n /= 10;
	            cnt++;
	            System.out.print(n);
	        }
	        
	        return answer;
	    }
	}

}
