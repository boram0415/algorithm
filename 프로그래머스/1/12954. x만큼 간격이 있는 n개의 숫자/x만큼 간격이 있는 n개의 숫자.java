import java.util.*;

class Solution {
    public static long[] solution(int x, int n) {
        long sum=0;
        List<Long> list=new ArrayList<>();
        for (int i = 0; i < n; i++) {
            sum +=x;
            list.add(sum);
        }
        return list.stream().mapToLong(i->i).toArray();
    }
}