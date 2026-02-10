class Solution {
    public int solution(int[][] sizes) {
        for (int i=0; i<sizes.length; i++) {
            int max = Math.max(sizes[i][0], sizes[i][1]);
            int min = Math.min(sizes[i][0], sizes[i][1]);
            sizes[i] = new int[]{max, min};
        }
        
        int a = 0, b = 0;
        for (int[] size : sizes) {
            a = Math.max(a, size[0]);
            b = Math.max(b, size[1]);
        }
        
        int answer = a * b;
        return answer;
    }
}