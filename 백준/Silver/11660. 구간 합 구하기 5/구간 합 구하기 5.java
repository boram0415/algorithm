import java.io.*;
import java.util.*;

class Main {

    public static void main(String[] args) throws Exception {
        StringBuilder sb = new StringBuilder();
        int N = read();
        int M = read();
        int[][] arr = new int[N][N + 1];

        for (int i = 0; i < N; i++) {
            for (int j = 1; j < N + 1; j++) {
                arr[i][j] = arr[i][j - 1] + read();
            }
        }
        
        int sum = 0;
        while (M-- > 0) {
            int x1 = read() - 1, x2 = read(), y1 = read() - 1, y2 = read();
            for (int i = x1; i <= y1; i++) {
                sum += arr[i][y2] - arr[i][x2 - 1];
            }
            sb.append(sum).append("\n");
            sum = 0;
        }
        System.out.print(sb);

    }

    static int read() throws Exception {
        int c = 0, n = 0;
        while (true) {
            c = System.in.read() - 48;
            if (c < 0 || c > 9) return n;
            n = n * 10 + c;
        }
    }
}