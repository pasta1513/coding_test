class Solution {
    public int solution(int[] schedules, int[][] timelogs, int startday) {
        int answer = 0;
        
        for (int i=0; i<schedules.length; i++) {
            boolean ok = true;
            int day = startday;
            
            for (int j=0; j<timelogs[i].length; j++) {
                if (day == 6 || day == 7) {
                    day = day%7 + 1;
                    continue;
                }
                
                if (toMinutes(schedules[i])+10 < toMinutes(timelogs[i][j])) {
                    ok = false;
                    break;
                }
                
                day = day%7 + 1;
            }
            
            if (ok) answer++;
        }
        
        return answer;
    }
    
    private int toMinutes(int a) {
        int hour = a/100;
        int min = a%100;
        
        return hour*60 + min;
    }
}