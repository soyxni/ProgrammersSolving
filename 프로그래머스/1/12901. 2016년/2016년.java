class Solution {
    public String solution(int a, int b) {
        
        // 1/1 ~ a/b 며칠인지 / 7 -> 나머지로 요일
        
        int[] months = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        
        int days = b-1;
        
        for(int i=0; i<a-1; i++){
            days += months[i];
        }
        
        int division = days % 7;
        
        String[] yoil = {"FRI", "SAT", "SUN", "MON", "TUE", "WED", "THU"};
        
        String answer = yoil[division];
        
        
        return answer;
    }
}