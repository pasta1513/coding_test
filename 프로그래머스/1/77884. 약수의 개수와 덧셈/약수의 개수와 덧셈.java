import java.lang.Math;

class Solution {
    public int solution(int left, int right) {
        int answer = 0;
        
        for (int i=left; i<right+1; i++) {
            int root = (int) Math.sqrt(i);
            
            if (i == root * root) {
                answer -= i;
            } else {
                answer += i;
            }
        }
        
        return answer;
    }
}