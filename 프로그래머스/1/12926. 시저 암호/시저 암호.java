class Solution {
    public String solution(String s, int n) {
        String answer = "";
        StringBuffer sb = new StringBuffer();
        
        // 한 문자씩
        // 아스키 코드값 + n으로
        // 다시 문자열로
        
        int l = s.length();
        
        for(int i=0; i<l; i++){
            // 공백 그대로 + z 처리
            char c = s.charAt(i);
            
            if(c == ' '){
                sb.append(' ');
            }else{
                if(c>='a' && c<='z'){
                    // 소문자
                    char originChar = (char) (c+n);
                    if(originChar > 'z'){
                        // 넘어갔으면
                        sb.append((char)(originChar-26));
                    }else{
                        sb.append(originChar);
                    }
                    
                }else if(c>='A' && c<='Z'){
                    // 대문자
                    char originChar = (char) (c+n);
                    if(originChar>'Z'){
                        sb.append((char) (originChar-26));
                    }else{
                        sb.append(originChar);
                    }
                }
            }
        }
        
        answer = sb.toString();
        
        return answer;
    }
}