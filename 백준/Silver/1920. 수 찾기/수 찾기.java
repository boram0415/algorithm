import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());

        int[] saveArr = new int[N];
        st = new StringTokenizer(br.readLine());
        for (int i= 0; i< N ; i++) {
            saveArr[i] = Integer.parseInt(st.nextToken());
        }
        st = new StringTokenizer(br.readLine());
        int M = Integer.parseInt(st.nextToken());
        int[] searchArr = new int[M];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < M; i++) {
            searchArr[i] = Integer.parseInt(st.nextToken());
        }

        /**
         * find arr
         * 1. sort saveArr
         * 2. binary search each searchArr
         * 3. save to StringBuilder
         */

        StringBuilder sb = new StringBuilder();
        Arrays.sort(saveArr);
        for (int s : searchArr) {
            int idx = Arrays.binarySearch(saveArr, s);
            if (idx >= 0) {
                sb.append('1');
            }
            else {
                sb.append('0');
            }
            sb.append('\n');
        }
        sb.deleteCharAt(sb.length() - 1);
        System.out.print(sb);
    }
}