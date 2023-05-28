import java.io.*;
import java.util.StringTokenizer;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str[] = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "-z="};
        String input = br.readLine();
        int cnt = 0;
        for (int j = 0; j < input.length(); j++) {
            for (int i = 0; i < str.length; i++) {
                if (input.contains(str[i])) {
                    cnt++;
                    input = input.replaceFirst(str[i], " ");
                }
            }
        }
        for (int x = 0; x < input.length(); x++) {
            for (char ch = 'a'; ch <= 'z'; ch++) {
                if (input.charAt(x) == ch) {
                    cnt++;
                }
            }
        }
        System.out.println(cnt);
    }
}
