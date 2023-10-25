import java.io.*;
import java.util.*;

class Main {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String args[]) throws Exception {
        StringBuilder sb = new StringBuilder(16);
        int N = read();
        int arr[] = new int[N + 1];
        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 1; i <= N; i++) arr[i] = arr[i - 1] + Integer.parseInt(st.nextToken());

        int M = read();
        while (M-- > 0) {
            st = new StringTokenizer(br.readLine());
            int pri = Integer.parseInt(st.nextToken());
            int aft = Integer.parseInt(st.nextToken());
            sb.append(arr[aft] - arr[pri-1]).append("\n");
        }
        System.out.print(sb);
    }

    static int read() throws IOException {
        return Integer.parseInt(br.readLine());
    }


}