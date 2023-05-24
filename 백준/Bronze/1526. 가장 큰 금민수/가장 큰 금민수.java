import java.io.*;
import java.util.*;
class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int cnt=0;
        int n = Integer.parseInt(br.readLine());
        for (int i = n; i > 3; i--) {
            String tmp = i + "";
            int len = tmp.length();
            for (int j = 0; j < len; j++) {
                if ("4".equals(tmp.charAt(j)+"") || "7".equals(tmp.charAt(j)+"")) {
                    cnt++;
                }else{
                    cnt=0;
                    break;
                }
            }
            if (cnt == len) {
                System.out.print(i);
                return;
            }
        }
    }
}