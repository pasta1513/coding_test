import java.util.Arrays;

class Solution {
    static 
    public int solution(int[] arr) {
        int answer = 0;
        
        while (true) {
            int[] copyArr = new int[arr.length];
            
            for (int i=0; i<arr.length; i++) {
                if (arr[i]>49 && arr[i]%2==0) {
                    copyArr[i] = arr[i]/2;
                } else if (arr[i]<50 && arr[i]%2==1) {
                    copyArr[i] = arr[i]*2 + 1;
                } else {
                    copyArr[i] = arr[i];
                }
            }
            
            if (Arrays.equals(arr, copyArr)) {
                break;
            }
            
            arr = copyArr;
            answer++;
        }
        return answer;
    }
}