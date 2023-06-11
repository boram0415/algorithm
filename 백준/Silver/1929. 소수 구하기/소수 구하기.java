import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        boolean prime[] = new boolean[K+1];
        prime[0] = prime [1] = true;
        for (int i = 2; i*i <= K; i++) {
            for (int j = i*i; j <= K; j+=i) {
                prime[j] = true;
            }
        }
        for (int t = N; t <= K; t++) {
            if (!prime[t]) sb.append(t).append("\n");
        }
        System.out.print(sb);
    }
}