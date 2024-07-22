import java.util.ArrayList;
import java.util.List;
class Solution {
    public int[] solution(int n, long left, long right) {
        List<Integer> result = new ArrayList<>();

        for (long k = left; k <= right; k++) {
            int i = (int)(k / n);
            int j = (int)(k % n);
            result.add(Math.max(i, j) + 1);
        }

        return result.stream().mapToInt(Integer::intValue).toArray();
    }
}