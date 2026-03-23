import java.util.Arrays;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        
        for (int i=0; i<commands.length; i++) {
            int start = commands[i][0] - 1;
            int len = commands[i][1] - commands[i][0] + 1;
            int idx = commands[i][2] - 1;
            int[] subArr = new int[len];
            
            for (int j=0; j<len; j++) {
                subArr[j] = array[j+start];
            }

            Arrays.sort(subArr);
            answer[i] = subArr[idx];
        }
        
        return answer;
    }
}