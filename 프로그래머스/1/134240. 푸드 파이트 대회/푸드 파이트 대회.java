class Solution {
    public String solution(int[] food) {
        StringBuilder sb = new StringBuilder();
        
        // 짝수개이면 그만큼 양옆에 / 홀수개이면 나머지 버리고
        for(int i=1; i<food.length; i++){
            int cnt = food[i]/2;
            for(int j=0; j<cnt; j++){
                sb.append(Integer.toString(i));
            }
        }
        
        StringBuilder sbInverse = new StringBuilder();
        String halfStr = sb.toString();
        // 역순 스트링
        for(int i=0; i<halfStr.length(); i++){
            sbInverse.append(halfStr.charAt(halfStr.length()-i-1));
        }
        
        // 0(물) 붙이고 역순으로 붙이기
        sb.append("0");
        
        String answer = sb.toString()+sbInverse.toString();
        return answer;
    }
}