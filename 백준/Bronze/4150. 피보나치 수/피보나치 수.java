import java.io.*;
import java.math.*;
class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br  = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        BigInteger[] arr = new BigInteger[n+1];

        // 피보나치 수열 기본값 세팅
        arr[0] = BigInteger.valueOf(1);
        arr[1] = BigInteger.valueOf(1);
        // 피보나피 수열 구하기
        for (int i = 2; i < n; i++) {
            arr[i] = arr[i-1].add(arr[i-2]);
        }
        System.out.print(arr[n-1]);
    }
}