import java.util.Arrays;

class Solution {
    public String solution(String s) {
        //문자열 분해
        //정렬
        //내림차순
        String answer = "";
        char[] charArray = s.toCharArray();
        Arrays.sort(charArray);
        
        StringBuilder sb = new StringBuilder();
        
        for(int i = charArray.length; i>0; i--){
            sb.append(charArray[i-1]);
        }
        
        answer = sb.toString();
        return answer;
    }
}