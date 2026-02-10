import java.util.ArrayList;
import java.util.Collections;

class Solution {
    public String solution(String X, String Y) {
        ArrayList<String> list = new ArrayList<>();
        String[] listX = new String[X.length()];
        String[] listY = new String[Y.length()];

        for (int i = 0; i < X.length(); i++) {
            listX[i] = X.substring(i, i + 1);
        }
        for (int i = 0; i < Y.length(); i++) {
            listY[i] = Y.substring(i, i + 1);
        }

        // 여기서 O(n²)가 되기 때문에 입력값이 커질 경우 시간 초과 발
        for (int i = 0; i < listX.length; i++) {
            for (int j = 0; j < listY.length; j++) {
                if (listX[i].equals(listY[j])) {
                    list.add(listX[i]);
                    listX[i] = "X";
                    listY[j] = "Y";
                    break;
                }
            }
        }

        if (list.size() == 0) return "-1";

        Collections.sort(list, Collections.reverseOrder());
        // list.sort(Collections.reverseOrder());
        // 만약 문자열을 숫자 비교하고 싶다면 (뺄셈으로 비교 시 오버플로우 위험이 있기 때문에 compare 사용이 더 안전)
        // Comparator 규칙: 결과가 음수면 a가 앞, 결과가 양수면 b가 앞
        // 오름차순: Collections.sort(list, (a, b) -> Integer.compare(Integer.parseInt(a), Integer.parseInt(b)));
        // 내림차순: Collections.sort(list, (a, b) -> Integer.compare(Integer.parseInt(b), Integer.parseInt(a)));

        StringBuilder sb = new StringBuilder();
        for (String a : list) {
            sb.append(a);
        }

        String answer = sb.toString();

        if (answer.charAt(0) == '0') return "0";

        return answer;
    }
}
