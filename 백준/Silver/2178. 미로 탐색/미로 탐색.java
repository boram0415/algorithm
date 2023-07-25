import java.io.*;
import java.util.*;

public class Main {
    static int[][] arr;
    static int[][] sum;
    static int N, M;
    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        arr = new int[N][M];
        sum = new int[N][M];

        for (int i = 0; i < N; i++) {
            String str = br.readLine();
            for (int j = 0; j < M; j++) {
                arr[i][j] = str.charAt(j)-48;
            }
        }
        sum[0][0]=1;
        dfs(0, 0);
        System.out.println(sum[N - 1][M - 1]);
    }

    public static void dfs(int x, int y) {

        Queue<Node> q = new LinkedList<>();
        int disX[] = {-1, 1, 0, 0};
        int disY[] = {0, 0, -1, 1};
        Node m = new Node(x,y);
        q.offer(m);
        while (!q.isEmpty()) {
            Node n = q.poll();
            // 상하좌우 값 가져오기
            for (int i = 0; i < 4; i++) {
                int nowX = n.x + disX[i];
                int nowY = n.y + disY[i];
                // 범위를 초과하거나, 1이아닌 0이거나 , 이미 방문했으면
                if (nowX < 0 || nowX >= N || nowY < 0 || nowY >= M || arr[nowX][nowY] == 0 || sum[nowX][nowY] != 0) {
                    continue;
                }
                sum[nowX][nowY] = sum[n.x][n.y]+1;
                q.offer(new Node(nowX,nowY));
            }
        }

    }

    static class Node {
        int x, y;

        Node(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
}

