import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int temp = (Integer.parseInt(br.readLine()) * 2 - 1);
        int num = temp / 2;
        int n = 1, cnt = 0;

        while (cnt < 2) {

            for (int i = 0; i <= num; i++) {
                if (i < num) {
                    sb.append(" ");
                    continue;
                }

                if (cnt == 1) {
                    n -= 2;
                    num++;
                }

                for (int j = 0; j < n; j++) {
                    sb.append("*");
                }

                if (cnt == 0) {
                    n += 2;
                    num--;
                }
                sb.append("\n");
                i = -1;
                if (num > temp) {
                    break;
                }
            }
            n = temp;
            num = 1;
            cnt++;

        }

        System.out.println(sb);

    }
}

