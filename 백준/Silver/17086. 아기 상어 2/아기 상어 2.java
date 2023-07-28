import java.io.*;
import java.util.*;

public class Main {
    static int[][] arr;
    static int cnt=-1;
    static int[] disX = {-1, 1, 0, 0, -1, -1, 1, 1};
    static int[] disY = {0, 0, -1, 1, -1, 1, -1, 1};
    static int[][] sum;
    static Queue<int[]> q = new LinkedList<>();
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        arr = new int[N][M];
        sum = new int[N][M];

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < M; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if(arr[i][j] == 1) {
                    q.add(new int[]{i, j});
                }
            }
        }

        while (!q.isEmpty()) {
            int[] n = q.poll();
            for (int i = 0; i < 8; i++) {
                
                int nX = n[0] + disX[i];
                int nY = n[1] + disY[i];
                
                // 인덱스 범위를 초과 시
                if (nX < 0 || nX >= N || nY < 0 || nY >= M) continue;
                if(sum[nX][nY]!=0 || arr[nX][nY]==1)continue;
                
                sum[nX][nY] = sum[n[0]][n[1]]+1;
                q.offer(new int[]{nX, nY});
                cnt = Integer.max(cnt, sum[nX][nY]);
            }
        }
        System.out.println(cnt);
    }


}