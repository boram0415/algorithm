import java.util.*;
class Solution {
    static int N = 100;
   public int[] solution(int[] progresses, int[] speeds) {
       List<Integer> list = new ArrayList<>();
        list.add(1);
        int tmp = 0, max = -1;
        for (int i = 0; i < progresses.length - 1; i++) {
            // 나눠지지 않을 경우 +1day
            int a = (int) Math.ceil((N - progresses[i]) / (double) speeds[i]);
            int b = (int) Math.ceil((N - progresses[i + 1]) / (double) speeds[i + 1]);
            // 앞에 있는 작업 소요 시간이 이후 오는 모든 작업의 소요시간보다 크면 같이 배포함
            max = Math.max(a, max);
            if (max >= b) {
                list.set(tmp, list.get(tmp) + 1);
                continue;
            }
            list.add(1);
            tmp++;
        }
        return list.stream().mapToInt(i -> i).toArray();
    }
}