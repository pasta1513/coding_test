class Solution {
    public int solution(int number, int limit, int power) {
        int[] divisor = new int[number];
        
        for (int i=1; i<=number; i++) {
            int x = 0;
            
            for (int j=1; j*j<=i; j++) {
                if (i%j == 0) {
                    x++;
                    if (j*j != i) x++;
                }
            }
            
            if (x > limit) divisor[i-1] = power;
            else divisor[i-1] = x;
        }
        
        int answer = 0;
        
        for (int d : divisor) {
            answer += d;
        }
        
        return answer;
    }
}