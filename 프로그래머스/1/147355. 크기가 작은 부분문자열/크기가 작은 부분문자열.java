class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        long pNum = Long.parseLong(p);
        
        for (int i=0; i<t.length() - p.length() + 1; i++) {
            String sub = t.substring(i, i+p.length());
            long num = Long.parseLong(sub);
            
            if (num <= pNum) {
                answer++;
            }
        }
        return answer;
    }
}