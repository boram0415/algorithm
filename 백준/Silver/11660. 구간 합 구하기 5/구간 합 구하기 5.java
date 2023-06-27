import java.io.*;
import java.util.*;
class Main {
    static StringTokenizer st;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[][] arr = new int[N][N + 1];

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 1; j < N+1; j++) {
                arr[i][j] = arr[i][j-1] + Integer.parseInt(st.nextToken());
            }
        }
        StringBuilder sb = new StringBuilder();
        int sum=0;
        while (M-- > 0) {
            st = new StringTokenizer(br.readLine());
            int x1 = Integer.parseInt(st.nextToken())-1, x2 = Integer.parseInt(st.nextToken()),
                    y1 = Integer.parseInt(st.nextToken())-1, y2 = Integer.parseInt(st.nextToken());
            for (int i = x1; i <= y1; i++) {
                sum += arr[i][y2]-arr[i][x2-1] ;
            }
            sb.append(sum).append("\n");
            sum=0;
        }
        System.out.print(sb);

    }
}
