import java.util.HashSet;

class Solution {
    public int solution(int[] nums) {
        int num = nums.length / 2;
        HashSet<Integer> set = new HashSet<Integer>();
        
        for (int n : nums) {
            if (!set.contains(n)) set.add(n);
        }
        
        int answer = 0;
        return (num > set.size()) ? set.size() : num;
    }
}