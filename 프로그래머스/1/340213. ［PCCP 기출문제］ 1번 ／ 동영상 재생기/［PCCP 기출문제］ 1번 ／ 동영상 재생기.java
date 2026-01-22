class Solution {
    public String solution(String video_len, String pos, String op_start, String op_end, String[] commands) {
        String[] video_len_split = video_len.split(":");
        int[] video_time = {
            Integer.parseInt(video_len_split[0]), Integer.parseInt(video_len_split[1])
        };
        String[] pos_split = pos.split(":");
        int[] pos_time = {
            Integer.parseInt(pos_split[0]), Integer.parseInt(pos_split[1])
        };
        String[] op_start_split = op_start.split(":");
        int[] op_start_time = {
            Integer.parseInt(op_start_split[0]), Integer.parseInt(op_start_split[1])
        };
        String[] op_end_split = op_end.split(":");
        int[] op_end_time = {
            Integer.parseInt(op_end_split[0]), Integer.parseInt(op_end_split[1])
        };
        int[] start_time = {00, 00};
        
        for (int i=0; i<commands.length; i++) {
            if (compare_op(op_start_time, pos_time, op_end_time)) {
                pos_time[0] = op_end_time[0];
                pos_time[1] = op_end_time[1];
            }
            
            if (commands[i].equals("prev")) {
                pos_time = prev_10(pos_time);
            } else if (commands[i].equals("next")) {
                pos_time = next_10(pos_time, video_time);
            }
            
            if (compare_op(op_start_time, pos_time, op_end_time)) {
                pos_time[0] = op_end_time[0];
                pos_time[1] = op_end_time[1];
            }
        }
        
        return String.format("%02d:%02d", pos_time[0], pos_time[1]);
    }
    
    private int toSeconds(int[] time) {
        return time[0]*60 + time[1];
    }
    
    private boolean compare_op(int[] start, int[] pos, int[] end) {
        int startSec = toSeconds(start);
        int posSec = toSeconds(pos);
        int endSec = toSeconds(end);
        
        return startSec<=posSec && posSec<endSec;
    }
    
    private int[] prev_10(int[] a) {
        int sec = toSeconds(a);
        sec = Math.max(0, sec-10);
        
        a[0] = sec/60;
        a[1] = sec%60;
        
        return a;
    }
    
    private int[] next_10(int[] pos, int[] video_len) {
        int sec = toSeconds(pos);
        int videoSec = toSeconds(video_len);
        sec = Math.min(sec+10, videoSec);
        
        pos[0] = sec/60;
        pos[1] = sec%60;
        
        return pos;
    }
}