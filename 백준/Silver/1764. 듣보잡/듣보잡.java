import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        StringBuilder sb = new StringBuilder();
        Set<String> set = new HashSet<>();
        Set<String> tSet = new TreeSet<>();

        for (int i = 0; i < n; i++) {
            set.add(br.readLine());
        }

        String str ;
        int cnt = 0;

        while (m>0) {
            m--;
            str = br.readLine();
            if (set.contains(str)) {
                cnt++;
                tSet.add(str);
            }
        }
        Iterator it = tSet.iterator();
        while(it.hasNext()) {
            sb.append(it.next()).append("\n");
        }
        System.out.println(tSet.size()+"\n"+sb);

    }
}
