class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        int zeroCount = 0;
        int sameCount = 0;
        
        // 맞은 개수
        // 0 개수
        for(int i=0; i<lottos.length; i++){
            if(lottos[i]==0){
                zeroCount++;
            }else{
                for(int j=0; j<win_nums.length; j++){
                    if(win_nums[j] == lottos[i]){
                        sameCount++;
                    }
                }  
            }
        }
        
        int[] rank = {-1, -1, 5, 4, 3, 2, 1};
        
        // 최고 - 0 다 맞다고 가정
        if(zeroCount+sameCount>=2 && zeroCount+sameCount<=6){
            answer[0] = rank[zeroCount+sameCount];
        }else{
            answer[0] = 6;
        }
        // 최저 - 맞은거만(0 다 틀림)
        if(sameCount>=2 && sameCount<=6){
            answer[1] = rank[sameCount];
        }else{
            answer[1] =6;
        }
        return answer;
    }
}