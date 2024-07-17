import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int bitSet = 0;
        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            String[] input = br.readLine().split(" ");
            String command = input[0];
            int num = input.length > 1 ? Integer.parseInt(input[1]) : 0;

            switch (command) {
                case "add":
                    bitSet |= (1 << num);
                    break;
                case "check":
                    bw.write((bitSet & (1 << num)) > 0 ? "1\n" : "0\n");
                    break;
                case "remove":
                    bitSet &= ~(1 << num);
                    break;
                case "toggle":
                    bitSet ^= (1 << num);
                    break;
                case "all":
                    bitSet = (1 << 21) - 1;
                    break;
                case "empty":
                    bitSet = 0;
                    break;
            }
        }

        bw.flush();
        bw.close();
        br.close();
    }
}