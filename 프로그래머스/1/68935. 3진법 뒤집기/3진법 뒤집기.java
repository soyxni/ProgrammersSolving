class Solution {
    public int solution(int n) {
        int answer = 0;
        
        String str = Integer.toString(n,3);
        
        String reversedStr = new StringBuilder(str).reverse().toString();
        
        answer = Integer.parseInt(reversedStr, 3);
        
        return answer;
    }
}