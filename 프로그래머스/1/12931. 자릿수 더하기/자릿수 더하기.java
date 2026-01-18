import java.util.*;

public class Solution {
    public int solution(int n) {
        int answer = 0;
        String str = String.valueOf(n);

        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println(str);
        
        for (int i=0; i<str.length(); i++) {
            int num = Integer.parseInt(str.substring(i, i+1));
            answer += num;
        }

        return answer;
    }
}