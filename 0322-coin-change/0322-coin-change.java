class Solution {
    public int coinChange(int[] coins, int amount) {
        // dp[i] = 금액 i를 만드는 데 필요한 최소 동전 개수
        int[] dp = new int[amount + 1];

        // 만들 수 없는 상태를 amount + 1로 초기화
        java.util.Arrays.fill(dp, amount + 1);
        dp[0] = 0; // 금액 0은 동전이 필요 없음

        for (int i = 1; i <= amount; i++) {
            for (int coin : coins) {
                if (coin <= i) {
                    dp[i] = Math.min(dp[i], dp[i - coin] + 1);
                }
            }
        }

        // 만들 수 없으면 -1 반환
        return dp[amount] > amount ? -1 : dp[amount];
    }
}
