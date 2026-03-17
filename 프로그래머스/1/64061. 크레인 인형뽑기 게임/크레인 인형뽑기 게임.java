import java.util.ArrayList;

class Solution {
    public int solution(int[][] board, int[] moves) {
        ArrayList<Integer> doll = new ArrayList<Integer>();
        int answer = 0;
        
        for (int i=0; i<moves.length; i++) {
            int n = moves[i] - 1;
            
            for (int j = 0; j < board.length; j++) {
                if (board[j][n] != 0) {
                    int picked = board[j][n];
                    board[j][n] = 0;

                    // 빈 배열이 아니고 이전 픽업의 마지막 인형이 지금 잡은 인형과 같다면 제거
                    // 같지 않다면 배열에 추가
                    if (!doll.isEmpty() && doll.get(doll.size() - 1) == picked) {
                        doll.remove(doll.size() - 1);
                        answer += 2;
                    } else {
                        doll.add(picked);
                    }

                    break;
                }
            }
        }
        
        return answer;
    }
}