import java.util.*;

public class Solution {
    public int[] solution(int[] arr) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(arr[0]);
        
        for (int i=0; i<arr.length; i++) {
            for (int j=i+1; j<arr.length; j++) {
                if (arr[i] != arr[j]) {
                    list.add(arr[j]);
                    i = j;
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