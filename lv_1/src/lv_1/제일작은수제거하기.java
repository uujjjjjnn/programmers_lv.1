package lv_1;

public class 제일작은수제거하기 {
	
	class Solution {
	    public int[] solution(int[] arr) {
	        int[] newArr = new int[arr.length-1];
	        
	        if(arr.length == 1) {
	            return new int[] {-1};
	        }
	        
	        int minIndex = 0; // 최초값 인덱스
	        for(int i=1; i<arr.length; i++) {
	            if(arr[i]<arr[minIndex]) {
	                minIndex = i;
	            } 
	        }    
	        
	        int newIndex = 0;
	        for(int i=0; i<arr.length; i++) {
	            if(i != minIndex) {
	                newArr[newIndex] = arr[i];
	                newIndex++;
	            }
	        }
	        return newArr;
	    }
	}

}
