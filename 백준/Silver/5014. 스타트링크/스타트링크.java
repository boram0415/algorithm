import java.io.*;
import java.util.*;

class Main{
    public static void main(String[]args) throws Exception{
        int F =read(),S=read(),G=read(),U=read(),D=read();
        boolean visited[] = new boolean[F+1];
        int cnt=-1;
        //BFS
        Queue<Integer> q = new LinkedList<>();
        visited[S] = true;
        q.offer(S);
        while(!q.isEmpty()){
            int size = q.size();
            cnt++;
            for(int i=0;i<size;i++){
                int node = q.poll();
                // G
                if(node == G) {
                    System.out.print(cnt);
                    return;
                }
                // U
                if(node+U <= F && !visited[node+U]){
                    visited[node+U] = true;
                    q.offer(node+U);
                }
                // D
                  if(node-D > 0 && !visited[node-D]){
                    visited[node-D] = true;
                    q.offer(node-D);
                }
            }
            
        }
        System.out.print("use the stairs");
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
