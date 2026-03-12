class Solution {
    public int solution(int n) {
        int num = n;
        String n3_str = "";
        
        while (num != 0) {
            int q = num/3;
            int r = num%3;
            n3_str += r;
            num = q;
        }
        
        int answer = 0;
        for (int i=0; i<n3_str.length(); i++) {
            int idx = n3_str.length() - (1 + i);
            int n3 = Integer.parseInt(n3_str.substring(idx, idx+1));
            answer += n3 * Math.pow(3, i);
        }
        
        return answer;
    }
}