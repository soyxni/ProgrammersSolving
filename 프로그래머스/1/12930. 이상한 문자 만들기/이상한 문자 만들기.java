class Solution {
    public String solution(String s) {
        StringBuilder answer = new StringBuilder();
        
        // 공백을 기준으로 단어 나눔
        // 각 단어 기준 홀/짝수 구분
        // 첫 번째 글자 -> 0번째 인덱스(짝수)
        
        String[] strArray = s.split(" ", -1);
        
        // 단어별 반복
        for (int i = 0; i < strArray.length; i++){
            
            // 문자 배열로 변환
            char[] charArray = strArray[i].toCharArray();
            for (int j=0; j<charArray.length; j++){
                
                if(j%2 == 0){
                    answer.append(Character.toUpperCase(charArray[j]));

                }else{
                    answer.append(Character.toLowerCase(charArray[j])); 
                                  // 소문자 그대로 -> 대문자가 들어올 수도 있잖아!!!!!!!
                }
            }
            // 마지막 단어가 아니면 공백 추가 
            if(!(i==strArray.length-1)){
                answer.append(" ");
            }
        }
        return answer.toString();
    }
}