import java.util.ArrayList;
import java.util.HashMap;

class Solution {
    public int[] solution(String today, String[] terms, String[] privacies) {
        ArrayList<Integer> result = new ArrayList<Integer>();
        
        HashMap<String, Integer> termMap = new HashMap<>();
        for (int i = 0; i < terms.length; i++) {
            String[] temp = terms[i].split(" ");
            termMap.put(temp[0], Integer.parseInt(temp[1]));
        }
        
        int[][] privacy_date = new int[privacies.length][3];
        String[] privacy_type = new String[privacies.length];
        for (int i = 0; i < privacies.length; i++) {
            String[] temp = privacies[i].split(" ");
            String dateStr = temp[0];
            privacy_type[i] = temp[1];

            String[] date_split = dateStr.split("\\.");
            privacy_date[i][0] = Integer.parseInt(date_split[0]);
            privacy_date[i][1] = Integer.parseInt(date_split[1]);
            privacy_date[i][2] = Integer.parseInt(date_split[2]);
        }
        
        String[] todaySplit = today.split("\\.");
        int[] today_date = new int[3];
        today_date[0] = Integer.parseInt(todaySplit[0]);
        today_date[1] = Integer.parseInt(todaySplit[1]);
        today_date[2] = Integer.parseInt(todaySplit[2]);
        
        for (int i=0; i<privacies.length; i++) {
            int period = termMap.get(privacy_type[i]);
            
            // 12월 계산을 위해 1 빼고 나눠준 후에 달의 경우 다시 추가
            privacy_date[i][0] += (privacy_date[i][1] + period - 1) / 12;
            privacy_date[i][1] = (privacy_date[i][1] + period - 1) % 12 + 1;
            
            // 만료일을 하루 전이기 때문에 -1
            privacy_date[i][2] -= 1;
            if (privacy_date[i][2] == 0) {
                privacy_date[i][2] = 28;
                privacy_date[i][1] -=1;
                
                if (privacy_date[i][1] == 0) {
                    privacy_date[i][1] = 12;
                    privacy_date[i][0] -= 1;
                }
            }
            
            boolean check = false;
            
            if (today_date[0] > privacy_date[i][0]) check = true;
            else if (today_date[0] == privacy_date[i][0]) {
                if (today_date[1] > privacy_date[i][1]) check = true;
                else if (today_date[1] == privacy_date[i][1]) {
                    if (today_date[2] > privacy_date[i][2]) check = true;
                }
            }
            
            if (check) {
                result.add(i+1);
            }
        }
        
        int[] answer = new int[result.size()];
        for (int i=0; i<answer.length; i++) {
            answer[i] = result.get(i);
        }        
        return answer;
    }
}