public class Main {
    static long result = 1;

    private static int read() throws Exception {
        int c, n = 0;
        while (true) {
            c = System.in.read() - 48;
            if (c < 0 || c > 9) return n;
            n = n * 10 + c;
        }
    }

    private static long rec(int n) {
        if (n == 1) return result;
        result*=n;
        n-=1;
        return rec(n);
    }

    public static void main(String[] args) throws Exception {
        int N = read();
        if(N == 0) {
            System.out.println(1);
            return;
        }
        System.out.println(rec(N));
    }
}
