import java.io.*;
import java.util.*;
class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int cnt = Integer.parseInt(br.readLine());
        while (cnt > 0) {
            cnt--;
            StringTokenizer st = new StringTokenizer(br.readLine());
            int len = st.countTokens();
            for (int i = 0; i < len; i++) {
                String str = st.nextToken();
                for (int j = str.length() - 1; j >= 0; j--) {
                    sb.append(str.charAt(j));
                }
                sb.append(" ");
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }
}