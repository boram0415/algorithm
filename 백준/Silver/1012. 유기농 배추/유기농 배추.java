import java.io.IOException;
import java.util.*;

class Main {

    static int T, n, m, k;
    static boolean visited[][];
    static int graph[][];
    static int cnt;

    public static void main(String[] args) throws Exception {
        StringBuilder sb = new StringBuilder(16);
        T = read();

        while (T-- > 0) {
            cnt=0;
            n = read();
            m = read();
            k = read();
            graph = new int[m][n];
            visited = new boolean[m][n];
            //값 초기화
            for (int i = 1; i <= k; i++) {
                int y = read(), x = read();
                graph[x][y] = 1;
            }
            //배추 확인
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    if (!visited[i][j] && graph[i][j] == 1) {
                        dfs(i, j);
                        cnt++;
                    }
                }
            }
            sb.append(cnt).append("\n");
        } // while end
        System.out.println(sb);
    }

    private static void dfs(int x, int y) {
        // 유효성 체크
        if(validCheck(x,y)) return;
        visited[x][y]=true;
        dfs(x,y+1);
        dfs(x,y-1);
        dfs(x+1,y);
        dfs(x-1,y);
    }

    private static boolean validCheck(int x,int y){
        return x < 0 || x >= m || y < 0 || y >= n || visited[x][y] || graph[x][y]==0;
    }

    private static int read() throws IOException {
        int n, c;
        boolean neg = false;
        do {
            n = System.in.read();
            if (n == 45)
                neg = true;
        } while (n <= 45);
        n &= 15;
        while ((c = System.in.read()) > 45) {
            n = (n << 3) + (n << 1) + (c & 15);
        }
        return neg ? -n : n;
    }

}