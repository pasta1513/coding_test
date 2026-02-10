class Solution {
    public int solution(String s) {
        String result = "";
        // ze, on tw, th, fo, fi, si, se, ei, ni
        for (int i=0; i<s.length(); i++) {
            if (s.substring(i, i+1).matches("\\d+")) {
                result += s.substring(i, i+1);
            } else {
                String sub = s.substring(i, i+2);
                
                if (sub.equals("ze")) {result += "0"; i += 3;}
                else if (sub.equals("on")) {result += "1"; i += 2;}
                else if (sub.equals("tw")) {result += "2"; i += 2;}
                else if (sub.equals("th")) {result += "3"; i += 4;}
                else if (sub.equals("fo")) {result += "4"; i += 3;}
                else if (sub.equals("fi")) {result += "5"; i += 3;}
                else if (sub.equals("si")) {result += "6"; i += 2;}
                else if (sub.equals("se")) {result += "7"; i += 4;}
                else if (sub.equals("ei")) {result += "8"; i += 4;}
                else if (sub.equals("ni")) {result += "9"; i += 3;}
            }
        }
        
        int answer = Integer.parseInt(result);
        return answer;
    }
}