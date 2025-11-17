import java.util.*;

class Solution {
    public int[] solution(int[] numbers) {
        
        // 최대 200, 0~200 -> 201개
        boolean[] check = new boolean[201];
        
        for(int i=0; i<numbers.length; i++){
            for(int j=i+1; j<numbers.length; j++){
                check[numbers[i]+numbers[j]] = true;
            }
        }
        
        // true 개수 크기만큼 answer배열 생성
        int count = 0;
        
        for(int i=0; i<check.length; i++){
            if(check[i] == true){
                count++;
            }
        }
        
        int[] answer = new int[count];
        
        // answer에 값 저장 -> 체크의 인덱스를 저장해줌
        int index = 0;
        for(int i=0; i<check.length; i++){
            if(check[i]==true){
                answer[index] = i;
                index++;
            }
        }
        
        return answer;
    }
}                                                                                                            