import java.math.BigInteger;
import java.sql.SQLOutput;
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        Queue<Integer> n = new ArrayDeque<>();
        // 값 초기화
        for (int i = 1; i <= t; i++) {
            n.add(i);
        }

        int tmp;
        while (n.size()>1) {
            tmp=0;
            n.remove();
            tmp=n.poll();
            n.add(tmp);

        }
        System.out.println(n.poll());
    }
}
