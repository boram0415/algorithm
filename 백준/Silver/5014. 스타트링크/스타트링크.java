import java.io.IOException;
import java.util.*;

class Main{

    public static void main(String[]args) throws Exception{

        Queue<Integer> graph = new LinkedList<>();
        int F=read(),S=read(),G=read(),U=read(),D=read();
        int visited []= new int[F+1];
        int cnt=0;

        // BFS
        graph.offer(S);
        visited[S] = 1;

        while(!graph.isEmpty()){
            cnt++;
            int size = graph.size();
            for(int i=0;i<size;i++){
                int node = graph.poll();
                // S==G
                if(node == G) {
                    System.out.print(cnt-1);
                    return;
                }
                // U
                if(node+U <= F && visited[node+U] == 0){
                    graph.offer(node+U);
                    visited[node+U]=1;
                }
                // D
                if(node-D > 0 && visited[node-D] == 0){
                    graph.offer(node-D);
                    visited[node-D]=1;
                }

            }
        }
        System.out.print("use the stairs");

    }

    public static int read() throws IOException {
        int c=0,n=0;
        while(true){
            c = System.in.read()-48;
            if(c < 0 || c > 9) return n;
            n = 10 * n + c;
        }

    }


}