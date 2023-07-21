import java.io.*;
import java.util.Arrays;

public class Main {
    static long read() throws Exception {
        long c, m = 0;
        while (true) {
            c = System.in.read() - 48;
            if (c < 0 || c > 9) return m;
            m = m * 10 + c;
        }
    }

    public static void main(String[] args) throws Exception {

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        final int ARR_SIZE = 63246;
        int[] primeNum = new int[ARR_SIZE];
        int T;
        long n;
        boolean isPrime = false;

        primeNum[0] = 1;
        primeNum[1] = 1;
        for (int i = 2; i < ARR_SIZE; i++) {
            for (int j = 2; i * j < ARR_SIZE; j++) {
                primeNum[i * j] = 1;
            }
        }

        T = (int)read();
        while (T-- > 0) {
            n = read();
            if (n <= 1) {
                sb.append("2").append("\n");
            } else {
                for (long i = n; ; i++) {
                    int m = (int) Math.sqrt(i);
                    isPrime = true;
                    for (int j = 1; j <= m; j++) {
                        if (primeNum[j] == 0) {
                            if (i % j == 0) {
                                isPrime = false;
                                break;
                            }
                        }
                    }
                    if (isPrime) {
                        sb.append(i).append("\n");
                        break;
                    }
                }
            }
        } // while end
        System.out.println(sb.toString().trim());
    }
}