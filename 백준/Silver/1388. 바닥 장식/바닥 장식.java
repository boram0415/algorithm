import java.io.*;
import java.util.*;

class Main {
    static char graph[][];
    static boolean visited[][];
    static int cnt, N, M;
    static char flag;

    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        graph = new char[N][M];
        visited = new boolean[N][M];

        for (int i = 0; i < N; i++) {
            graph[i] = br.readLine().toCharArray();
        }
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (!visited[i][j]) {
                    dfs(graph[i][j], i, j);
                    cnt++;
                }
            }

        }
        System.out.println(cnt);

    }

    static void dfs(char node, int x, int y) {
        if (x <= -1 || x >= N || y <= -1 || y >= M || visited[x][y] || node != graph[x][y]) return;
        visited[x][y] = true;
        if (node == '-') {
            dfs(graph[x][y], x, y + 1);
            flag ='-';
        }
        if (node == '|') {
            dfs(graph[x][y], x + 1, y);
            flag ='|';
        }

    }
}