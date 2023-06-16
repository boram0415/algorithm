import java.util.*;
import java.io.*;

public class Main {
    // 팰린드롬이면서 소수인 마지막 수 
    static int N = 9989899;
    static boolean isPrime[];

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int min = Math.min(Integer.parseInt(st.nextToken()), N);
        isPrime = new boolean[min + 1];
        
        for (int i = 2; i <= (int) Math.sqrt(min); i++) {
            if (isPrime[i]) continue;
            for (int j = i * i; j <= min; j += i) {
                if (!isPrime[j]) isPrime[j] = true;
            }
        }
        
        for (int i = a; i <= min; i++) {
            if (!isPrime[i]) {
                if (pal(i)) sb.append(i + "\n");
            }
        }
        sb.append(-1);
        System.out.print(sb);
    }

    static boolean pal(int n) {
        int result = 0, cp = n;
        while (cp != 0) {
            int tmp = cp % 10;
            result = result * 10 + tmp;
            cp /= 10;
        }
        return result == n;
    }

}