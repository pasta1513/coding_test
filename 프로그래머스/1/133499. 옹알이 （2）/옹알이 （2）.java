class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        
        for (String b : babbling) {
            int n = 0;
            String prev = "";
            
            while (n < b.length()) {
                if (n+3<=b.length() && b.substring(n, n+3).equals("aya") && !prev.equals("aya")) {
                    prev = "aya";
                    n += 3;
                } else if (n+2<=b.length() && b.substring(n, n+2).equals("ye") && !prev.equals("ye")) {
                    prev = "ye";
                    n += 2;
                } else if (n+3<=b.length() && b.substring(n, n+3).equals("woo") && !prev.equals("woo")) {
                    prev = "woo";
                    n += 3;
                } else if (n+2<=b.length() && b.substring(n, n+2).equals("ma") && !prev.equals("ma")) {
                    prev = "ma";
                    n += 2;
                } else break;
            }
            
            if (n == b.length()) answer++;
        }
        
        return answer;
    }
}