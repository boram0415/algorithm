import java.io.*;
import java.math.BigInteger;

public class Main {

    public static void main(String[] args) throws Exception{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BigInteger A = new BigInteger(br.readLine());
        char d = br.readLine().charAt(0);
        BigInteger B = new BigInteger(br.readLine());

        if( d == '*') {
            System.out.println(A.multiply(B));
        }else{
            System.out.println(A.add(B));
        }

    }

}
