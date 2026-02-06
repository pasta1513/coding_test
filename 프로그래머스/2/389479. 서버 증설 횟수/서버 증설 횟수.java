import java.util.HashMap;

class Solution {
    public int solution(int[] players, int m, int k) {
        // key: 시각, value: 증설된 서버
        HashMap<Integer, Integer> serverMap = new HashMap<Integer, Integer>();
        
        for (int i=0; i<24; i++) { 
            int current_server = 0;
            
            // 현재 존재 서버 수 = 직전부터 k시간 전까지 증설된 서버 수의 합
            int start = Math.max(0, i - k + 1);
            for (int j=i-1; j>=start; j--) {
                current_server += serverMap.getOrDefault(j, 0);
            }
            
            int need_server = players[i] / m;
            // 증설된 서버 수 = 필요 서버 수 - 현재 존재 서버 수
            serverMap.put(i, Math.max(0, need_server - current_server));
        }
        
        int answer = 0;
        for (int i=0; i<24; i++) {
            System.out.println(serverMap.get(i));
            answer += serverMap.get(i);
        }
        return answer;
    }
}