import java.io.*;
import java.util.StringTokenizer;
public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        long A = Integer.parseInt(st.nextToken());
        long B = Integer.parseInt(st.nextToken());
        long min = (A < B) ? A : B;
        long gcd =0;
        for (int i = 1; i <= min; i++) {
            if (A % i == 0 && B % i == 0)
                gcd = i;
        }
        System.out.println((A * B) / gcd);
    }
}
