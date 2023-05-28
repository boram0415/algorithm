import java.io.*;
import java.math.*;

class Main{
    public static void main(String[] args ) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        BigInteger[] b = new BigInteger[t+1];
        
        // 1번째와,2번째를 1로 초기화
        b[0] = BigInteger.valueOf(1);
        b[1] = BigInteger.valueOf(1);
        // 피보나치 수열 구하기
        for(int i=2;i<t;i++){
            // 112
            b[i] = b[i-1].add(b[i-2]);
        }
        System.out.print(b[t-1]);
    }
    
    
}