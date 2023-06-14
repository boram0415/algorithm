import java.io.*;
import java.util.*;
class Main {
    final static int N = 1000000;
    final static int P = 78498;
    static boolean[] isPrime = new boolean[N + 1];
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int t = Integer.parseInt(br.readLine());

        isPrime[0] = isPrime[1] = true;

        for (int i = 2; i <= (int) Math.sqrt(N); i++) {
            for (int j = i*i; j <= N; j += i) {
                if (!isPrime[j]) isPrime[j] = true;
            }
        }


        int[] arr = new int[P];
        int cnt = 0;
        for (int i = 0; i < isPrime.length; i++) {
            if (!isPrime[i]) {
                arr[cnt++] = i;
            }
        }
        Arrays.sort(arr);

        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine());
            cnt = 0;
            for (int i = 2; i <= n/2; i++) {
                while ( !isPrime[i] && !isPrime[n-i] ) {
                    cnt++;
                    break;
                }
            }
            bw.write(cnt+"\n");
        }
        bw.flush();
        bw.close();
    }
}