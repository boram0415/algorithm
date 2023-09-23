import java.io.IOException;
import java.util.*;

class Main{
    public static void main(String[] args ) throws Exception{
        int N = read(),M=read();
        Queue<Integer> q = new LinkedList<>();
        int MAX = N > M ? N : M;
        boolean visited[] = new boolean[MAX*2+1];
        int cnt=0;
        q.offer(N);
        visited[N]= true;
        while(!q.isEmpty()){
            int size = q.size();
            cnt++;
            for(int i=0;i<size; i++){
                int node = q.poll();
                // n == M
                if(node==M){
                    System.out.print(cnt-1);
                    return;
                }
                // -1
                if(node-1 >= 0 && !visited[node-1]){
                    visited[node-1] = true;
                    q.offer(node-1);
                }
                // +1
                if(node+1 <= M*2 && !visited[node+1]){
                    visited[node+1] = true;
                    q.offer(node+1);
                }
                // *2
                if(node*2 <= M*2 && !visited[node*2]){
                    visited[node*2] = true;
                    q.offer(node*2);
                }
            }
        }
    }

    static int read() throws IOException {
        int c=0,n=0;
        while(true){
            c = System.in.read()-48;
            if(c < 0 || c > 9 ) return n ;
            n = n*10+c;
        }
    }

}