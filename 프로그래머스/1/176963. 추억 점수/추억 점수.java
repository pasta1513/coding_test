import java.util.HashMap;

class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        HashMap<String, Integer> list = new HashMap<String, Integer>();
        for (int i=0; i<name.length; i++) {
            list.put(name[i], yearning[i]);
        }
        
        int[] yearning_list = new int[photo.length];
        
        for (int i=0; i<photo.length; i++) {
            for (int j=0; j<photo[i].length; j++) {
                if (list.containsKey(photo[i][j])) {
                    yearning_list[i] += list.get(photo[i][j]);
                }
            }
        }
        
        return yearning_list;
    }
}