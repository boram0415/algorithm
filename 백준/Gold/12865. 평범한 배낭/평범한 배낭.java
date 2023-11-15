import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] inputs = br.readLine().split(" ");

        int N = Integer.parseInt(inputs[0]);
        int K = Integer.parseInt(inputs[1]);

        int[][] item = new int[N + 1][2];  // weight, value

        for (int i = 1; i <= N; i++) {
            inputs = br.readLine().split(" ");
            item[i][0] = Integer.parseInt(inputs[0]);
            item[i][1] = Integer.parseInt(inputs[1]);
        }

        int[][] dp = new int[N + 1][K + 1];

        for (int w = 1; w <= N; w++) { // 무게
            for (int i = 1; i <= K; i++) { // item
                dp[w][i] = dp[w-1][i];
                if (i - item[w][0] >= 0) {
                    // 현재위치 = max(이전 행의 가치, (현재 행의 가치 + 전행 가치) )
                    dp[w][i] = Math.max(dp[w][i], item[w][1] + dp[w-1][i-item[w][0]]);
                }
            }
        }
        System.out.println(dp[N][K]);
    }
}