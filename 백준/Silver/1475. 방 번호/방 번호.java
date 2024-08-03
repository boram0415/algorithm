import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String num = br.readLine();
        int[] arr = Arrays.stream(num.split("")).mapToInt(Integer::parseInt).toArray();
        int[] valid = new int[10];

        for (int i = 0; i < arr.length; i++) {
            valid[arr[i]]++;
        }

        int sum = valid[6] + valid[9];
        valid[6]= valid[9]=(sum+1)/2;
        System.out.println(Arrays.stream(valid).max().orElse(0));
    }
}