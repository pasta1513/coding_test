import java.util.ArrayList;

class Solution {
    public int[] solution(int[] answers) {
        int p1 = 0, p2 = 0, p3 = 0;
        int[] pattern2 = {1, 3, 4, 5};
        int[] pattern3 = {3,3,1,1,2,2,4,4,5,5};
        
        for (int i=0; i<answers.length; i++) {
            int n = answers[i];
            
            if (n == i%5 + 1) p1++;
            
            if (i%2 == 0 && n == 2) p2++;
            else if (i%2 == 1 && n == pattern2[i/2%4]) p2++;
            
            if (n == pattern3[i%10]) p3++;
        }
        
        int max = Math.max(p1, Math.max(p2, p3));

        ArrayList<Integer> list = new ArrayList<Integer>();

        if (p1 == max) list.add(1);
        if (p2 == max) list.add(2);
        if (p3 == max) list.add(3);

        int[] answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }

        return answer;
    }
}