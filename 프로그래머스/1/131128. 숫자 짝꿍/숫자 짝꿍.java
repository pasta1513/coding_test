class Solution {
    public String solution(String X, String Y) {
        // 0~9까지의 숫자를 각각 몇 개씩 갖고 있는지 확인한 후 비교하여 최솟값을 가져가면 공통되는 개수
        int[] cntX = new int[10];
        int[] cntY = new int[10];
        
        for (int i=0; i<X.length(); i++) {
            cntX[X.charAt(i) - '0']++;
        }
        for (int i=0; i<Y.length(); i++) {
            cntY[Y.charAt(i) - '0']++;
        }
        
        StringBuilder sb = new StringBuilder();
        for (int i=9; i>=0; i--) {
            int common = Math.min(cntX[i], cntY[i]);
            
            for (int j=0; j<common; j++) {
                sb.append(i);
            }
        }
        
        if (sb.length() == 0) return "-1";
        if (sb.charAt(0) == '0') return "0";
        
        String answer = sb.toString();
        return answer;
    }
}