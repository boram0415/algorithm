import java.io.*;
import java.util.Arrays;

class Main {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int l = 0, r = 0, sum = 0;
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = i+1;
        }
        int cnt = 0;
        while (r < arr.length) {
            if (sum == N) {
                cnt++;
                sum -= arr[l];
                l++;
            } else if (sum > N) {
                sum -= arr[l];
                l++;
            } else if(sum < N){
                sum += arr[r];
                r++;
            }
        }
        System.out.println(cnt+1);
    }
}