import java.math.BigInteger;
import java.sql.SQLOutput;
import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        long h = Long.parseLong(st.nextToken());
        long x = Long.parseLong(st.nextToken());
        long result =0;
        long j=1;
        for (int i=1;i<=h;i++) {
            j *= x;
            j %= 1000000007;
            result = result + (Integer.parseInt(br.readLine())*j);
            result %= 1000000007;
        }
        System.out.println(result);
    }
}
