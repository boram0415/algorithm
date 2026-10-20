import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(1, n, k, new ArrayList<>(), result);
        return result;
    }

    private void backtrack(int start, int n, int k,
                           List<Integer> current,
                           List<List<Integer>> result) {
        if (current.size() == k) {
            result.add(new ArrayList<>(current));
            return;
        }

        // 남은 숫자로 k개를 채울 수 있는 범위까지만 탐색
        int last = n - (k - current.size()) + 1;
        for (int i = start; i <= last; i++) {
            current.add(i);                       // 선택
            backtrack(i + 1, n, k, current, result);
            current.remove(current.size() - 1);   // 선택 취소
        }
    }
}
