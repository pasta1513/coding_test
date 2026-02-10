import java.util.ArrayList;
import java.util.HashMap;

class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        ArrayList<String> report_list = new ArrayList<String>();

        // 중복 제거를 contains로 하면 O(n²) 터짐
        for (int i=0; i<report.length; i++) {
            if (!report_list.contains(report[i])) report_list.add(report[i]);
        }
        
        String[][] real_report = new String[report_list.size()][2];
        for (int i=0; i<report_list.size(); i++) {
            real_report[i] = report_list.get(i).split(" ");
        }
        
        HashMap<String, Integer> report_time = new HashMap<String, Integer>();
        for (int i=0; i<id_list.length; i++) {
            report_time.put(id_list[i], 0);
        }
        
        for (int i=0; i<real_report.length; i++) {
            String user = real_report[i][1];
            int time = report_time.get(user);
            report_time.put(user, time+1);
        }
        
        for (int i=0; i<id_list.length; i++) {
            String user = id_list[i];
            if (report_time.get(user) >= k) report_time.put(user, -1);
        }
        
        HashMap<String, Integer> mail_time = new HashMap<String, Integer>();
        for (String user : id_list) {
            mail_time.put(user, 0);
        }
        
        for (String[] rrp : real_report) {
            String id = rrp[0];
            String opponent = rrp[1];
            
            int time = mail_time.get(id);
            
            if (report_time.get(opponent) == -1) mail_time.put(id, time+1);
        }
        
        int[] answer = new int[id_list.length];
        for (int i=0; i<id_list.length; i++) {
            answer[i] = mail_time.get(id_list[i]);
        }
        return answer;
    }
}
