import java.util.*;

class Solution {
    public int[] solution(int N, int[] stages) {
        int remainder = stages.length;
        HashMap<Integer, Double> probability = new HashMap<>();
        
        for (int i=1; i<=N; i++) {
            int user = 0;
            
            for (int j=0; j<stages.length; j++) {
                if (stages[j] == i) {
                    user++;
                }
            }
            
            if (remainder == 0) probability.put(i, 0.0);
            else probability.put(i, (double) user/remainder);
            remainder -= user;
        }
        
        List<Integer> list = new ArrayList<>(probability.keySet());
        list.sort((o1, o2) -> probability.get(o2).compareTo(probability.get(o1)));
        int answer[] = new int[N];
        
        for (int i=0; i<N; i++) {
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}