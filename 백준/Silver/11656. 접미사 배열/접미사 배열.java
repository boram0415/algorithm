import java.util.*;
import java.io.*;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String S = br.readLine();
        TreeSet<String> set = new TreeSet<>();
        String tmp = S;
        for (int j = 0; j < S.length(); j++) {
            for (char i = 'a'; i <= 'z'; i++) {
                if (S.charAt(j) == i) {
                    set.add(tmp.substring(j));
                    break;
                }
            }
        }
        set.add(S.charAt(S.length()-1)+"");

        StringBuilder sb = new StringBuilder();
        Iterator i = set.iterator();
        while (i.hasNext()) {
            sb.append(i.next()).append("\n");
        }
        System.out.println(sb);
    }
}