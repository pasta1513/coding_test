import java.util.*;

class Solution {
    public int[] solution(int[] arr, boolean[] flag) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        
        for (int i=0; i<arr.length; i++) {
            if (flag[i]) {
                for (int j=0; j<arr[i]*2; j++) {
                    list.add(arr[i]);
                }
            } else {
                // 실무용 예외 처리 로직 추가
                if (!list.isEmpty()) {
                    for (int j=0; j<arr[i]; j++) {
                        list.remove(list.size() - 1);
                    }
                }
            }
        }
        
        int[] answer = new int[list.size()];
        for (int i=0; i<answer.length; i++) {
            answer[i] = list.get(i);
        }
        return answer;
    }
}