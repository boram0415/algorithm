import java.util.*;

public class Main {
    static ArrayList<Integer>[] A;
    static boolean visited[];
    static int cnt;

    public static void main(String[] args) throws Exception {
        int N = read();
        int M = read();
        A = new ArrayList[N+1];
        for (int i = 1; i <=N; i++) {
            A[i] = new ArrayList<>();
        }
        for (int i = 0; i < M; i++) {
            int u = read();
            int v = read();
            A[u].add(v);
            A[v].add(u);
        }
        visited = new boolean[N+1];
        for (int i = 1; i <visited.length; i++) {
            if(!visited[i]) {
                cnt++;
                dfs(i);
            }
        }
        System.out.println(cnt);
    }

    private static void dfs(int node) {
        for (int i : A[node]) {
            if(!visited[i]){
                visited[i] = true;
                dfs(i);
            }
        }
    }
    private static int read() throws Exception {
        int c, n = 0;
        while (true) {
            c = System.in.read() - 48;
            if (c < 0 || c > 9) return n;
            n = n * 10 + c;
        }
    }
}