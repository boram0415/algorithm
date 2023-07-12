import java.io.*;
import java.util.*;

public class Main {
    static boolean visited[];
    static int N;
    static ArrayList<Integer> A[];
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws Exception{
        N = read();
        int M = read();
        int V = read();
        A = new ArrayList[N+1];
        visited = new boolean[N+1];
        
        for (int i =1; i <=N; i++) {
            A[i] = new ArrayList<>();
        }
        for (int i = 0; i <M; i++) {
            int p =  read();
            int c =  read();
            A[p].add(c);
            A[c].add(p);
        }
        for (int i = 1; i <=N; i++) {
            Collections.sort(A[i]);
        }
        dfs(V);
        sb.append("\n");
        bfs(V);
        System.out.println(sb);
    }
    private static void bfs(int node) {
        Queue<Integer> q = new LinkedList<>();
        q.add(node);
        visited = new boolean[N+1];
        visited[node] = true;
        while (!q.isEmpty()) {
            int newNode=q.poll();
            sb.append(newNode).append(" ");
            for (int i : A[newNode]) {
                if (!visited[i]) {
                    visited[i] = true;
                    q.add(i);
                }
            }
        }
    }
    private static void dfs(int node) {
        sb.append(node).append(" ");
        visited[node] = true;
        for (int i : A[node]) {
            if(!visited[i]) dfs(i);
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
