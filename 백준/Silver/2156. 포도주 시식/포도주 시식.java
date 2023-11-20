public class Main {
    public static void main(String[] args) throws Exception{

        int n = read();
        int[] arr = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            arr[i] = read();
        }
        int[] dp = new int[n + 1];

        dp[1] = arr[1];
        if (n > 1) {
            dp[2] = arr[1] + arr[2];
        }

        for (int i = 3; i <= n; i++) {
            int temp1 = dp[i - 2] + arr[i];
            int temp2 = dp[i - 3] + arr[i - 1] + arr[i];

            dp[i] = Math.max(dp[i - 1], Math.max(temp1, temp2));
        }
        System.out.println(dp[n]);
    }
    static int read() throws Exception {
        int c = 0, n = 0;
        while (true) {
            c = System.in.read() - 48;
            if (c < 0 || c > 9) return n;
            n = n * 10 + c;
        }
    }
}
