import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");
        int N = Integer.parseInt(str[0]);
        int K = Integer.parseInt(str[1]);
        List<Integer> list = new ArrayList<>();
        int cnt=0;
        for (int i = 1; i <= N; i++) {
            if (N % i == 0) {
                list.add(i);
            }
        }

        if (list.size() >= K) {
            System.out.println(list.get(K-1));
        }else{
            System.out.println(0);
        }


    }
}
