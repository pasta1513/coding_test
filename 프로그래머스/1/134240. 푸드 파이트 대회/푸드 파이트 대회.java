class Solution {
    public String solution(int[] food) {
        int[] num = new int[food.length];
        
        for (int i=1; i<food.length; i++) {
            num[i] = food[i]/2;
        }
        
        String answer = "";
        
        for (int i=0; i<num.length; i++) {
            if (num[i] == 0) continue;
            
            for (int j=0; j<num[i]; j++) {
                answer += String.valueOf(i);
            }
        }

        // 시간복잡도 O(n²)
        answer += "0";
        
        for (int i=num.length-1; i>=0; i--) {
            if (num[i] == 0) continue;
            
            for (int j=0; j<num[i]; j++) {
                answer += String.valueOf(i);
            }
        }
        
        return answer;
    }
}
