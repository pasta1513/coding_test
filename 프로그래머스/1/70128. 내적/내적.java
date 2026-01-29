class Solution {
    public int solution(int[] a, int[] b) {
        int dot_product = 0;
        
        for (int i=0; i<a.length; i++) {
            dot_product += a[i] * b[i];
        }
        
        return dot_product;
    }
}