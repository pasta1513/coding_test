class Solution {
    public String solution(String s) {
        String answer = "";
        int n = s.length();
        
        if (n%2 == 0) {
            answer = s.substring(n/2-1, n/2+1);
        } else {
            answer = s.substring((n+1)/2-1, (n+1)/2);
        }
        return answer;
    }
}