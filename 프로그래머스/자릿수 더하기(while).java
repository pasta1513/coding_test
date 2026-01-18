import java.util.*;

public class Solution {
    public int solution(int n) {
        int answer = 0;

        // 일의 자리부터 더하면서 지워나가는 방식
        while (n > 0) {
            answer += n % 10;
            n /= 10;
        }

        return answer;
    }
}
