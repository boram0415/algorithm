import java.io.*;
import java.util.*;

class Main {

    static int N = 1000001;
    static boolean [] prime = new boolean[N];
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        for (int i = 2; i < N; i++) {
            if (!prime[i]) {
                for (int j = i + i; j < N; j += i) {
                    prime[j] = true;
                }
            }
        }

        int n = 0;
        boolean ch = false;
        while ((n = Integer.parseInt(br.readLine())) != 0) {
            for (int i = 2; i < n; i++) {
                if (!prime[i] && !prime[n-i]) {
                    sb.append(n).append(" = ").append(i).append(" + " ).append(n-i).append("\n");
                    ch = true;
                    break;
                }
            }
        }

        if (!ch) {
            System.out.println("Goldbach's conjecture is wrong.");
        }else{
            System.out.println(sb);
        }

    }
}