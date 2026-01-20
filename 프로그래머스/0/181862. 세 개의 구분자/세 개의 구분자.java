import java.util.*;

class Solution {
    public String[] solution(String myStr) {
        ArrayList<String> list = new ArrayList<String>();
        // 대괄호 []는 안에 있는 문자 중 하나라는 뜻
        // 즉 [abc] -> a 또는 b 또는 c
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
