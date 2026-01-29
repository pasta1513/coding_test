import java.util.HashSet;

class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        HashSet<Integer> set = new HashSet<Integer>();
        for (int x : numbers) {
            set.add(x);
        }
        
        for (int i=0; i<10; i++) {
            if (!set.contains(i)) {
                answer += i;
            }
        }
        return answer;
    }
}