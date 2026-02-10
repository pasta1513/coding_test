import java.util.HashMap;

class Solution {
    public String solution(String[] survey, int[] choices) {
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        for (int i=0; i<choices.length; i++) {
            int c = choices[i];
            String sub1 = survey[i].substring(0, 1);
            String sub2 = survey[i].substring(1, 2);
            
            
            if (c == 1) map.put(sub1, map.getOrDefault(sub1, 0) + 3);
            else if (c == 2) map.put(sub1, map.getOrDefault(sub1, 0) + 2);
            else if (c == 3) map.put(sub1, map.getOrDefault(sub1, 0) + 1);
            else if (c == 4) continue;
            else if (c == 5) map.put(sub2, map.getOrDefault(sub2, 0) + 1);
            else if (c == 6) map.put(sub2, map.getOrDefault(sub2, 0) + 2);
            else if (c == 7) map.put(sub2, map.getOrDefault(sub2, 0) + 3);
        }
        
        StringBuilder sb = new StringBuilder();
        
        if (map.getOrDefault("R", 0) >= map.getOrDefault("T", 0)) sb.append("R");
        else sb.append("T");
        
        if (map.getOrDefault("C", 0) >= map.getOrDefault("F", 0)) sb.append("C");
        else sb.append("F");
        
        if (map.getOrDefault("J", 0) >= map.getOrDefault("M", 0)) sb.append("J");
        else sb.append("M");
        
        if (map.getOrDefault("A", 0) >= map.getOrDefault("N", 0)) sb.append("A");
        else sb.append("N");
        
        return sb.toString();
    }
}