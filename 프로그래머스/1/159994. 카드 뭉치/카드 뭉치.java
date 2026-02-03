import java.util.HashMap;

class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        HashMap<String, Integer> cards1_map = new HashMap<String, Integer>();
        HashMap<String, Integer> cards2_map = new HashMap<String, Integer>();
        
        for (int i=0; i<cards1.length; i++) {
            cards1_map.put(cards1[i], i);
        }
        for (int i=0; i<cards2.length; i++) {
            cards2_map.put(cards2[i], i);
        }
        
        int cards1_idx = 0;
        int cards2_idx = 0;
        
        for (String word : goal) {
            if (cards1_map.containsKey(word) && cards1_map.get(word)==cards1_idx) {
                cards1_idx++;
            } else if (cards2_map.containsKey(word) && cards2_map.get(word)==cards2_idx) {
                cards2_idx++;
            } else {
                return "No";
            }
        }
        
        return "Yes";
    }
}