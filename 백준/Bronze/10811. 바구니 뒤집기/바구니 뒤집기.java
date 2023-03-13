import java.io.*;
import java.util.StringTokenizer;
public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(st.nextToken());
        int[] arr = new int[n];
        int cnt = Integer.parseInt(st.nextToken());
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }
        while (cnt > 0) {
            cnt--;
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken())-1;
            int y = Integer.parseInt(st.nextToken())-1;
            int t= y;
            for (int i = x; i < y; i++) {
                for (int j = t; j > i;) {
                    int temp = 0;
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                    break;
                }
                t--;
            }
        }

        for (int x : arr) {
            sb.append(x + " ");
        }
        System.out.println(sb);
    }
}

