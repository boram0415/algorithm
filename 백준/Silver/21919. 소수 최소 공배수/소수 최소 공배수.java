import java.util.*;

public class Main {
    static boolean[] isPrime;
    static List<Integer> list;
    static long result = 1;

    public static void main(String[] args) throws Exception {

        int N = read(),max=0;
        Set<Integer> set = new TreeSet<>();
        list = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            int n=read();
            set.add(n);
            max = Integer.max(n, max);
        }

        isPrime = new boolean[max + 1];
        isPrime [0] = isPrime[1] = true;
        int sq = (int) Math.sqrt(max);

        // 소수판별
        for (int i = 2; i <= sq; i++) {
            if (!isPrime[i]) {
                for (int j = i * i; j <= max; j += i) {
                    isPrime[j] = true;
                }
            }
        }

        // 소수 구하기
        Iterator i = set.iterator();
        while (i.hasNext()) {
            int n = (int)i.next();
            if (!isPrime[n]) {
                list.add(n);
            }
        }

        if(list.size()==0) {
            System.out.println(-1);
            return;
        }
        // 최소공배수 구하기
        System.out.println(lcm(list));
    }

    private static long lcm(List<Integer> list) {
        for (int i : list) {
            result *= i;
        }
        return result;
    }

    static int read() throws Exception {
        int c, m = 0;
        while (true) {
            c = System.in.read() - 48;
            if (c < 0 || c > 9) return m;
            m = m * 10 + c;
        }
    }
}
