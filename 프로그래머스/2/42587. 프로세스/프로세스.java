import java.util.*;

class Solution {
    public int solution(int[] priorities, int location) {
        int answer = 0;

        
        Queue<int[]> queue = new LinkedList<>();
        for (int i = 0; i < priorities.length; i++) {
            queue.offer(new int[]{i, priorities[i]});
        }

        
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        for (int p : priorities) {
            maxHeap.offer(p);
        }

        while (!queue.isEmpty()) {
            int[] current = queue.poll();

            // 현재 큐에 남아있는 것 중 더 높은 우선순위가 있으면 뒤로 보냄
            if (current[1] < maxHeap.peek()) {
                queue.offer(current);
            } else {
                // 실행
                maxHeap.poll();
                answer++;
                // 내가 찾던 프로세스라면 종료
                if (current[0] == location) {
                    return answer;
                }
            }
        }

        return answer;
    }
}
