import java.util.Arrays;

class Solution {
    public int solution(int k, int m, int[] score) {
        // 오름차순 정렬 후 뒤에서부터 끊기
        Arrays.sort(score);

        int answer = 0;
        int n = score.length;
        
        for (int i=n-m; i>=0; i-=m) {
            answer += score[i] * m;
        }

        return answer;
    }
}