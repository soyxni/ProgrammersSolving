import java.util.*;

class Solution {
    public int solution(int k, int m, int[] score) {
        int answer = 0;
        
        // 정렬
        Arrays.sort(score);
        
        // 갯수 / m
        for(int i=0; i<score.length/m; i++){
            answer += score[score.length-(i+1)*m] * m;
        }
        
        return answer;
    }
}