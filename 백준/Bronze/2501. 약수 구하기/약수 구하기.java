import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");
        int N = Integer.parseInt(str[0]);
        int K = Integer.parseInt(str[1]);
        int result = 0,cnt=0;
        for (int i = 1; i <= N; i++) {
            if (N % i == 0) {
                cnt++;
                result = i;
            }
            if(cnt == K) break;
        }

        if (cnt == K) {
            System.out.println(result);
        }else{
            System.out.println(0);
        }
    }
}
