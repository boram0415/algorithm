import java.io.*;
import java.util.*;

public class Main {
    static StringTokenizer st;

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        st = new StringTokenizer(br.readLine());
        int[] arr = new int[Integer.parseInt(st.nextToken())];
        int M = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());

        arr[0] = Integer.parseInt(st.nextToken());
        for (int i = 1; i < arr.length; i++) {
            arr[i] = arr[i-1] + Integer.parseInt(st.nextToken());
        }

        while (M-- > 0) {
            st = new StringTokenizer(br.readLine());
            int i = Integer.parseInt(st.nextToken())-1;
            int j = Integer.parseInt(st.nextToken())-1;
            if(i==0) {
                sb.append(arr[j]).append("\n");
                continue;
            }
            sb.append(arr[j]-arr[i-1]).append("\n");
        }
        System.out.println(sb);
        // 5 9 12 14 15
    }
}
