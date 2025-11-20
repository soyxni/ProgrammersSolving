import java.util.*;

class Solution {
    public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];
        
        PriorityQueue<Integer> rank = new PriorityQueue<>();
        
        for(int i=0; i<score.length; i++){
            rank.add(score[i]);
            
            if(rank.size() > k){
                rank.poll();
            }
            
            answer[i] = rank.peek();
        }
        
        return answer;
    }
}