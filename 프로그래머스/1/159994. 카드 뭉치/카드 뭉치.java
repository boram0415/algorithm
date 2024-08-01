public class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        // 각 카드 뭉치에서 현재 검사할 인덱스를 저장할 변수
        int index1 = 0, index2 = 0;
        // 목표 배열을 순회하며 각 단어를 확인
        for (String word : goal) {
            boolean found = false;
            // 현재 단어가 cards1에 있고 해당 인덱스가 아직 사용되지 않았다면
            while (index1 < cards1.length && !found) {
                if (cards1[index1].equals(word)) {
                    found = true; // 단어를 찾았으므로 반복 종료
                    index1++; // 다음 카드로 이동
                } else {
                    index1++; // 찾지 못했다면 다음 카드로 이동
                }
            }
            // cards1에서 못 찾았을 경우 cards2에서 찾기
            while (!found && index2 < cards2.length) {
                if (cards2[index2].equals(word)) {
                    found = true; // 단어를 찾았으므로 반복 종료
                    index2++; // 다음 카드로 이동
                } else {
                    index2++; // 찾지 못했다면 다음 카드로 이동
                }
            }
            // 만약 두 배열에서도 단어를 찾지 못했다면 목표 단어 배열을 만들 수 없음
            if (!found) {
                return "No";
            }
        }
        // 모든 단어를 찾았다면 "Yes" 반환
        return "Yes";
    }
}