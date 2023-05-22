import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken()), m = Integer.parseInt(st.nextToken());
        String[] arr = new String[n];
        // 집합 s에 있는 문자열 담기
        for (int i = 0; i < n; i++) {
            arr[i] = br.readLine();
        }
        // 이후 들어오는 문자열과 집합에 있는 문자열 비교 후 카운팅
        int cnt = 0;
        for (int i = 0; i < m; i++) {
            String str = br.readLine();
            for (int j = 0; j < n; j++) {
                if (arr[j].equals(str)) cnt++;
            }
        }
        System.out.print(cnt);
    }
}
