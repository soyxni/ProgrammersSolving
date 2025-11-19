class Solution {
    public int solution(int a, int b, int n) {
        int answer = 0;
        // 빈 병 a개 -> 새거 b개 , 빈 병 n개일 때는?
        
        int s = n; //보유 새 콜라
        
        while(s>=a){
            // 보유 새 콜라에서 a를 나눔 -> 그만큼 받음
            // 보유 새 콜라는 차감
            // 받은 양 answer에 더하기
            // 보유 새 콜라에 받은거 더하기
            int newQuantity = s/a * b;
            s = s - (s/a * a);
            answer += newQuantity;
            s += newQuantity;
        }
        
        return answer;
    }
}