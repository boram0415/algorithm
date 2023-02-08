import java.io.*;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int cnt = Integer.parseInt(bf.readLine());
        int nums[] = new int[cnt];
        for (int i = 0; i < cnt; i++) {
            nums[i] = Integer.parseInt(bf.readLine());
        }
        Arrays.sort(nums);
        for (int k : nums) {
            sb.append(k+"\n");
        }
        System.out.println(sb);

    }
}