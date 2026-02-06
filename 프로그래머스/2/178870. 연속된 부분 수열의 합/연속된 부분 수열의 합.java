class Solution {
    public int[] solution(int[] sequence, int k) {
        int left = 0, sum = 0;
        int bestL = 0, bestR = sequence.length - 1;
        int bestLen = sequence.length;
        
        for (int right=0; right<sequence.length; right++) {
            sum += sequence[right];
            
            while (sum>k && left<=right) {
                sum -= sequence[left];
                left++;
            }
            
            if (sum == k) {
                int len = right - left;
                
                if (len < bestLen) {
                    bestLen = len;
                    bestL = left;
                    bestR = right;
                }
            }
        }
        
        int[] answer = new int[]{bestL, bestR};
        return answer;
    }
}