import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int t = Integer.parseInt(br.readLine());
        Deque<Integer> qu = new ArrayDeque<>();
        StringTokenizer st ;

        while (t > 0) {
            t--;
            st = new StringTokenizer(br.readLine());
            boolean flag = qu.isEmpty();
            switch (st.nextToken()) {
                case "push" :
                    qu.add(Integer.parseInt(st.nextToken()));
                    break;
                case "front" :
                    bw.write(flag == true ? "-1\n" : qu.peek()+"\n");
                    break;
                case "back" :
                    bw.write(flag == true ? "-1\n" : qu.peekLast()+"\n");
                    break;
                case "size" :
                    bw.write(qu.size()+"\n");
                    break;
                case "pop" :
                    bw.write(flag == true ? "-1\n" : qu.pollFirst()+"\n");
                    break;
                case "empty" :
                    bw.write(flag == true ? "1\n": "0\n");
                    break;
            }
        }
        bw.flush();
        bw.close();
    }
}
