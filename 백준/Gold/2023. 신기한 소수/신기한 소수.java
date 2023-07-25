import java.io.*;
import java.util.*;

public class Main {
    static int[] arr = {2, 3, 5, 7};
    static StringBuilder sb = new StringBuilder();
    static int cnt,N;
    static boolean f ;

    static boolean cp(int sum) {
        for (int x = 2; x <= (int) Math.sqrt(sum); x++) {
            if (sum % x == 0) {
                return false;
            }
        }
        return true;
    }

    private static void rec(int i) {
        i *= 10;
        for (int j = 1; j <= 9; j++) {
            i++;
            boolean flag = cp(i);
            // 소수 인데 카운트가 자릿수만큼 돌았다면
            if (flag && cnt == N) {
                sb.append(i).append("\n");
                continue;
            } else if (!flag && cnt == N) {
                continue;
            }
            //소수 이면
            if (flag) {
                cnt++;
                //자릿수 만큼 재귀를 돌려 sb에 저장
                rec(i);
            }
        }
       cnt--;

    }
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        if (N == 1) {
            for (int i : arr) {
                System.out.println(i);
            }
            return;
        }
        for (int i = 0; i < arr.length; i++) {
            cnt = 2;
            rec(arr[i]);
        }
        System.out.println(sb);
    }
}


