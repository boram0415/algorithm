import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String f = br.readLine();
        int answer =0;
        int len = f.length()-1;
        for (int i = len; i >= 0; i--) {
            sb.append(f.charAt(i));
        }
        if (f.equals(sb.toString())) {
            answer=1;
        }
        System.out.println(answer);

    }
}