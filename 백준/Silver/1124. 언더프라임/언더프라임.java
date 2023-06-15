import java.io.*;
import java.util.*;
class Main {
    static int[] prime = {2, 3, 5, 7, 11, 13, 17};
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int cnt = 0;
        for (int i = A; i <= B; i++) {
            int n = fnc(i);
            if (n > 1 && Arrays.binarySearch(prime, n) > -1) {
                cnt++;
            }
        }
        System.out.println(cnt);
    }

    static int fnc(int n) {
        int cnt = 0;
        for (int x = 2; x <= (int) Math.sqrt(n); x++) {
            while (n % x == 0) {
                n /= x;
                cnt++;
            }
        }
        if (n != 1) {
            cnt++;
        }
        return cnt;
    }
}