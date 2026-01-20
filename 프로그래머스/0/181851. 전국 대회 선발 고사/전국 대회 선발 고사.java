import java.util.*;

class Solution {
    public int solution(int[] rank, boolean[] attendance) {
        int num = 1;
        ArrayList<Integer> attendance_rank = new ArrayList<Integer>();
        
        while (attendance_rank.size() < 3) {
            for (int i=0; i<rank.length; i++) {
                if (rank[i] == num) {
                    if (attendance[i]) {
                        attendance_rank.add(i);
                    }
                    
                    num++;
                }
            }
        }
    
        int answer = attendance_rank.get(0) * 10000
                     + attendance_rank.get(1) * 100
                     + attendance_rank.get(2);
        return answer;
    }
}