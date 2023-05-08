import java.io.*;
import java.util.StringTokenizer;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int h = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        String result;
        // 알람설정 분이 45분보다 클 경우
        if (m > 45) {
            result = h + " " + (m - 45);
            // 작을 경우
        } else if (m == 45){
            result = h + " " + 0;
        } else{
            result = h != 0 ? --h + " " + ((60 + m) - 45) : 23 + " " + ((60 + m) - 45);
        }
        System.out.println(result);
    }
}