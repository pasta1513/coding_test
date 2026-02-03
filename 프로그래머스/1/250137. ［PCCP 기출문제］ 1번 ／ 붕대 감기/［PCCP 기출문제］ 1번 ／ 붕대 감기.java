import java.util.HashMap;

class Solution {
    public int solution(int[] bandage, int health, int[][] attacks) {
        HashMap<Integer, Integer> attacks_list = new HashMap<Integer, Integer>();
        for (int i=0; i<attacks.length; i++) {
            attacks_list.put(attacks[i][0], attacks[i][1]);
        }
        
        int continuous_bandage = 0;
        int current_health = health;
        
        // 0부터 마지막 공격 초(포함)까지 진행
        // 마지막 공격의 초는 attacks 배열의 마지막 행의 0번째 열
        for (int i=0; i<=attacks[attacks.length-1][0]; i++) {
            if (attacks_list.containsKey(i)) {
                current_health -= attacks_list.get(i);
                continuous_bandage = 0;
                
                if (current_health <= 0) {
                    return -1;
                }
            } else {
                current_health += bandage[1];
                continuous_bandage++;
                
                // 체력의 상한이 있다는 건, 현재 체력과 최대 체력 중 최솟값을 택한다는 뜻!
                current_health = Math.min(current_health, health);
                // if (current_health > health) {
                //     current_health = health;
                // }
            }
            
            if (continuous_bandage == bandage[0]) {
                current_health += bandage[2];
                continuous_bandage = 0;
                
                current_health = Math.min(current_health, health);
                // if (current_health > health) {
                //     current_health = health;
                // }
            }
        }
        
        return current_health;
    }
}