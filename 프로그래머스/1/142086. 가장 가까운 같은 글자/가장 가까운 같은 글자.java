import java.util.*;

class Solution {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        
        HashMap<Character, Integer> lastIdx = new HashMap<>();
        
        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            
            // 이미 있는 문자면
            if(lastIdx.containsKey(c)){
                // 몇 번째 앞인지 저장
                int lastIdxNum = lastIdx.get(c);
                answer[i] = i - lastIdxNum;
            }else{
                answer[i] = -1;
            }
            
            // 갱신
            lastIdx.put(c, i);
        }
        return answer;
    }
}