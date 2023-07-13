import java.util.ArrayList;
import java.util.Collections;

public class Main {

    static ArrayList<Integer> A[];
    static boolean visited[];
    static int N;
    static int cnt;

    public static void main(String[] args) throws Exception {

        N = read();
        int M = read();

        A = new ArrayList[N+1];
        for (int i = 0; i <= N; i++) {
            A[i] = new ArrayList<>();
        }

        for (int i = 0; i < M; i++) {
            int p = read();
            int c = read();
            A[p].add(c);
            A[c].add(p);
        }
        for (int i = 1; i <=N; i++) {
            Collections.sort(A[i]);
        }
        visited = new boolean[N + 1];
        dfs(1);
        System.out.println(cnt);
    }


    private static void dfs(int v) {
        visited[v] = true;
        for (int i : A[v]) {
            if (!visited[i]) {
                cnt++;
                dfs(i);
            }
        }
    }

    static int read() throws Exception {
        int c, n = 0;
        while (true) {
            c = System.in.read() - 48;
            if (c < 0 || c > 9) return n;
            n = n * 10 + c;
        }
    }


}
