import java.io.*;
import java.util.*;

class Main{
    static StringTokenizer st ;
    public static void main(String[]args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine());
        int N = Integer.valueOf(st.nextToken());
        int K = Integer.valueOf(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int[] arr = new int[N];
        int tmp=0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.valueOf(st.nextToken());
            if (i < K) {
                tmp += arr[i];
            }
        }
        int result =tmp;
        int start =0,end=K;
        for (int i = end; i < arr.length; i++) {
            tmp = tmp-arr[start++]+arr[i];
            result = Math.max(result,tmp);
        }
        System.out.println(result);


    }
}