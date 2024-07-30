import java.util.PriorityQueue;

class Solution {
    public int solution(int[] scoville, int K) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int s : scoville) {
            pq.add(s);
        }
        
        int count = 0;
        while (pq.size() > 1 && pq.peek() < K) {
            int leastSpicy = pq.poll();
            int secondLeastSpicy = pq.poll();
            
            int mixedSpice = leastSpicy + (secondLeastSpicy * 2);
            pq.add(mixedSpice);
            count++;
        }
        
        if (pq.peek() >= K) {
            return count;
        } else {
            return -1;
        }
    }
}