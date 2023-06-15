import java.io.*;
import java.util.*;

public class Main {
    static StringBuilder sb;
    static boolean []isPrime;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        isPrime = new boolean[B+1];
        isPrime[0] = isPrime[1] = true;

        for (int i = 2; i <= (int) Math.sqrt(B); i++) {
            for (int j = i*i; j <= B; j += i) {
                if (!isPrime[j]) isPrime[j] = true;
            }
        }
        int cnt = 0;
        for (int i = A; i <=B; i++) {
            if (isPrime[i]) {
                if(!fnc(i)) cnt++;
            }
        }
        System.out.println(cnt);
    }

    static boolean fnc(int n) {
        int cnt = 0 ,i=2;
        while (n != 1) {
            if (n % i == 0) {
                n /=i;
                cnt++;
                continue;
            }
            i++;
        }
        return isPrime[cnt];
    }

}