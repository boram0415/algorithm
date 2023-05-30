import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder tmp = new StringBuilder();
        Stack<String> st = new Stack<>();
        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            tmp.append(br.readLine());
            if (tmp.toString().contains("push")) {
                st.push(tmp.substring(5, tmp.length()));
                tmp.setLength(0);
                continue;
            }
            switch (tmp.toString()) {
                case "top":
                    if (st.size() == 0) {
                        bw.write("-1\n");
                        break;
                    }
                    bw.write(st.peek()+"\n");
                    break;
                case "pop":
                    if (st.size() == 0) {
                        bw.write("-1\n");
                        break;
                    }
                    bw.write(st.pop()+"\n");
                    break;
                case "size":
                    bw.write(st.size()+"\n");
                    break;
                case "empty":
                    bw.write(st.empty() == true ? "1\n" : "0\n");
                    break;
            }
            tmp.setLength(0);
        }
        bw.flush();
        bw.close();
    }
}