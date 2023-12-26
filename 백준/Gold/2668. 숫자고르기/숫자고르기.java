import java.util.*;

public class Main {

    static int N;
    static int[] arr;
    static boolean[] visited;
    static TreeSet<Integer> map = new TreeSet();

    public static void main(String[] args) throws Exception {

        N = read();
        arr = new int[N+1];
        for(int i=1; i<=N; i++) arr[i] = read();

        visited = new boolean[N+1];

        for(int i=1; i<=N; i++) {
            visited = new boolean[N+1];
            dfs(i, i);
        }
        
        System.out.println(map.size());
        Iterator i = map.iterator();
        while (i.hasNext()) System.out.println(i.next());

    }
    
    
    static void dfs(int start, int node) {
        if(!visited[arr[start]]) {
            visited[arr[start]] = true;
            dfs(arr[start], node);
        }
        // 2번 연결 된 숫자 확인
        if(arr[start] == node) {
            map.add(node);
        }
    }

    static int read() throws Exception {
        int n = 0;
        boolean isNegative = false;
        while (true) {
            int input = System.in.read();
            if (input <= 32)
                return isNegative ? n * -1 : n;
            else if (input == '-')
                isNegative = true;
            else
                n = (n << 3) + (n << 1) + (input & 15);
        }
    }
}