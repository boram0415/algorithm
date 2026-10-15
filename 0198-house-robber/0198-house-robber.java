class Solution {
    public int rob(int[] nums) {
        // prev2: 두 칸 전까지의 최대 금액
        // prev1: 한 칸 전까지의 최대 금액
        int prev2 = 0;
        int prev1 = 0;

        for (int money : nums) {
            // 현재 집을 털거나, 털지 않는 경우 중 최댓값
            int current = Math.max(prev2 + money, prev1);

            prev2 = prev1;
            prev1 = current;
        }

        return prev1;
    }
}
