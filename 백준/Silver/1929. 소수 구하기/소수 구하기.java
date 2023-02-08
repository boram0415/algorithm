import java.io.*;
import java.util.StringTokenizer;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        StringBuilder sb = new StringBuilder();
        int m = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());
        boolean[] arr = new boolean[n + 1];
        arr[0] = true;
        arr[1] = true;
        for (int i = 2; i <= (int) Math.sqrt(n); i++) {
            for (int j = 2; i * j <= n; j++) {
                arr[i * j] = true;
            }
        }

        for (int i = m; i < arr.length; i++) {
            if (!arr[i]) {
                sb.append(i+"\n");
            }
        }
        System.out.println(sb);
    }
}