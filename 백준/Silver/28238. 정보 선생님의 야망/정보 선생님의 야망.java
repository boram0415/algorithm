import java.util.*;
import java.io.*;
public class Main {
    static StringTokenizer st;
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());

        int arr[][] = new int[n][5];
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 5; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int cnt = 0, tmp = -1 ;
        int[] result = new int[5];
        for (int a = 0; a < 4; a++) {
            for (int b = a+1; b < 5; b++) {
                for (int c = 0; c < n; c++) {
                    if (arr[c][a] == 1 && arr[c][b] == 1) {
                        cnt++;
                    }
                }
                if (tmp < cnt) {
                    tmp = cnt;
                    result = new int[5];
                    result[a] = 1;
                    result[b] = 1;
                }
                cnt=0;
            }
        }
        
        sb.append(tmp).append("\n");
        for (int i : result) {
            sb.append(i).append(" ");
        }
        System.out.println(sb);
    }
}