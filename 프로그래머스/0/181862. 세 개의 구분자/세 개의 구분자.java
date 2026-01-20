import java.util.*;

class Solution {
    public String[] solution(String myStr) {
        ArrayList<String> list = new ArrayList<String>();
        String[] myStr_split = myStr.split("[abc]");
        
        for (int i=0; i<myStr_split.length; i++) {
            if (!myStr_split[i].equals("")) {
                list.add(myStr_split[i]);
            }
        }
        
        if (list.size() == 0) {
            list.add("EMPTY");
        }
        String[] answer = list.toArray(new String[0]);
        return answer;
    }
}