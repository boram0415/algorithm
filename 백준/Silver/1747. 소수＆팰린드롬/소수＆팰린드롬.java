import java.io.*;
import java.util.*;

class Main {

    static int N = 1003001;
    static boolean palindrome(int n) {
        int cp = n,rev = 0;
        while (cp != 0) {
            int tmp = cp % 10;
            rev = rev * 10 + tmp;
            cp/=10;
        }
        return n == rev ? true : false;
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        boolean[] isPrime = new boolean[N + 1];
        isPrime[0] = isPrime[1] = true;

        for (int i = 2; i < (int) Math.sqrt(N); i++) {
            for (int j = i * i; j <= N; j += i) {
                isPrime[j] = true;
            }
        }

        int t = Integer.parseInt(br.readLine());
        int tmp = t;
        for (int i = tmp; i <= N; i++) {
            if (!isPrime[i]) {
                tmp = i;
                if (palindrome(tmp)) {
                    System.out.println(tmp);
                    break;
                }
            }
            tmp++;
        }
    }
}