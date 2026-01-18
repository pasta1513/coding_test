class Solution {
    public String solution(String s) {
        String answer = "";
        int n = s.length();
        int m = 0;
        
        if (n%2 == 0) {
            m = n/2 - 1;
            answer = s.substring(m, m+2);
        } else {
            m = n/2;
            answer = s.substring(m, m+1);
        }
        
        return answer;
    }
}
