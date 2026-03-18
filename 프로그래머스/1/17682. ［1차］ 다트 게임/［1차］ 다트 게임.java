class Solution {
    public int solution(String dartResult) {
        String[] results = new String[3];
        
        int idx = 0;
        int start = 0;

        for (int i = 0; i < dartResult.length(); i++) {
            char c = dartResult.charAt(i);

            if (c == 'S' || c == 'D' || c == 'T') {
                int end = i+1;

                if (end < dartResult.length()) {
                    char next = dartResult.charAt(end);
                    if (next == '*' || next == '#') {
                        end++;
                    }
                }

                results[idx++] = dartResult.substring(start, end);
                start = end;
            }
        }
        
        int[] sums = new int[3];
        
        for (int i=0; i<idx; i++) {
            String r = results[i];

            int num;
            int pos;

            if (r.charAt(1) == '0') {
                num = 10;
                pos = 2;
            } else {
                num = r.charAt(0) - '0';
                pos = 1;
            }

            char bonus = r.charAt(pos);

            if (bonus == 'S') sums[i] = num;
            else if (bonus == 'D') sums[i] = (int) Math.pow(num, 2);
            else if (bonus == 'T') sums[i] = (int) Math.pow(num, 3);

            if (pos + 1 < r.length()) {
                char opt = r.charAt(pos + 1);

                if (opt == '*') {
                    sums[i] *= 2;
                    if (i > 0) sums[i-1] *= 2;
                } else if (opt == '#') {
                    sums[i] *= -1;
                }
            }
        }
        
        int answer = 0;
        for (int s : sums) answer+= s;
        
        return answer;
    }
}