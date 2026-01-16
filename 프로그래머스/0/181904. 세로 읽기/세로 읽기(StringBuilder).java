class Solution {
    public String solution(String my_string, int m, int c) {
        // StringBuilder: 문자열을 “변경 가능(mutable)”하게 다룰 수 있는 클래스
        // String: 불변 객체, 문자열 변경마다 새 객체 생성, 반복문에서 사용 시 성능 저하
        // StringBuilder: 가변 객체, 새로운 객체를 생성하지 않고 내용만 연결, 반복 연결에 매우 효율적
        // sb.append()를 사용하여 타입 관계 없이 붙일 수 있고, sb.toString으로 문자열 변경 가능
        StringBuilder sb = new StringBuilder();
        
        // c-1로 열을 맞춰준 뒤, m의 간격을 유지하며 문자열 추가
        for (int i=c-1; i<my_string.length(); i+=m) {
            sb.append(my_string.charAt(i));
        }
        
        return sb.toString();
    }
}
