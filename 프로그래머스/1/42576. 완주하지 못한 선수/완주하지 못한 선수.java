import java.util.*;

class Solution {
    public String solution(String[] participant, String[] completion) {
        Map<String, Integer> map = new HashMap<>();
        
        // 사람 수 세기
        for (String person : participant) {
            map.put(person, map.getOrDefault(person, 0) + 1);
        }
        
        for (String person : completion) {
            map.put(person, map.get(person) - 1);
        }
        
        // 만약 미완주자가 여러명이라면 여기서 ArrayList를 생성해서 추가
        for (String person : map.keySet()) {
            if (map.get(person) != 0) {
                return person;
            }
        }
        
        return "";
    }
}