public class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        // cards1과 cards2에서 현재 검사할 인덱스
        int i1 = 0, i2 = 0;

        for (String g : goal) {
            boolean found = false;

            // cards1에서 현재 goal 단어를 찾기
            while (i1 < cards1.length && cards1[i1].equals(g)) {
                i1++;
                found = true;
                break;
            }

            // cards1에서 못 찾았고 cards2에서 현재 goal 단어를 찾기
            if (!found) {
                while (i2 < cards2.length && cards2[i2].equals(g)) {
                    i2++;
                    found = true;
                    break;
                }
            }

            // 만약 두 배열에서도 단어를 찾지 못한 경우
            if (!found) {
                return "No";
            }
        }

        return "Yes";
    }
}