import java.io.*;
import java.util.*;
class Main {
    static StringBuilder sb;

    static String rev(String str) {
        sb = new StringBuilder();
        str = sb.append(str).reverse() + "";
        return str;
    }

    static String tail(String str) {
        return str.substring(1);
    }

    static String fir(String str, int idx) {
        return str.substring(0, idx);
    }

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder tmp = new StringBuilder();
        int T = Integer.parseInt(br.readLine());
        while (T-- > 0) {
            String S = br.readLine();
            int answer = 0;
            for (int i = S.length() / 3; i < S.length(); i++) {
                String a = fir(S, i);
                String b = tail(a);
                String c = rev(a);
                String d = tail(c);

                if (S.equals(a + c + a)) {
                    answer = 1;
                    break;
                }

                if (S.equals(a + d + a)) {
                    answer = 1;
                    break;
                }

                if (S.equals(a + c + b)) {
                    answer = 1;
                    break;
                }

                if (S.equals(a + d + b)) {
                    answer = 1;
                    break;
                }


            }
            tmp.append(answer).append("\n");
        }

        System.out.println(tmp);
    }
}