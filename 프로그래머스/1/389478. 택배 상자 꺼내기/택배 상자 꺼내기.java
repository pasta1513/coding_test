import java.util.HashMap;

class Solution {
    public int solution(int n, int w, int num) {
        HashMap<Integer, int[]> map = new HashMap<Integer, int[]>();
        for (int i=0; i<n; i++) {
            if ((i/w)%2 == 0) {
                map.put(i+1, new int[]{i/w, i%w});
            } else {
                map.put(i+1, new int[]{i/w, w - i%w - 1});
            }
        }
        
        int answer = 1;
        for (int[] v : map.values()) {
            if (v[1] == map.get(num)[1] && v[0] > map.get(num)[0]) {
                answer++;
            }
        }
        return answer;
    }
}