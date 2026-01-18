import java.util.ArrayList;

class Solution {
    public String[] solution(String[] todo_list, boolean[] finished) {
        ArrayList<String> list = new ArrayList<String>();
        
        for (int i=0; i<todo_list.length; i++) {
            if (!finished[i]) {
                list.add(todo_list[i]);
            }
        }
        
        String[] answer = list.toArray(new String[0]);
        return answer;
    }
}