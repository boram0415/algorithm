import java.io.*;
import java.util.*;
class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[1001];
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int cnt =0;
        for (int i = 1; i < 1001; i++) {
            for (int j = 0; j < i; j++) {
                if (arr[arr.length-1] != 0) {
                    break;
                }
                arr[cnt++] = i;
            }
        }
        int sum =0;
        for (int i = n-1; i < m; i++) {
            sum += arr[i];
        }
        System.out.print(sum);
    }
}