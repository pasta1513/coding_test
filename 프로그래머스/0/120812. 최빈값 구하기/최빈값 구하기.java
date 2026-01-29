import java.util.*;

class Solution {
    public int solution(int[] array) {
        HashMap<Integer, Integer> frequency = new HashMap<Integer, Integer>();
        for (int x : array) {
            if (frequency.containsKey(x)) {
                frequency.put(x, frequency.get(x) + 1);
            } else {
                frequency.put(x, 1);
            }
        }
        
        int max_frequency = Collections.max(frequency.values());
        int answer = 0;
        int count = 0;
        
        for (int key : frequency.keySet()) {
            if (frequency.get(key) == max_frequency) {
                answer = key;
                count++;
            }
        }
            
        if (count > 1) {
            answer = -1;
        }
        return answer;
    }
}