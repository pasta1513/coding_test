import java.util.*;

class Solution {
    public int[] solution(int[] arr, int k) {
        ArrayList<Integer> result = new ArrayList<Integer>();
        for (int i=0; i<arr.length; i++) {
            if (!result.contains(arr[i])) {
                result.add(arr[i]);
            }
            
            if(result.size() == k) break;
        }
        
        int[] answer = new int[k];
        for (int i=0; i<k; i++) {
            if (i < result.size()) {
                answer[i] = result.get(i);
            } else {
                answer[i] = -1;
            }
        }
        return answer;
    }
}