import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static int []X= {-1,1,0,0};
    static int []Y= {0,0,-1,1};
    static int [][]map;
    static ArrayList<Integer> result = new ArrayList<>();
    static boolean [][]visited;
    static int N,cnt;


    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        map=new int[N][N];
        visited=new boolean[N][N];
        for (int i = 0; i < N; i++) {
            String str = br.readLine();
            for (int j = 0; j < N; j++) {
                map[i][j]=str.charAt(j)-48;
            }
        }
        int sumCnt=0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if(!visited[i][j] && map[i][j]==1) {
                    sumCnt++;
                    cnt=0;
                    bfs(i,j);
                }
            }
        }
        Collections.sort(result);
        StringBuilder sb = new StringBuilder();
        sb.append(sumCnt).append("\n");
        for (int i : result) {
            sb.append(i).append("\n");
        }
        System.out.println(sb);
    }

    private static void bfs(int x,int y) {
        Queue<Node> q = new LinkedList<>();
        q.add(new Node(x,y));
        cnt++;
        visited[x][y]=true;
        while (!q.isEmpty()) {
            Node n = q.poll();
            for (int i = 0; i < 4; i++) {
                int nX = n.x + X[i];
                int nY = n.y + Y[i];

                if(nX < 0 || nX >= N || nY < 0 || nY >= N ) continue;
                if( visited[nX][nY] || map[nX][nY] == 0) continue;
                cnt++;
                visited[nX][nY]=true;
                q.offer(new Node(nX, nY));
            }
        }
        result.add(cnt);
    }

    static class Node{
        int x,y;
        Node(int x,int y){
            this.x=x;
            this.y=y;
        }
    }


}
