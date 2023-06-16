import java.io.*;
import java.util.*;

class Main {
    static boolean isPrime[];
    static boolean palindrome(int n) {
        String t = n + "";
        for (int i = 0; i < t.length() / 2; i++) {
            if (t.charAt(i) != t.charAt(t.length() - i - 1)) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        isPrime = new boolean[b + 1];
        for (int i = 2; i<=(int)Math.sqrt(b); i++) {
            if (!isPrime[i]) {
                for (int j = i*i; j <= b; j += i) {
                    isPrime[j] = true;
                }
            }
        }
        for (int i = a; i <= b; i++) {
            if (!isPrime[i] && palindrome(i)) {
                sb.append(i).append("\n");
            }
        }
        sb.append(-1);
        System.out.println(sb);
    }
}