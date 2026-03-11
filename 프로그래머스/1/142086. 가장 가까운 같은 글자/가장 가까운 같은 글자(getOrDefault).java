import java.util.HashMap;

class Solution {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        HashMap<Character, Integer> alphabet = new HashMap<Character, Integer>();
        
        for (int i=0; i<s.length(); i++) {
            char a = s.charAt(i);
            
            int prev = alphabet.getOrDefault(a, -1);
            answer[i] = (prev == -1) ? prev : i-prev;
            
            alphabet.put(a, i);
        }
        
        return answer;
    }
}
