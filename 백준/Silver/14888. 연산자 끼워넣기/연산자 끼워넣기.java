public class Main {

    static int[] nums;
    static int[] opt = new int[4];
    static int N;
    static int MAX = Integer.MIN_VALUE;
    static int MIN = Integer.MAX_VALUE;


    public static void main(String[] args) throws Exception {

        N = read();
        nums = new int[N];
        for (int i = 0; i < N; i++) nums[i] = read();
        for (int i = 0; i < 4; i++) opt[i]=read();

        rec(nums[0], 1);
        System.out.println(MAX);
        System.out.println(MIN);
    }

    private static void rec(int num, int depth) {

        if (depth == N ) {
            MAX = Math.max(num, MAX);
            MIN = Math.min(num, MIN);
            return ;
        }

        for (int i = 0; i < 4; i++) {
            if (opt[i] > 0) {
                opt[i]--;
                switch (i) {
                    case 0:	rec(num + nums[depth], depth + 1);	break;
                    case 1:	rec(num - nums[depth], depth + 1);	break;
                    case 2:	rec(num * nums[depth], depth + 1);	break;
                    case 3:	rec(num / nums[depth], depth + 1);	break;
                }
                opt[i]++;
            }
        }
    }

    static int read() throws Exception {
        int c, n = 0;
        while (true) {
            c = System.in.read() - 48;
            if (c > 9 || c < 0) return n;
            n = n * 10 + c;
        }
    }
}