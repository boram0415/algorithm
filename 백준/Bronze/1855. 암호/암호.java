import java.io.*;
import java.util.*;
class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int c = Integer.parseInt(br.readLine());
        String str = br.readLine();
        int r = str.length() / c , cnt=0;
        String[][] arr = new String[r][c];
        String tmp = "";
        for (int i = 0; i < r; i++) {
            sb.setLength(0);
            sb.append(str.substring(i*c, cnt += c));

            if (i % 2 != 0) {
                sb.reverse();
            }
            for (int j = 0; j < c; j++) {
                arr[i][j] = sb.toString().charAt(j)+"";
            }

        }
        sb.setLength(0);
        for (int i = 0; i < c; i++) {
            for (int j = 0; j < r; j++) {
                sb.append(arr[j][i]);
            }
        }
        System.out.print(sb);
    }
}