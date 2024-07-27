import java.util.HashMap;
import java.util.Map;
class Solution {
        public int solution(String[][] clothes) {
        Map<String, Integer> categoryCount = new HashMap<>();

        // 각 종류별로 옷의 수를 셉니다.
        for (String[] cloth : clothes) {
            String category = cloth[1];
            categoryCount.put(category, categoryCount.getOrDefault(category, 0) + 1);
        }

        int answer = 1;

        // 각 종류별로 (옷의 수 + 1)을 곱합니다.
        for (int count : categoryCount.values()) {
            answer *= (count + 1);
        }

        // 아무것도 입지 않은 경우를 제외합니다.
        return answer - 1;
    }
}