class Solution {
    public boolean solution(String s) {
        boolean answer = true;
        
        if(s.length()==4 || s.length()==6){
            return s.matches("[0-9]+");
        }else{
            return false;
        }
    }
}