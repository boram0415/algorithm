import java.io.*;
import java.util.*;
class Main{
        static StringTokenizer st;
    public static void main(String[]args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[] arr = new int[N+1];
        st = new StringTokenizer(br.readLine());
        for(int i=1;i<arr.length;i++){
            arr[i]= arr[i-1] + Integer.parseInt(st.nextToken());
        }
        while(M-- > 0 ){
            st = new StringTokenizer(br.readLine());
            int i = Integer.parseInt(st.nextToken());
            int j = Integer.parseInt(st.nextToken());
            sb.append(arr[j]-(arr[i-1])).append("\n");
        }
        System.out.print(sb);
    }

}