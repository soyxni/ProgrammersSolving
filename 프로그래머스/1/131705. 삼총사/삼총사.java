class Solution {
    public int solution(int[] number) {
        int answer = 0;
        
        for(int i = 0; i < number.length-2; i++){
            //i번째 인덱스에서 이후 인덱스 확인
            for(int j=i+1; j<number.length-1; j++){
                for(int k=j+1; k<number.length; k++){
                    if(number[i]+number[j]+number[k]==0){
                        answer++;
                    }
                }
            }
        }
        
        return answer;
    }
}