class Solution {
    public int solution(int n, int m, int[] section) {
        int answer = 0;
        int end = section[0] - 1;
        
        for (int i=0; i<section.length; i++) {
            int start = section[i];
            
            if (start <= end) continue;
            else {
                answer++;
                end = start + m -1;
            }
        }
        
        return answer;
    }
}