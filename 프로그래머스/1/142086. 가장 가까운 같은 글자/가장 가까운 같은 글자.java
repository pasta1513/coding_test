import java.util.HashMap;

class Solution {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        HashMap<String, Integer> alphabet = new HashMap<String, Integer>();
        
        for (int i=0; i<s.length(); i++) {
            String a = s.substring(i, i+1);
            
            if (!alphabet.containsKey(a)) {
                answer[i] = -1;
                alphabet.put(a, i);
            } else {
                answer[i] = i - alphabet.get(a);
                alphabet.put(a, i);
            }
        }
        
        return answer;
    }
}