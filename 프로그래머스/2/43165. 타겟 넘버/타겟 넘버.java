class Solution {
    public int solution(int[] numbers, int target) {
        return dfs(numbers, target, 0, 0);
    }
    
    private int dfs(int[] numbers, int target, int index, int sum) {
        // 모든 숫자를 다 사용한 경우
        if (index == numbers.length) {
            return sum == target ? 1 : 0;
        }
        
        // 현재 숫자를 더하는 경우 + 빼는 경우
        return dfs(numbers, target, index + 1, sum + numbers[index])
             + dfs(numbers, target, index + 1, sum - numbers[index]);
    }
}
