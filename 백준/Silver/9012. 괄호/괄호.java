import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        int t = Integer.parseInt(br.readLine());
        while (t > 0) {
            t--;
            sb.append(br.readLine());
            boolean result = true;
            for (int i = 0; 0<sb.length(); i++) {
                int idx = sb.toString().indexOf("()");
                if (idx < 0) {
                    result = false;
                    break;
                }
                sb.deleteCharAt(idx).deleteCharAt(idx);
            }
            bw.write(result == true ? "YES\n":"NO\n");
            sb.setLength(0);
        }
        bw.flush();
        bw.close();
    }
}