import java.util.HashSet;
import java.util.HashMap;

class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        // set으로 자동 중복 제거
        HashSet<String> set = new HashSet<String>();
        for (String r : report) {
            set.add(r);
        }
        
        HashMap<String, Integer> reported_count = new HashMap<String, Integer>();
        for (String id : id_list) {
            reported_count.put(id, 0);
        }
        
        for (String r : set) {
            String[] r_split = r.split(" ");
            String reported = r_split[1];
            reported_count.put(reported, reported_count.get(reported)+1);
        }
        
        HashSet<String> banned = new HashSet<String>();
        for (String id : id_list) {
            if (reported_count.get(id) >= k) banned.add(id);
        }
        
        HashMap<String, Integer> mail_count = new HashMap<String, Integer>();
        for (String id : id_list) {
            mail_count.put(id, 0);
        }
        
        for (String r : set) {
            String[] r_split = r.split(" ");
            String reporter = r_split[0];
            String reported = r_split[1];
            
            if (banned.contains(reported)) mail_count.put(reporter, mail_count.get(reporter)+1);
        }
        
        int[] answer = new int[id_list.length];
        for (int i=0; i<id_list.length; i++) {
            answer[i] = mail_count.get(id_list[i]);
        }
        return answer;
    }
}