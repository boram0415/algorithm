import java.util.*;
import java.io.*;
class Main {
    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        StringBuilder[] sb = new StringBuilder[201];
        StringTokenizer st ;

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            int age = Integer.parseInt(st.nextToken());
            if(sb[age] == null) {
                sb[age] = new StringBuilder();
            }
            sb[age].append(age).append(" ").append(st.nextToken()).append("\n");
        }

        for(StringBuilder str : sb){
            if (str != null) {
                bw.write(str.toString());
            }
        }
        bw.flush();
        bw.close();
    }
}