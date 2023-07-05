import java.io.*;
import java.util.*;

public class Main {
    static StringTokenizer st;
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String str = br.readLine();
        Stack<Character> s = new Stack<>();
        Stack<Character> e = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            s.push(str.charAt(i));
        }

        int M = Integer.parseInt(br.readLine());
        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            switch (st.nextToken()) {
                case "L":
                    if (!s.isEmpty()) e.push(s.pop());
                    break;
                case "D":
                    if (!e.isEmpty()) s.push(e.pop());
                    break;
                case "B":
                    if (!s.isEmpty()) s.pop();
                    break;
                case "P":
                    s.push(st.nextToken().charAt(0));
                    break;
            }
        }

        while(!s.isEmpty())
            e.push(s.pop());

        while(!e.isEmpty())
            sb.append(e.pop());

        System.out.println(sb);
    }

}
