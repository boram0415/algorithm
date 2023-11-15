public class Main {
    public static void main(String[] args) throws Exception {
        int N = read();
        int K = read();
        int[][] item = new int[N + 1][2];
        int[][] dp = new int[N + 1][K + 1];

        for (int i = 1; i <= N; i++) {
            item[i][0] = read();
            item[i][1] = read();
        }

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
    static int read()throws Exception{
        int c=0,n=0;
        while(true){
            c=System.in.read()-48;
            if(c < 0 || c  > 9) return n;
            n=n*10+c;
        }
    }
}