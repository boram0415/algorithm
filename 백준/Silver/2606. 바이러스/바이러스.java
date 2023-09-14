import java.io.*;
import java.util.*;

class Main{
    static boolean visited[];
    static ArrayList<Integer> graph[] ;
    static int cnt;
    
    static int read() throws IOException{
        int c=0, n=0;
        while(true){
            c = System.in.read()-48;
            if(c < 0 || c > 9) return n ;
            n = n * 10 + c;
        }
    }
   
    public static void main(String[]args) throws IOException{
        
        int N = read();
        int M = read();
        
        graph = new ArrayList[N+1];
        visited = new boolean[N+1];
        
        for(int i=1;i<=N;i++) graph[i] = new ArrayList<>();
        
        for(int i=0;i<M;i++){
            int p = read();
            int c = read();
            graph[p].add(c);
            graph[c].add(p);
        }
        dfs(1);
        System.out.print(cnt);
    }
    
    static void dfs(int verTex){
        visited[verTex] = true;
        for(int node : graph[verTex]){
            if(!visited[node]) {
                cnt++;
                dfs(node);
            }
        }
        
    }
}