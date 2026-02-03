class Solution {
    public int[] solution(String[] park, String[] routes) {
        int park_height = park.length;
        int park_width = park[0].length();
        int row = 0, column = 0;
        
        // 시작 위치
        for (int i=0; i<park.length; i++) {
            for (int j=0; j<park[0].length(); j++) {
                if (park[i].charAt(j) == 'S') {
                    row = i;
                    column = j;
                }
            }
        }
        
        for (String route : routes) {
            String[] route_split = route.split(" ");
            String direction = route_split[0];
            int distance = Integer.parseInt(route_split[1]);
            
            // 동서남북 방향 잡기
            int delta_row = 0, delta_column = 0;
            if (direction.equals("N")) delta_row = -1;
            else if (direction.equals("S")) delta_row = 1;
            else if (direction.equals("W")) delta_column = -1;
            else if (direction.equals("E")) delta_column = 1;
            
            // 밑의 for문에서 row, column을 바로 변경하지 않고 임시로 변경해본 후에 문제 없으면 적용
            int next_row = row;
            int next_column = column;
            boolean blocked = false;
            
            // 위에서 정한 방향으로 거리만큼 1씩 가보면서 확인
            for (int i=0; i<distance; i++) {
                next_row += delta_row;
                next_column += delta_column;
                
                // 공원 영역 체크
                if (next_row<0 || next_row>=park_height
                    || next_column<0 || next_column>=park_width) {
                    blocked = true;
                    break;
                }
                
                // 장애물 체크
                if (park[next_row].charAt(next_column) == 'X') {
                    blocked = true;
                    break;
                }
            }
            
            if (!blocked) {
                row = next_row;
                column = next_column;
            }
        }
        
        return new int[]{row, column};
    }
}