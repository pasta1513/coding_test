class Solution {
    public String[] solution(String[] quiz) {
        String[] answer = new String[quiz.length];
        String[][] quiz_split = new String[quiz.length][];
        
        for (int i=0; i<quiz.length; i++) {
            quiz_split[i] = quiz[i].split("\\s+");
            int a = Integer.parseInt(quiz_split[i][0]);
            int b = Integer.parseInt(quiz_split[i][2]);
            int c = Integer.parseInt(quiz_split[i][4]);
            
            if (quiz_split[i][1].equals("+")) {
                if (a+b == c) {
                    answer[i] = "O";
                } else {
                    answer[i] = "X";
                }
                
            } else if (quiz_split[i][1].equals("-")) {
                if (a-b == c) {
                    answer[i] = "O";
                } else {
                    answer[i] = "X";
                }
            }
        }
        
        return answer;
    }
}