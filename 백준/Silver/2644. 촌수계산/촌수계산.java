import java.io.*;
import java.util.*;

public class Main {
    static int cnt;
    static ArrayList<Integer> graph[];
    static boolean visited[];
    static int y;

    public static void main(String[] args) throws Exception {
        int n = read();
        int x = read();
        y = read();
        int m = read();

        graph = new ArrayList[n + 1];
        visited = new boolean[n + 1];

        for (int i = 1; i <= n; i++) {
            graph[i] = new ArrayList<>();
        }
        for (int i = 0; i < m; i++) {
            int p = read();
            int c = read();
            graph[p].add(c);
            graph[c].add(p);
        }

        dfs(x, 0);
        System.out.print(cnt > 0 ? cnt : -1);

    }

    static void dfs(int node, int count) {
        if (node == y) {
            cnt = count;
            return;
        }

        visited[node] = true;

        for (int i : graph[node]) {
            if (!visited[i]) {
                dfs(i, count+1);
            }
        }

    }

    static int read() throws IOException {
        int c = 0, n = 0;
        while (true) {
            c = System.in.read() - 48;
            if (c < 0 || c > 9) return n;
            n = n * 10 + c;
        }
    }
}
