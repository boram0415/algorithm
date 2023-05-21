import java.io.*;
import java.util.*;
class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int cnt = Integer.parseInt(br.readLine());
        while (cnt > 0) {
            cnt--;
            String str = br.readLine();
            StringTokenizer st = new StringTokenizer(str);
            int len = st.countTokens();
            for (int i = 0; i < len; i++) {
                String temp = st.nextToken();
                for (int j = temp.length()-1; j >= 0; j--) {
                    sb.append(temp.charAt(j));
                }
                sb.append(" ");
            }
            sb.append("\n");
        }
        System.out.print(sb.toString());
    }
}