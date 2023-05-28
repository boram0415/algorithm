import java.io.*;
import java.math.BigInteger;

class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br  = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        BigInteger[] arr = new BigInteger[n+1];

        arr[0] = BigInteger.valueOf(0);
        arr[1] = BigInteger.valueOf(1);

        if (n > 1) {
            arr[2] = BigInteger.valueOf(1);
        }

        for (int i = 3; i <= n; i++) {
            arr[i]= arr[i - 2].add(arr[i - 1]);
        }
        System.out.print(arr[n]);
    }
}