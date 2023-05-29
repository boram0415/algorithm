import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        ArrayList<Integer> arr = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int tmp = Integer.parseInt(br.readLine());
            arr.add(tmp);
            if (tmp == 0) {
                arr.remove(i-1);
                arr.remove(i-1);
                i-=2;
                n-=2;
            }
        }

        int sum = 0;
        for (int i : arr) {
            sum+=i;
        }
        System.out.println(sum);
    }
}