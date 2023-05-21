import java.io.*;
import java.util.StringTokenizer;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        // 신호등 갯수
        int cnt = Integer.parseInt(st.nextToken());
        // 총 거리
        int dist = Integer.parseInt(st.nextToken());
        // time = 총 걸린시간,gap = 신호등간 지속시간, d = 전 신호등의 거리를 담는 변수
        int time = 0, gap = 0,tmp=0;
        for (int i = 0; i < cnt; i++) {
            st = new StringTokenizer(br.readLine());
            int d = Integer.parseInt(st.nextToken());
            int r = Integer.parseInt(st.nextToken());
            int g = Integer.parseInt(st.nextToken());

            time += d-tmp;
            tmp = d;
            // 도착 한 신호등의 빨간불 잔여 시간 계산식
            gap = time % (r + g);
            if (gap < r) time += r - gap;
        }
        System.out.print(time += (dist-tmp));
    }
}