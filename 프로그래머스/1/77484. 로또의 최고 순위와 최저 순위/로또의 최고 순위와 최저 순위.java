import java.util.HashSet;

class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int min = 0, possible = 0;
        
        HashSet<Integer> set = new HashSet<Integer>();
        for (int num : win_nums) {
            set.add(num);
        }
        
        for (int lotto : lottos) {
            if (lotto == 0) {
                possible++;
            } else if (set.contains(lotto)) {
                min++;
            }
        }
        
        int max = min + possible;
        
        int min_rank = Math.min(6, 7-min);
        int max_rank = Math.min(6, 7-max);
        
        int[] answer = new int[]{max_rank, min_rank};
        return answer;
    }
}