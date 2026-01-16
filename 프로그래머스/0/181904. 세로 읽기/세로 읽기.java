class Solution {
    public String solution(String my_string, int m, int c) {
        String answer = "";
        int n = my_string.length()/m;
        //String[][] arr = new String[n][m];
        char[][] arr = new char[n][m];
        
        int idx = 0;
        for (int i=0; i<n; i++) {
            for (int j=0; j<m; j++) {
                //arr[i][j] = String.valueOf(my_string.charAt(idx));
                arr[i][j] = my_string.charAt(idx);
                idx++;
            }
        }
        
        for (int i=0; i<n; i++) {
            answer += arr[i][c-1];
            // java에서 + 연산자는 한 쪽이라도 String 타입이면 나머지도 String 타입으로 자동 형변환
            // 내부적으로 실제 일어나는 일: answer = new StringBuilder(answer).append(arr[i][c-1]).toString();
            // 설명: 기존 String을 기반으로 StringBuilder 생성 → append 수행 → 다시 String으로 변환
        }
        return answer;
    }
}
