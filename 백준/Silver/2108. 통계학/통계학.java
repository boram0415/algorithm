import java.io.*;
import java.util.Arrays;

public class Main {
    final static int MAX = 4000;
    final static int MAX_FLAG = 8001;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        int[] cnt = new int[MAX_FLAG];
        double sum = 0.0;

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
            sum += arr[i];
        }
        sum /= n;
        // 산술평균
        sb.append(Math.round(sum)).append('\n');
        br.close();

        // 최빈값 카운팅
        for (int i = 0; i < n; i++) {
            cnt[arr[i] + MAX]++;
        }

        int[] nums = new int[n];
        int c = -1;
        int x = 0;
        int max = 0, max_num = 0;

        for (int i = 0; i < cnt.length; i++) {
            if (cnt[i] > 0) {
                if (cnt[i] >= c) {
                    max_num = i-MAX;
                    max = cnt[i];
                    c = cnt[i];
                }
            }
        }
        int a=0;
        for (int i = 0; i < cnt.length; i++) {
            if (cnt[i] > 0) {
                if (max == cnt[i]) {
                    a++;
                    nums[x++] = i-MAX;
                }
            }
        }
        Arrays.sort(arr);
        //중앙 값
        sb.append(arr[n/2]).append('\n');

        //최빈 값
        if (a > 1 ) {
            sb.append(nums[1]).append('\n');
        } else {
            sb.append(max_num).append('\n');
        }
        //범위
        sb.append(Math.abs(arr[0] - arr[arr.length - 1])).append('\n');
        // 답
        System.out.println(sb);
    }
}
