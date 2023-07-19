import java.util.Arrays;

public class Main {

    static int read() throws Exception {
        int c, n = 0;
        while (true) {
            c = System.in.read() - 48;
            if (c < 0 || c > 9) return n;
            n = n * 10 + c;
        }
    }

    public static void main(String[] args) throws Exception {

        int N = read();
        int K = read();
        int arr[] = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = read();
        }
        Arrays.sort(arr);
        int s = 0, e = N - 1, cnt = 0;
        while (s < e) {
            int a = arr[s] + arr[e];
            if (a > K) {
                e--;
            } else if (a < K) {
                cnt++;
                e--;
                s++;
            } else {
                cnt++;
                e--;
                s++;
            }
        }
        System.out.println(cnt);


    }
}
