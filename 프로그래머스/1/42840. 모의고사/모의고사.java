import java.util.*;

class Solution {
    public int[] solution(int[] answers) {
        
        // 수포자 패턴 배열 -> 나머지 인덱스로 
        int[] student1 = {1, 2, 3, 4, 5};
        int[] student2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] student3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        
        int student1_size = student1.length ;
        int student2_size = student2.length ;
        int student3_size = student3.length ;
        
        int student1_score = 0;
        int student2_score = 0;
        int student3_score = 0;

        for(int i=0; i<answers.length; i++){
            int a = answers[i];
            
            if(a == student1[i%student1_size]) student1_score++;
            if(a == student2[i%student2_size]) student2_score++;
            if(a == student3[i%student3_size]) student3_score++;
            
        }
        
        int maxScore = Math.max(student1_score, Math.max(student2_score, student3_score));
        
        ArrayList<Integer> list = new ArrayList<>();
        if(maxScore == student1_score) list.add(1);
        if(maxScore == student2_score) list.add(2);
        if(maxScore == student3_score) list.add(3);
        
        int[] answer = new int[list.size()];
        for(int i=0; i<list.size(); i++){
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}