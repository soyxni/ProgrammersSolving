class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        int length = p.length();
        
        for(int i=0; i<=t.length()-length; i++){
            StringBuilder str = new StringBuilder();
            for(int j=0; j<p.length(); j++){
                str.append(t.charAt(i+j));
            }
            if(Long.parseLong(str.toString()) <= Long.parseLong(p)){
                answer++;
            }
        }
        
        return answer;
    }
}