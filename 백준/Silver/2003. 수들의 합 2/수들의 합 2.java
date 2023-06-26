import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int[] arr = new int[N+1];
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        int start =0,end=0,sum=0,cnt=0;
        while (end <= N) {
            if (sum == M) {
                cnt++;
                sum -= arr[start];
                start++;
            }else if(sum < M ){
                sum += arr[end];
                end++;
            }else{
                sum -= arr[start];
                start++;
            }
        }
        System.out.println(cnt);
    }
}
