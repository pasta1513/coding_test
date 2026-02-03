import java.util.HashMap;

class Solution {
    public String[] solution(String[] players, String[] callings) {
        HashMap<String, Integer> players_map = new HashMap<String, Integer>();
        for (int i=0; i<players.length; i++) {
            players_map.put(players[i], i);
        }
        
        for (String call : callings) {
            int idx = players_map.get(call);
            String front = players[idx-1];
            
            players[idx-1] = call;
            players[idx] = front;
            
            players_map.put(call, idx-1);
            players_map.put(front, idx);
        }
        
        return players;
    }
}