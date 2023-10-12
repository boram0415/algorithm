import java.io.*;
import java.util.Arrays;

public class Main {

    static int[][] items;
    static int[][] dp;

    public static void main(String[] args) throws IOException {

        int N = read();
        int K = read();

        items = new int[N + 1][2];
        dp = new int[N + 1][K + 1];

        for (int i = 1; i <= N; i++) {
            items[i][0] = read();
            items[i][1] = read();
        }
        for (int k = 1; k <= K; k++) {
            for (int n = 1; n <= N; n++) {
                dp[n][k] = dp[n-1][k];
                if (k-items[n][0] >= 0) {
                    dp[n][k] = Math.max(dp[n-1][k], items[n][1] + dp[n-1][k-items[n][0]]);
                }
            }
        }
        System.out.println(dp[N][K]);
    }
    
        public static int read() throws IOException {
        int c = 0, n = 0;
        while (true) {
            c = System.in.read() - 48;
            if (c < 0 || c > 9) return n;
            n = n * 10 + c;
        }
    }
}
