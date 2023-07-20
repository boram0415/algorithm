import java.io.*;

public class Main {
     private static int read() throws Exception {
        int c, n = 0;
        while (true) {
            c = System.in.read()-48;
            if (c < 0 || c > 9) return n;
            n = n * 10 + c;
        }
    }
    public static void main(String[] args) throws Exception {
        int N = read();
        long ans = 6;
        for (int i = 11; i <= N; i++)
            ans *= i;
        System.out.println(ans);
    }
}