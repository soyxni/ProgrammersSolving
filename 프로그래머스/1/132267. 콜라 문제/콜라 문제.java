class Solution {
    public int solution(int a, int b, int n) {
        
        if(n<a) return 0;
        // b<a이므로
        return (n-b)/(a-b)*b;
    }
}