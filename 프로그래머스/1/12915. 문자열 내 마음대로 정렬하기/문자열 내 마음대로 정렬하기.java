import java.util.*;

class Solution {
    public String[] solution(String[] strings, int n) {
        HashMap<Integer, String> map = new HashMap<>();
        
        for (int i=0; i<strings.length; i++) {
            map.put(i, strings[i].substring(n, n+1));
        }
        
        List<Integer> keySet = new ArrayList<>(map.keySet());
        keySet.sort((o1, o2) -> {
            int cmp = map.get(o1).compareTo(map.get(o2));
            
            if (cmp == 0) {
                return strings[o1].compareTo(strings[o2]);
            }
            
            return cmp;
        });
        
        String[] answer = new String[strings.length];
        
        int idx = 0;
        for (int key : keySet) {
            answer[idx++] = strings[key];
        }
        return answer;
    }
}