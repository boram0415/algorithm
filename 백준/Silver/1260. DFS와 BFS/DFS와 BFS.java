import java.io.*;
import java.util.*;

public class Main {
    static boolean visited[];
    static ArrayList<Integer> A[];
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int V = Integer.parseInt(st.nextToken());
        A = new ArrayList[N+1];
        visited = new boolean[N+1];
        // 리스트 초기화
        for (int i =1; i <=N; i++) {
            A[i] = new ArrayList<>();
        }
//        System.out.println(Arrays.toString(A));
        // 값 세팅
        for (int i = 0; i <M; i++) {
            st = new StringTokenizer(br.readLine());
            int p = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());
            A[p].add(c);
            A[c].add(p);
        }
//        System.out.println(Arrays.toString(A));
        // 정렬
        for (int i = 1; i <=N; i++) {
            Collections.sort(A[i]);
        }
//        System.out.println(Arrays.toString(A));
        dfs(V);
        System.out.println();
        visited = new boolean[N+1];
        bfs(V);
    }
    // queue 구현
    private static void bfs(int node) {
        Queue<Integer> q = new LinkedList<>();
        q.add(node);
        visited[node] = true;
        while (!q.isEmpty()) {
            int newNode=q.poll();
            System.out.print(newNode+" ");
            for (int i : A[newNode]) {
                if (!visited[i]) {
                    visited[i] = true;
                    q.add(i);
                }
            }
        }
    }
    // 재귀 구현
    private static void dfs(int node) {
        System.out.print(node+" ");
        visited[node] = true;
        for (int i : A[node]) {
            if(!visited[i]) dfs(i);
        }
    }
}
