class Solution {
    public int solution(int[][] sizes) {
        int answer = 0;
        
        // 두 배열 중에 큰 수를 int[][1]에 두기 - switch
        
        // 배열 길이 l
        int l = sizes.length;
        
        for(int i=0; i<l; i++){
            if(sizes[i][0]<sizes[i][1]){
                int temp = sizes[i][0];
                sizes[i][0] = sizes[i][1];
                sizes[i][1] = temp;
            }
        }
        
        int wMax = 0;
        int hMax = 0;
        // 가로 최댓값 찾기
        for(int i=0; i<l; i++){
            if(sizes[i][0]>wMax){
                wMax = sizes[i][0];
            }
        }
        // 세로
        for(int i=0; i<l; i++){
            if(sizes[i][1]>hMax){
                hMax = sizes[i][1];
            }
        }
        
        answer = wMax * hMax;
        return answer;
    }
}