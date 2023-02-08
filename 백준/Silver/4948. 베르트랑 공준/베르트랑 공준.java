import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = 0, cnt = 0;
        while (true) {
            n = Integer.parseInt(bf.readLine());
            if (n == 0 ) {
                System.out.println(sb);
                return;
            }
            boolean arr[] = new boolean[2*n+1];
            cnt=0;
            arr[0]=true;
            arr[1]=true;
            for (int i = 2; i <= (int)Math.sqrt(n*2); i++) {
                if (!arr[i]) {
                    for (int j = 2; i*j <= n*2; j++) {
                        arr[i*j] = true;
                    }
                }
            }
            for (int f=n+1;f<arr.length;f++) {
                if (!arr[f]) {
                    cnt++;
                }
            }
            sb.append(cnt + "\n");
        }
    }
}