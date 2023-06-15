import java.io.*;
import java.util.*;
class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[t];
        int n=0;
        while (st.hasMoreTokens()) {
            arr[n++] = Integer.parseInt(st.nextToken());
        }

        for (int i = 0; i < arr.length-1; i++) {
            if (arr[i] > -1) {
                arr[i+1] = arr[i] + arr[i+1];
                if (arr[i+1] < 0) {
                    i++;
                }
            }
        }
        Arrays.sort(arr);
        System.out.println(arr[t-1]);
    }
}