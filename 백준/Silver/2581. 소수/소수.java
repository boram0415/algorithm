import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int m = Integer.parseInt(bf.readLine());
        int n = Integer.parseInt(bf.readLine());
        boolean[] arr = new boolean[n+1];
        int sum = 0,min=0;
        
        for (int i = m; i <= n; i++) {
            if (i < 2) {
                continue;
            }
            arr[i] = true;
            int sq = (int) Math.sqrt(i);
            for (int j = 2; j <= sq; j++) {
                if (i % j == 0) {
                arr[i] = false;
                }
            }
        }
        for (int x = n; x >= m; x--) {
            if (arr[x]) {
                sum += x;
                min=x;
            }
        }
        if (sum != 0) {
            System.out.print(sum+"\n"+min);
            return;
        }
        System.out.println(-1);
    }
}