package lv_1;

public class 서울에서김서방찾기 {

	public String solution(String[] seoul) {
        String answer = "";
        
        for(int i=0; i<seoul.length; i++) {
            if(seoul[i].equals("Kim")) { // 문자열은 equals
                answer = "김서방은 " + i +"에 있다";
                break; // kim은 한 번만 있다고 함. break를 넣어주면 반복을 줄여 성능이 좋아짐
            }
        }
        
        return answer;
    }
	
}
