import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());
        // 줄의 갯수 N
        int[] arr = new int[Integer.parseInt(st.nextToken())];
        // 합의 횟수 M
        int cnt = Integer.parseInt(st.nextToken());
        // N개의 수
        st = new StringTokenizer(br.readLine());

        // N개의 수 배열에 담기
        for (int x = 0; x < arr.length; x++) {
            arr[x] = Integer.parseInt(st.nextToken());
        }
        // 구간 합 구해놓기
        for (int x = 1; x < arr.length; x++) {
            arr[x] += arr[x - 1];
        }
        for (int x = 0; x < cnt; x++) {
            st = new StringTokenizer(br.readLine());
            int i = Integer.parseInt(st.nextToken()) - 1;
            int j = Integer.parseInt(st.nextToken()) - 1;
            // index 0이 아닐경우
            if (i != 0) {
                // arr[i-1]번째 인덱스값을 arr[j]값에서 빼준다.
                sb.append(arr[j] - arr[i-1] + "\n");
            } else {
                sb.append(arr[j] + "\n");
            }
        }
        System.out.println(sb);
    }
}
