class Solution {
    public int solution(int[] mats, String[][] park) {
        // 내림차순으로 재정렬하여 가장 큰 돗자리 발견 시 바로 멈출 수 있게
        for (int i=0; i<mats.length-1; i++) {
            for (int j=i+1; j<mats.length; j++) {
                if (mats[i] < mats[j]) {
                    int tmp = mats[i];
                    mats[i] = mats[j];
                    mats[j] = tmp;
                }
            }
        }
        
        // 돗자리 크기 하나 선택
        for (int i=0; i<mats.length; i++) {
            // park의 시작 행
            for (int j=0; j<=park.length-mats[i]; j++) {
                // park의 시작 열
                for (int jj=0; jj<=park[0].length-mats[i]; jj++) { 
                    boolean canPlace = true;
                    
                    // 정사각형 내부 행
                    for (int k=j; k<j+mats[i]; k++) {
                        // 정사각형 내부 열
                        for (int kk=jj; kk<jj+mats[i]; kk++) {
                            if (!park[k][kk].equals("-1")) {
                                canPlace = false;
                                break;
                            }
                        }
                        
                        if (!canPlace) break;
                    } 
            
                    if (canPlace) {
                        return mats[i];
                    }
                }
            }
        }
        
        return -1;
    }
}