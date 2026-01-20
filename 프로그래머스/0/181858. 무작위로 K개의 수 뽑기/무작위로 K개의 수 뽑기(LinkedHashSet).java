import java.util.*;

class Solution {
    public int[] solution(int[] arr, int k) {
        // HashSet: 순서 유지 X, 중복 제거 O
        // LinkedHashSet: 순서 유지 O, 중복 제거 O
        Set<Integer> result = new LinkedHashSet<Integer>();
        
        for (int i=0; i<arr.length; i++) {
            result.add(arr[i]); // 중복이면 자동 무시
            if(result.size() == k) break;
        }
        
        int[] answer = new int[k];
        int idx = 0;
        
        // Set → 배열로 옮기기
        for (int num : result) {
            answer[idx++] = num;
        }
        while (idx < k) {
            answer[idx++] = -1;
        }
        
        return answer;
    }
}
