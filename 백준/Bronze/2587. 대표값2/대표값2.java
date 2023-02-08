import java.io.*;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int nums[] = new int[5];
        int sum=0;
        for (int i = 0; i < 5; i++) {
            nums[i] = Integer.parseInt(bf.readLine());
            sum += nums[i];
        }
        Arrays.sort(nums);
        System.out.println(sum/5);
        System.out.println(nums[2]);
    }
}
