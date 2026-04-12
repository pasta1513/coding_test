class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        String str = String.valueOf(x);
        int num = 0;
        
        for (int i=0; i<str.length(); i++) {
            String s = str.substring(i, i+1);
            num += Integer.parseInt(s);
        }
        
        if (x%num != 0) answer = false;
        return answer;
    }
}