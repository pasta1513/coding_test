class Solution {
    public int solution(String[][] board, int h, int w) {
        String color = board[h][w];
        int same_color_tile = 0;
        
        if (h>0 && board[h-1][w].equals(color)) {
            same_color_tile++;
        }
        if (h<board.length-1 && board[h+1][w].equals(color)) {
            same_color_tile++;
        }
        if (w>0 && board[h][w-1].equals(color)) {
            same_color_tile++;
        }
        if (w<board[0].length-1 && board[h][w+1].equals(color)) {
            same_color_tile++;
        }
        
        return same_color_tile;
    }
}