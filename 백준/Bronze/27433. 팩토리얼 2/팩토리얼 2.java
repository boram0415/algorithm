public class Main {
    private static int read() throws Exception {
        int c, n = 0;
        while (true) {
            c = System.in.read() - 48;
            if (c < 0 || c > 9) return n;
            n = n * 10 + c;
        }
    }

    private static long rec(int n) {
        if (n <= 1) return 1;
        return n * rec(n-1);
    }

    public static void main(String[] args) throws Exception {
        System.out.println(rec(read()));
    }
}
