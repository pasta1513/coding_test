class Solution {
    public int solution(int n, int w, int num) {

        // num의 row와 column만 구하기
        int row = (num-1) / w;
        int col;
        if (row%2 == 0) {
            col = (num-1) % w;
        } else {
            col = w-1 - ((num-1)%w);
        }

        int answer = 0;

        // num이 있는 row부터 시작해서 row를 올려가며 같은 col의 박스 존재 여부 확인
        for (int r=row; ; r++) {
            int box;

            if (r%2 == 0) {
                box = r*w + col + 1;
            } else {
                box = r*w + (w-col);
            }

            // box의 번호가 n보다 커지면 멈추기
            if (box > n) break;
            answer++;
        }

        return answer;
    }
}
