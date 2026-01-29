class Solution {
    public int[] solution(int[] numlist, int n) {
        for (int i=0; i<numlist.length-1; i++) {
            for (int j=i+1; j<numlist.length; j++) {
                int a = numlist[i];
                int b = numlist[j];
                int da = Math.abs(a - n);
                int db = Math.abs(b - n);
                
                if (da == db) {
                    numlist[i] = Math.max(a, b);
                    numlist[j] = Math.min(a, b);
                } else {
                    if (da < db) {
                        numlist[i] = a;
                        numlist[j] = b;
                    } else {
                        numlist[i] = b;
                        numlist[j] = a;
                    }
                }
            } 
        }
        
        return numlist;
    }
}