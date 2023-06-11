import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        int cnt=0;
        boolean prime[] = new boolean[N+1];
        for (int i = 2; i <= N; i++) {
            for (int j = i; j <= N; j += i) {
                if (!prime[j]) {
                   cnt++;
                    if (cnt == K) {
                        System.out.println(j);
                        return;
                    }
                }
                prime[j] = true;
            }
        }
    }
}