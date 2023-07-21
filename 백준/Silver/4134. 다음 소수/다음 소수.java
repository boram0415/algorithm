import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws Exception {

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        int arr = 63300;
        int[] primeNum = new int[arr];
        int T;
        long n;
        boolean isPrime = false;

        primeNum[0] = 1;
        primeNum[1] = 1;

        for (int i = 2; i <=Math.sqrt(arr); i++) {
            if(primeNum[i] == 1) continue;
            for (int j = i*i; j < arr; j+=i) {
                primeNum[j] = 1;
            }
        }

        T = (int) read();
        while (T-- > 0) {
            n = read();
            if (n <= 1) {
                sb.append("2").append("\n");
            } else {
                for (long i = n; ; i++) {
                    int m = (int) Math.sqrt(i);
                    isPrime = true;
                    for (int j = 2; j <= m; j++) {
                        if (primeNum[j] == 0 && i % j == 0) {
                            isPrime = false;
                            break;
                        }
                    }
                    if (isPrime) {
                        sb.append(i).append("\n");
                        break;
                    }
                }
            }
        }// while end
        System.out.println(sb.toString().trim());
    }

    static long read() throws Exception {
        long c, m = 0;
        while (true) {
            c = System.in.read() - 48;
            if (c < 0 || c > 9) return m;
            m = m * 10 + c;
        }
    }
}
