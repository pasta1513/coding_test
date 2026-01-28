import java.util.ArrayList;

class Solution {
    public int[] solution(int n) {
        ArrayList<Integer> answer_list = new ArrayList<Integer>();
        int number = n;
        int x = 2;
        
        while (number > 1) {
            for (int i=2; i<=number; i++) {
                if (number%i == 0) {
                    answer_list.add(i);
                    while (number%i == 0) {
                        number /= i;
                    }
                }
            }
        }
        
        int[] answer = new int[answer_list.size()];
        for (int i=0; i<answer.length; i++) {
            answer[i] = answer_list.get(i);
        }
        return answer;
    }
}