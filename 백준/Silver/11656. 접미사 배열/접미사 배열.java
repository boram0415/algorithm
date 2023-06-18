import java.util.*;
import java.io.*;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String S = br.readLine();
        StringBuilder sb = new StringBuilder();
        String[] str = new String[S.length()];
        for (int i = 0; i < S.length(); i++) {
            str[i] = S.substring(i);
        }
        Arrays.sort(str);
        for(String i : str) sb.append(i).append("\n");
        System.out.println(sb);
    }
}