import java.util.*;
import java.io.*;
public class Main {
    public static void main(String args[]) throws IOException {
        int n = Integer.parseInt(new BufferedReader(new InputStreamReader(System.in)).readLine());
        for (int i = 1_000_000; i >= 0; i--) {
            if (sum(n-i) == n) {
                System.out.println((n-i));
                return;
            }
        }
        System.out.println(0);
    }

    static int sum(int con) {
        int res = 0, n =con;
        while (n != 0) {
            res += n % 10;
            n /= 10;
        }
        return con+res;
    }

}