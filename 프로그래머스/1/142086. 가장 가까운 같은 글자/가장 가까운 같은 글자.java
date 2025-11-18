class Solution {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        
        // 두 번째 글자부터
        answer[0] = -1;
        for(int i=1; i<s.length(); i++){
            char c = s.charAt(i);
            answer[i] = -1;
            int cnt=0; // 얼마나 앞인지
            for(int j = i-1; j>=0; j--){
                cnt++;
                if(s.charAt(j) == c){ // 가장 가까이에서 같은 것 발견하면
                    answer[i] = cnt;
                    break;
                }
            }
            
        }
        return answer;
    }
}