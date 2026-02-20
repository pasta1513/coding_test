class Solution {
    public String solution(int[] food) {
        StringBuilder sb = new StringBuilder();

        // 왼쪽 절반
        for (int i=1; i<food.length; i++) {
            int num = food[i]/2;
            
            for (int j=0; j<num; j++) {
                sb.append(i);
            }
        }
        
        sb.append(0);

        // 오른쪽 절반 거꾸로
        for (int i=food.length-1; i>=1; i--) {
            int num = food[i]/2;
            
            for (int j=0; j<num; j++) {
                sb.append(i);
            }
        }
        
        return sb.toString();
    }
}
