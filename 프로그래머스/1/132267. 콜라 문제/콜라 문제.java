class Solution {
    public int solution(int a, int b, int n) {
        int cola = 0;
        int remain = n;
        
        while (remain >= a) {
            int exchanged = (remain/a) * b;
            cola += exchanged;
            remain = exchanged + remain%a;
        }
        
        return cola;
    }
}