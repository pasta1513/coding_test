class Solution {
    public int[] solution(String[] wallpaper) {
        int ldx=wallpaper.length, ldy=wallpaper[0].length();
        int rdx = 0, rdy = 0;
        
        for (int i=0; i<wallpaper.length; i++) {
            for (int j=0; j<wallpaper[0].length(); j++) {
                if(wallpaper[i].charAt(j) == '#') {
                    ldx = Math.min(ldx, i);
                    ldy = Math.min(ldy, j);
                    rdx = Math.max(rdx, i+1);
                    rdy = Math.max(rdy, j+1);
                }
            }
        }
        
        int[] answer = new int[]{ldx, ldy, rdx, rdy};
        return answer;
    }
}