import java.util.*;
import java.io.*;
public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        st.nextToken();
        int W = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int arr[] = new int[501];
        int result = 0 , idx=0;
        int maxHeight = 0;
        for (int i = 0; i < W; i++) {
            int h =Integer.parseInt(st.nextToken());
            result += h;
            arr[i] = h;
            if (maxHeight < h) {
                maxHeight = h;
                idx = i;
            }
        }
        int sum =0,tmp=0;
        for (int i = 0; i <= idx; i++) {
            if (tmp < arr[i]) {
                tmp = arr[i];
            }
            sum += tmp;
        }
        tmp=0;
        for (int i = arr.length-1; i > idx; i--) {
            if (tmp < arr[i]) {
                tmp = arr[i];
            }
            sum += tmp;
        }
        System.out.println(sum-result);
    }
}