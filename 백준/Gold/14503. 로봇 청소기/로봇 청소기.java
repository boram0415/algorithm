import java.util.Arrays;

class Main{
    static int N , M , r,c,d;
    static int[][] graph ;
    static int cnt=1;

    // 남 > 동 > 북 > 서
    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, 1, 0, -1};

    public static void main(String[] args) throws Exception{
        N = read();
        M = read();
        r = read();
        c = read();
        d = read();
        graph = new int[N][M];
        // 초기화
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                graph[i][j]=read();
            }
        }
        dfs(r, c, d);
        System.out.println(cnt);
    }

    private static void dfs(int r, int c, int d) {
        // 청소 된 곳 표시
        graph[r][c] = -1;
        // 시계 반대 방향 진행
        for (int i = 0; i < 4; i++) {
            d = (d+3)%4;
             int x = r + dx[d];
            int y = c + dy[d];
            if (graph[x][y] == 0) {
                cnt++;
                dfs(x, y, d);
                return;
            }
        }
        // 후진 = 바라보는 쪽의 반대 뱡향으로 이동
        int pwd = (d+2)%4;
        int x = r + dx[pwd];
        int y = c + dy[pwd];
        // 뒤로 후진할 곳이 1이 아니면
        if (graph[x][y] != 1) dfs(x, y, d);

    }

    static int read() throws Exception{
        int c=0,n=0;
        while (true) {
            c = System.in.read()-48;
            if(c < 0 || c > 9 ) return n ;
            n=n*10+c;
        }
    }
}