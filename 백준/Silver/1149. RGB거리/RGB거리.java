public class Main {
    public static void main(String[] args) throws Exception {
        int n = read();
        int[][] dp = new int[n + 1][3];

        for (int i = 1; i <= n; i++) {
            int r = read(),g=read(),b=read();
            dp[i][0] = Math.min(dp[i - 1][1], dp[i - 1][2]) + r;
            dp[i][1] = Math.min(dp[i - 1][0], dp[i - 1][2]) + g;
            dp[i][2] = Math.min(dp[i - 1][0], dp[i - 1][1]) + b;
        }
        System.out.println(Math.min(dp[n][0], Math.min(dp[n][1], dp[n][2])));
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