import java.util.ArrayList;

class Solution {
    public int[] solution(int[] arr) {
        ArrayList<Integer> stk = new ArrayList<Integer>();
        int i = 0;
        
        while (i < arr.length) {
            if (stk.size() == 0) {
                stk.add(arr[i]);
                i++;
            } else if (stk.get(stk.size()-1) == arr[i]) {
                stk.remove(stk.size()-1);
                i++;
            } else {
                stk.add(arr[i]);
                i++;
            }
        }
        
        if (stk.size() == 0) {
            stk.add(-1);
        }
        
        int[] answer = new int[stk.size()];
        for (int j=0; j<answer.length; j++) {
            answer[j] = stk.get(j);
        }
        return answer;
    }
}