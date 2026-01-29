class Solution {
    public int solution(int[] absolutes, boolean[] signs) {
        int[] nums = new int[absolutes.length];
        for (int i=0; i<absolutes.length; i++) {
            nums[i] = signs[i] ? absolutes[i] : -absolutes[i];
        }
        
        int sum = 0;
        for (int x : nums) {
            sum += x;
        }
        
        return sum;
    }
}