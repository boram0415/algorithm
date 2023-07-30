import java.util.*;

public class Main {

    static boolean flag;
    static boolean visited[];
    static ArrayList<Integer> a[];
    static int result = 0;
    static int node1, node2;

    public static void main(String[] args) throws Exception {
        int n = read();
        a = new ArrayList[n + 1];
        visited = new boolean[n + 1];
        node1 = read();
        node2 = read();
        int in = read();

        for (int i = 1; i <= n; i++) {
            a[i] = new ArrayList();
        }
        for (int i = 0; i < in; i++) {
            int p = read();
            int c = read();
            a[p].add(c);
            a[c].add(p);
        }
        visited[node1]=true;
        dfs(node1,0);
        System.out.println(flag ? result : -1);
    }

    private static void dfs(int node,int count) {
        visited[node]=true;
        if(node== node2) {
            result = count;
            flag=true;
        }

        for (int i : a[node]) {
            if(!visited[i]){
                visited[i]=true;
                dfs(i,count+1);
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