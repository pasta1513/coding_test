class Solution {
    public int solution(String number) {
        int answer = 0;
        while (number.length() > 1) {
            answer = 0;
            for (int i=0; i<number.length(); i++) {
                answer += Integer.parseInt(String.valueOf(number.charAt(i)));
            }
            number = String.valueOf(answer);
        }
        if (answer == 9) {
            answer = 0;
        }
        return answer;
    }
}