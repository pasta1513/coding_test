class Solution {
    public String solution(int[] numbers, String hand) {
        int[] left = {0 ,0};
        int[] right = {2, 0};
        
        StringBuilder answer = new StringBuilder();
        
        for (int num : numbers) {
            int[] target = getPosition(num);
            
            if (num == 1 || num == 4 || num == 7) {
                answer.append("L");
                left = target;

            } else if (num == 3 || num == 6 || num == 9) {
                answer.append("R");
                right = target;

            } else {
                int leftDistance = distance(left, target);
                int rightDistance = distance(right, target);
                
                if (leftDistance < rightDistance) {
                    answer.append("L");
                    left = target;
                } else if (leftDistance > rightDistance) {
                    answer.append("R");
                    right = target;
                } else {
                    if (hand.equals("left")) {
                        answer.append("L");
                        left = target;
                    } else {
                        answer.append("R");
                        right = target;
                    }
                }
            }
        }
        
        return answer.toString();
    }
    
    private int[] getPosition(int num) {
        if (num == 0) {
            return new int[]{1, 0};
        }

        int x = (num-1) % 3;
        int y = 3 - (num-1)/3;

        return new int[]{x, y};
    }
    
    private int distance(int[] a, int[] b) {
        return Math.abs(a[0] - b[0]) + Math.abs(a[1] - b[1]);
    }
}
