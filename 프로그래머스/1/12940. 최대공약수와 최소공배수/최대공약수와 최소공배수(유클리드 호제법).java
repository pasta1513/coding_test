class Solution {
    public int[] solution(int n, int m) {
        int[] answer = new int[2];
        answer[0] = getGCD(n, m);
        answer[1] = n*m / answer[0];
        return answer;
    }
    
    private int getGCD(int n, int m) {
        while (m != 0) {
            int temp = n % m;
            n = m;
            m = temp;
        }
        
        return n;
    }
}
