import java.util.*;
import java.lang.Math;

class Solution {
    public int solution(String[] strArr) {
        int answer = 0;
        // 키: 길이, 값: 개수
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        
        for (int i=0; i<strArr.length; i++) {
            int len = strArr[i].length();
            // map.getOrDefault(key, 기본값): key가 있다면 해당 값을, 없다면 기본값을 반환
            int count = map.getOrDefault(len, 0) + 1;
            map.put(len, count);
            answer = Math.max(answer, count);
        }
        
        return answer;
    }
}