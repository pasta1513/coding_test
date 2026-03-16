import java.util.*;

class Solution {
    public int[] solution(int[] numbers) {
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
        for (int i=0; i<numbers.length-1; i++) {
            int n = numbers[i];
            
            for (int j=i+1; j<numbers.length; j++) {
                int m = numbers[j];
                int sum = n + m;
                
                pq.offer(sum);
            }
        }
        
        ArrayList<Integer> list = new ArrayList<Integer>();
        
        int prev = -1;
        
        while (!pq.isEmpty()) {
            int cur = pq.poll();
            
            if (prev == -1 || cur != prev) {
                list.add(cur);
                prev = cur;
            }
        }
        
        int[] answer = new int[list.size()];
        
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}