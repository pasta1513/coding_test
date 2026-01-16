class Solution {
    public String solution(String my_string, int m, int c) {
        String answer = "";
        int n = my_string.length()/m;
        String[][] arr = new String[n][m];
        
        int idx = 0;
        for (int i=0; i<n; i++) {
            for (int j=0; j<m; j++) {
                arr[i][j] = String.valueOf(my_string.charAt(idx));
                idx++;
            }
        }
        
        for (int i=0; i<n; i++) {
            answer += arr[i][c-1];   
        }
        return answer;
    }
}