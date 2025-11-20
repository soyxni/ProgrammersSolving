import java.util.*;

class Solution {
    public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];
        
        ArrayList<Integer> rank = new ArrayList<>();
        
        for(int i=0; i<score.length; i++){
            rank.add(score[i]);
            Collections.sort(rank);
            // k일 후
            if(rank.size() > k){
                rank.remove(0); //오름차순
            }
            answer[i] = rank.get(0);
        }
        return answer;
    }
}