import java.util.Arrays;

class Solution {
    public int solution(String[] strs, String t) {
        // 동적 계획법(dp = Dynamic Programming) 사용, 아래가 dp의 기본 패턴
        int[] dp = new int[t.length() + 1];     // 0 1 2 … n
        // dp 배열을 전부 '아직 도달하지 못한 상태'를 표시하기 위한 큰 값으로 표시
        Arrays.fill(dp, t.length()+1);
        dp[0] = 0;
        
        for (int i=0; i<t.length(); i++) {
            // 불필요한 검사는 스킵
            // 예제 1에서 dp[2] = 1이 되고, dp[1]은 여전히 처음 설정 그대로 7로 남아있을 것
            // 이런 경우에 굳이 dp[1]에 대한 진행을 하지 않고 바로 i=2로 넘어가라는 의미
            if (dp[i] == t.length()+1) continue;
            
            for (int x=0; x<strs.length; x++) {
                if (t.startsWith(strs[x], i)) {     // t의 i번째 문자가 특정 단어 조각으로 시작하는지
                    if (i+strs[x].length() <= t.length()) {     // 인덱스 범위 터지지 않게
                        dp[i+strs[x].length()] = Math.min(dp[i+strs[x].length()], dp[i]+1);
                    }
                }
            }
        }
    
        if (dp[t.length()] == t.length()+1) {
            return -1;
        } else {
            return dp[t.length()];
        }
    }
}