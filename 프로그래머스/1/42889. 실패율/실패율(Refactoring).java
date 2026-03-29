import java.util.*;

class Solution {
    public int[] solution(int N, int[] stages) {
        HashMap<Integer, Double> map = new HashMap<>();
        
        int[] counts = new int[N+1];
        for (int stage : stages) {
            counts[stage]++;
        }
        
        int remainder = stages.length;
        
        for (int i=1; i<=N; i++) {
            if (remainder == 0) {
                map.put(i, 0.0);
            } else {
                map.put(i, (double) counts[i]/remainder);
            }
            remaining -= counts[i];
        }
        
        List<Integer> list = new ArrayList<>(map.keySet());
        list.sort((o1, o2) -> map.get(o2).compareTo(map.get(o1)));
        
        int[] answer = new int[N];
        for (int i=0; i<N; i++) {
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}
