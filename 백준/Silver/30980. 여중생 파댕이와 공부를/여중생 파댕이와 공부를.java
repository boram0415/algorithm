import java.io.*;
import java.util.*;

public class Main {
    static final int HEIGHT = 3;
    static final int WIDTH = 8;
    static char [][] strArr ;
    static StringBuilder sb = new StringBuilder(50);

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken()) * HEIGHT;
        int M = Integer.parseInt(st.nextToken()) * WIDTH;

        strArr = new char[N][M];

        for (int i = 0; i < N; ++i) {
            strArr[i] = br.readLine().toCharArray();
        }
        
        for (int i = 0; i < N; i += HEIGHT) {
            for (int j = 0; j < M; j += WIDTH) {

                int a = strArr[i + 1][j + 1] - '0';
                int b = strArr[i + 1][j + 3] - '0';
                int c = strArr[i + 1][j + 5] - '0';

                // 합이 2자리 수 일 경우
                if (strArr[i + 1][j + 6] != '.') {
                    c = c * 10 + strArr[i + 1][j + 6] - '0';
                }

                if (a + b == c) {
                    int len = c >= 10 ? 7 : 6;
                    strArr[i + 1][j] = strArr[i + 1][j + len] = '*';

                    for (int k = 1; k < len; ++k) {
                        strArr[i][j + k] = strArr[i + 2][j + k] = '*';
                    }
                } else {
                    for (int k = 0; k < 3; ++k) {
                        strArr[i + k][j + 3 - k] = '/';
                    }
                }
            }
        }

        for (char[] row : strArr) {
            sb.append(row).append('\n');
        }

        System.out.print(sb);
    }
}