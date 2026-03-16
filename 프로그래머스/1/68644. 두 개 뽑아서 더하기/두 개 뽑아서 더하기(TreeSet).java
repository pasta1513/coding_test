import java.util.TreeSet;

class Solution {
    public int[] solution(int[] numbers) {    
        TreeSet<Integer> tset = new TreeSet<Integer>();
        
        for (int i=0; i<numbers.length-1; i++) {
            int n = numbers[i];
            
            for (int j=i+1; j<numbers.length; j++) {
                int m = numbers[j];
                int sum = n + m;
                
                tset.add(sum);
            }
        }        
        
        int[] answer = new int[tset.size()];
        int idx = 0;
        
        for (int num : tset) {
            answer[idx++] = num;
        }
        return answer;
    }
}
