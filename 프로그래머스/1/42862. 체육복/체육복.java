import java.util.*;

class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        boolean[] isLost = new boolean[n+1];
        boolean[] hasReserve = new boolean[n+1];
        
        for (int student : lost) {
            isLost[student] = true;
        }
        
        for (int student : reserve) {
            hasReserve[student] = true;
        }
        
        // 도난 당했지만 여벌이 있는 학생
        for (int student : lost) {
            if (hasReserve[student]) {
                isLost[student] = false;
                hasReserve[student] = false;
            }
        }
        
        int answer = n;
        
        for (int student=1; student<=n; student++) {
            if (!isLost[student]) continue;
            
            if (student>1 && hasReserve[student-1]) {
                isLost[student] = false;
                hasReserve[student-1] = false;
            } else if (student<n && hasReserve[student+1]) {
                isLost[student] = false;
                hasReserve[student+1] = false;
            }
        }
        
        for (int student=1; student<=n; student++) {
            if (isLost[student]) answer--;
        }
        
        return answer;
    }
}