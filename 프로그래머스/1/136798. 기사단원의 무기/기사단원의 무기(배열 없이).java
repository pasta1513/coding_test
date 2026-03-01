class Solution {
    public int solution(int number, int limit, int power) {
        int answer = 0;
        
        for (int i=1; i<=number; i++) {
            int x = 0;
            
            for (int j=1; j*j<=i; j++) {
                if (i%j == 0) {
                    x++;
                    if (j*j != i) x++;
                }
            }
            
            if (x > limit) answer+= power;
            else answer += x;
        }
        
        return answer;
    }
}
