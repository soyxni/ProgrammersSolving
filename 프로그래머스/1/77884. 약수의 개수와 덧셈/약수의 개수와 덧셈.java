class Solution {
    public int solution(int left, int right) {
        int answer = 0;
        double s = 0;
        for(int i = left; i<=right; i++){
            s = Math.sqrt(i);
            if(s%1==0){ // 제곱근이 정수 -> 약수 개수 홀수
                answer -= i;
            }else{
                answer += i;
            }
        }
        
        return answer;
    }
}