class Solution {
    public int[] solution(int n, long left, long right) {
        // 배열 이해용!
        // int[][] multiplication = new int[n][n];
        // for (int i=0; i<n; i++) {
        //     for (int j=0; j<n; j++) {
        //         multiplication[i][j] = Math.max(i, j) + 1;
        //     }
        // }
        
        int[] array = new int[(int)(right-left+1)];
        
        for (long i=left; i<=right; i++) {
            int row = (int)(i/n);
            int col = (int)(i%n);
            array[(int)(i-left)] = Math.max(row, col) + 1;
        }
        
        return array;
    }
}