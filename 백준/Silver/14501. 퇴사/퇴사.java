import java.util.Arrays;

class Main {

    public static void main(String args[]) throws Exception {

        int N = read();
        int arr[][] = new int[N][2];
        for (int i = 0; i < N; i++) {
            for (int y = 0; y < 2; y++) {
                arr[i][y] = read();
            }
        }

        int[] dp = new int[N + 1];
        for (int i = 0; i < N; i++) {
            // t=상담일수 , p=돈
            int t = arr[i][0] , p = arr[i][1];

            if(i+t <= N) dp[i+t] = Math.max(dp[i+t], dp[i]+p);
            // 비어있는 날 돈 채우기
            dp[i+1] = Math.max(dp[i+1], dp[i]);
        }
        System.out.println(dp[N]);
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
