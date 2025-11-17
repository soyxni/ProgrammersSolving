import java.util.*;

class Solution {
    public int[] solution(int[] numbers) {
        Set<Integer> sumSet = new TreeSet<>();
        
        for(int i=0; i<numbers.length; i++){
            for(int j=i+1; j<numbers.length; j++){
                sumSet.add(numbers[i]+numbers[j]);
            }
        }
        
        // 변환
        int[] answer = new int[sumSet.size()];
        
        int index = 0;
    
        // 순차적으로 저장
        for(int sum : sumSet){
            answer[index] = sum;
            index++;
        }
        
        return answer;
    }
}                                                                                                            