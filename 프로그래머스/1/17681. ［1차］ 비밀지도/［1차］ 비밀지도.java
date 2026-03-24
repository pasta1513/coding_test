class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] map1 = new String[n];
        String[] map2 = new String[n];
        String[] answer = new String[n];
        
        for (int i=0; i<n; i++) {
            String num1 = Integer.toBinaryString(arr1[i]);
            String num2 = Integer.toBinaryString(arr2[i]);
            
            while (num1.length() != n) num1 = "0" + num1;
            while (num2.length() != n) num2 = "0" + num2;
            
            String finalNum = "";
            for (int j=0; j<n; j++) {
                if (num1.charAt(j) == num2.charAt(j)
                    && num1.charAt(j) == '0') finalNum += " ";
                else finalNum += "#";
            }
            
            answer[i] = finalNum;
        }
        
        return answer;
    }
    
}