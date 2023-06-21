import java.util.*;
import java.io.*;
public class Main {
    public static void main(String args[]) throws IOException {
        String str = new BufferedReader(new InputStreamReader(System.in)).readLine();
        StringBuilder sb = new StringBuilder();
        int N = str.length()/10;
        if (N == 0) {
            System.out.println(str);
            return;
        }
        int i=0;
        int cnt=0;
        int a=N;
        while (a-- > 0) {
            sb.append(str.substring(i, i+10)).append("\n");
            i+=10;
            if (cnt == N-1) {
                sb.append(str.substring(i));
            }
            cnt++;
        }
        System.out.println(sb);
    }
}