import java.util.Arrays;

public class Main {

    static int read() throws Exception {
        int c, m = 0;
        while (true) {
            c = System.in.read() - 48;
            if (c < 0 || c > 9) return m;
            m = m * 10 + c;
        }
    }

    public static void main(String[] args) throws Exception{

        int N = read();
        long cnt=0;
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i]=read();
        }
        int B = read();
        int C = read();

        for (int i = 0; i < N; i++) {
            // 총감독 수가 인원보다 적을 때
            if(arr[i] > B) {
                arr[i] -= B;
                cnt++;
                // 총감독 수가 인원보다 많을 때
            }else{
                arr[i] = 0;
                cnt++;
            }
        }
        for (int i = 0; i < N; i++) {
            // 총 감독 감시로 모든 인원이 감시 된다면
            if(arr[i] == 0 ) continue;

            if (arr[i] % C != 0) {
                cnt +=(arr[i]/C)+1;
            } else {
                cnt += (arr[i]/C);
            }
        }
        System.out.println(cnt);
    }
}
