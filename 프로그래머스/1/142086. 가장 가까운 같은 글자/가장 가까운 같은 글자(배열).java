import java.util.Arrays;

class Solution {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        // 알파벳 개수: 26개
        int[] last = new int[26];
        
        Arrays.fill(last, -1);
        
        for (int i=0; i<s.length(); i++) {
            // 아스키코드
            int idx = s.charAt(i) - 'a';
            answer[i] = (last[idx] == -1) ? -1 : i-last[idx];
            
            last[idx] = i;
        }
        
        return answer;
    }
}
