import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception{
        int N = read(),M = read();
        ArrayList<Integer> num = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            int k = read();
            for (int j = 1; j <= k; j++) {
                int x = read();
                if (j == 1 || j == k) {
                    num.add(x);
                }
            }
        }
        Collections.sort(num);
        System.out.println(num.get(N - 1));
    }


    static int read() throws Exception {
        int n = 0;
        boolean isNegative = false;
        while (true) {
            int input = System.in.read();
            if (input <= 32)
                return isNegative ? n * -1 : n;
            else if (input == '-')
                isNegative = true;
            else
                n = (n << 3) + (n << 1) + (input & 15);
        }
    }
}