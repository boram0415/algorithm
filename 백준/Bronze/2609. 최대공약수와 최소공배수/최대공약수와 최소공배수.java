import java.io.*;
import java.util.*;
class Main {
    static int gcd(int a, int b) {
        while (b > 0) {
            int tmp =a;
            a = b;
            b = tmp%b;
        }
        return a;
    }
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int X = Integer.parseInt(st.nextToken());
        int Y = Integer.parseInt(st.nextToken());
        int m = gcd(X, Y);
        System.out.println(m + "\n" + (X*Y)/m);
    }
}