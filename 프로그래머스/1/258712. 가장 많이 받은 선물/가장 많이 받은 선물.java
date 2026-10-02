import java.util.*;

class Solution {
    public int solution(String[] friends, String[] gifts) {
        int num = friends.length;
        
        // 사람마다 고유 번호 부여
        HashMap<String, Integer> friendsMap = new HashMap<>();
        for (int i=0; i<num; i++) {
            friendsMap.put(friends[i], i);
        }
        
        // 서로 주고 받은 횟수 nxn 배열로 변환
        int[][] giftCount = new int[num][num];
        for (String gift : gifts) {
            String[] people = gift.split(" ");
            
            int from = friendsMap.get(people[0]);
            int to = friendsMap.get(people[1]);
            
            giftCount[from][to]++;
        }
        
        // 선물 지수
        int[] giftIndex = new int[num];
        for (int i=0; i<num; i++) {
            for (int j=0; j<num; j++) {
                giftIndex[i] += giftCount[i][j];
                giftIndex[i] -= giftCount[j][i];
            }
        }
        
        // 2명씩 비교해서 다음 달 받을 선물 개수 계산
        int[] nextMonth = new int[num];
        for (int i=0; i<num; i++) {
            for (int j=i+1; j<num; j++) {
                if (giftCount[i][j] > giftCount[j][i]) {
                    nextMonth[i]++;
                } else if (giftCount[i][j] < giftCount[j][i]) {
                    nextMonth[j]++;
                } else {
                    if (giftIndex[i] > giftIndex[j]) {
                        nextMonth[i]++;
                    } else if (giftIndex[i] < giftIndex[j]) {
                        nextMonth[j]++;
                    }
                }
            }
        }
        
        // 다음 달에 선물을 가장 많이 받을 사람의 개수
        int answer = 0;
        for (int count : nextMonth) {
            answer = Math.max(answer, count);
        }
        return answer;
    }
}