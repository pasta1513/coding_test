class Solution {
    public int solution(int num) {
        long x = num;
        int answer = 0;
        
        while (x != 1) {
            x = x%2==0 ? x/=2 : 3*x+1;
            answer++;
            
            if (answer == 500) return -1;
        }
        
        return answer;
    }
}