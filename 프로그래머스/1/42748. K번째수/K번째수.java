import java.util.Arrays;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        
        // i-j까지 잘라서 -> 정렬
        for(int l=0; l<commands.length; l++){
            int i = commands[l][0];
            int j = commands[l][1];
            int k = commands[l][2];
                             
            int[] sortArr = new int[j-i+1];
            int index = 0;
            for(int m=i-1; m<j; m++){ // i부터 j까지
                sortArr[index] = array[m];
                index++;
            }
            Arrays.sort(sortArr);
            // k번째 저장
            answer[l] = sortArr[k-1];
        }
        return answer;
    }
}