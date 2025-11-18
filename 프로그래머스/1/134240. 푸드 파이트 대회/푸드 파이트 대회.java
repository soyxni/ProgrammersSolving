class Solution {
    public String solution(int[] food) {
        String answer = "0";
        
        for(int i=food.length-1; i>0; i--){
            // 끝 인덱스부터 시작
            // 해당 인덱스 가능 갯수만큼 반복
            for(int j=0; j<food[i]/2; j++){
                answer = i + answer + i;
            }
        }
        return answer;
    }
}