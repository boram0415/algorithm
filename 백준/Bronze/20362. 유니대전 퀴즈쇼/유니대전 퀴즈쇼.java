
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedHashMap;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken()), cnt = 0;
        String str = st.nextToken();
        Stack s = new Stack();
        String id = "", oh = "";
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            id = st.nextToken();
            oh = st.nextToken();
            s.push(oh);
            if (str.equals(id)) break;
        }
        oh = s.pop().toString();
        while(!s.empty()){
            if (s.pop().toString().equals(oh)) cnt++;
        }
        System.out.println(cnt);
    }
}
