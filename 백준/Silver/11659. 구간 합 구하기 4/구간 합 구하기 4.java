import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());
        // 줄의 갯수 N
        int[] arr = new int[Integer.parseInt(st.nextToken())+1];
        // 합의 횟수 M
        int cnt = Integer.parseInt(st.nextToken());
        // N개의 수
        st = new StringTokenizer(br.readLine());

        // N개의 수 구간 합 구하기
        for (int x = 1; x < arr.length; x++) {
            arr[x] = arr[x-1] + Integer.parseInt(st.nextToken());
        }
        for (int x = 0; x < cnt; x++) {
            st = new StringTokenizer(br.readLine());
            int i = Integer.parseInt(st.nextToken());
            int j = Integer.parseInt(st.nextToken());
            // index 0이 아닐경우
            if (i != 1) {
                // arr[i-1]번째 인덱스값을 arr[j]값에서 빼준다.
                sb.append(arr[j] - arr[i-1] + "\n");
            } else {
                sb.append(arr[j] + "\n");
            }
        }
        System.out.println(sb);
    }
}
