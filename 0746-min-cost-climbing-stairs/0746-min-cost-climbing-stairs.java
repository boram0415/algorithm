class Solution {
    public int minCostClimbingStairs(int[] cost) {
        // prev2: 두 칸 전까지 도착하는 최소 비용
        // prev1: 한 칸 전까지 도착하는 최소 비용
        int prev2 = 0;
        int prev1 = 0;

        // cost.length는 마지막 계단 다음인 꼭대기
        for (int i = 2; i <= cost.length; i++) {
            // 1칸 전과 2칸 전에서 오는 비용 중 최솟값
            int current = Math.min(
                prev1 + cost[i - 1],
                prev2 + cost[i - 2]
            );

            prev2 = prev1;
            prev1 = current;
        }

        return prev1;
    }
}
