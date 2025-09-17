class Solution {
    public String solution(int n) {
        String answer = "";        
        // n이 홀수인지 짝수인지 if문으로 확인
        // 짝수이면 n/2번 '수박' 붙이기
        // 홀수이면 n/2번 '수박' 붙이고 '수'
        int a = n/2;
        
        if(n%2 == 0){
            for (int i=a; i>0; i--){
                answer = answer + "수박";
            }
        }else{
            for (int i=a; i>0; i--){
                answer = answer + "수박";
            }
            answer = answer + "수";
        }
        
        return answer;
    }
}