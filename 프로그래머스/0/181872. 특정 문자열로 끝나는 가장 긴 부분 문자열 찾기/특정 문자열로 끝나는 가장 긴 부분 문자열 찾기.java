class Solution {
    public String solution(String myString, String pat) {
        String answer = "";
        int n = pat.length();
        for (int i=0; i<myString.length()-n+1; i++) {
            if ((myString.substring(i, i+n)).equals(pat)) {
                answer = myString.substring(0, i+n);
            }
        }
        return answer;
    }
}