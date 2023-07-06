import java.io.*;
import java.util.*;

public class Main {

    private static boolean[] arr;
    private static int N, X, ans;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        arr = new boolean[2000001];
        N = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arr[Integer.parseInt(st.nextToken())] = true;
        }

        st = new StringTokenizer(br.readLine());
        X = Integer.parseInt(st.nextToken());
        for (int i = 1; i <= X; i++) {
            if (arr[i] && arr[X-i]) {
                ans++;
            }
        }
        System.out.println(ans/2);
    }
}
