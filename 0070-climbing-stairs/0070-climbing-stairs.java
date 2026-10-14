class Solution {
    public int climbStairs(int n) {
        // n이 1 또는 2인 경우
        if (n <= 2) return n;

        // 직전 두 계단까지 가는 방법의 수
        int prev2 = 1;
        int prev1 = 2;

        for (int i = 3; i <= n; i++) {
            // 현재 계단 = 1칸 전 + 2칸 전
            int current = prev1 + prev2;
            prev2 = prev1;
            prev1 = current;
        }

        return prev1;
    }
}
