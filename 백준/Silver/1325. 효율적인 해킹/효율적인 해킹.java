import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    static ArrayList<Integer> A[];
    static boolean visited[];
    static int N;
    static int cnt[];

    public static void main(String[] args) throws Exception {

        N = read();
        int M = read();
        A = new ArrayList[N + 1];
        cnt = new int[N+1];

        for (int i = 1; i <= N; i++) {
            A[i] = new ArrayList<>();
        }
        for (int i = 0; i < M; i++) {
            int p = read();
            int c = read();
            A[p].add(c);
        }

        for (int i = 1; i <= N; i++) {
            visited = new boolean[N + 1];
            dfs(i);
        }
        int max=0;
        for (int i = 0; i < cnt.length; i++) {
            max = Integer.max(max, cnt[i]);
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < cnt.length; i++) {
            if(max==cnt[i]) sb.append(i).append(" ");
        }
        System.out.println(sb);


    }

    private static void dfs(int node) {
        visited[node]=true;
        for(int i : A[node]){
            if(!visited[i]) {
                cnt[i]++;
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
