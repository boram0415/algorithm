import java.util.*;
import java.io.*;
public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int T = Integer.parseInt(br.readLine());
        int arr[] = new int[1001];
        int result = 0 , idx=0;
        int maxHeight = 0, maxWidth = 0, minWidth = 1001;
        for (int i = 0; i < T; i++) {
            st = new StringTokenizer(br.readLine());
            int L = Integer.parseInt(st.nextToken());
            int H = Integer.parseInt(st.nextToken());
            arr[L] = H;
            if (maxHeight < H) {
                maxHeight = H;
                idx = L;
            }
            maxHeight = Math.max(maxHeight, H);
            maxWidth = Math.max(maxWidth, L);
            minWidth = Math.min(minWidth, L);
        }
        int tmp = 0;
        for (int i = minWidth; i <= idx; i++) {
            if (tmp < arr[i]) {
                tmp = arr[i];
            }
            result += tmp;
        }
        tmp=0;
        for (int i = maxWidth; i > idx; i--) {
            if (tmp < arr[i]) {
                tmp = arr[i];
            }
            result += tmp;
        }
        System.out.println(result);
    }
}