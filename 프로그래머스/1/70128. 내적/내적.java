class Solution {
    public int solution(int[] a, int[] b) {
        int answer = 0;
        int l = a.length;
        
        for(int i=l; i>0; i--){
            answer += a[i-1]*b[i-1];
        }
        
        return answer;
    }
}