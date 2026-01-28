class Solution {
    public int solution(String my_string) {
        String[] my_string_split = my_string.split(" ");
        int answer = Integer.parseInt(my_string_split[0]);
        
        for (int i=1; i<my_string_split.length; i+=2) {
            if (my_string_split[i].equals("+")) {
                answer += Integer.parseInt(my_string_split[i+1]);
            } else {
                answer -= Integer.parseInt(my_string_split[i+1]);
            }
        }
        
        return answer;
    }
}
