import java.io.*;
import java.util.*;

class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());

        int tmpA = Integer.parseInt(st.nextToken());
        int tmpB = Integer.parseInt(st.nextToken());;

        while (B-- > 1) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            tmpA = a > tmpA ? tmpA : a;
            tmpB = b > tmpB ? tmpB : b;
        }
        // 패키지 가격의 +1 한 가격
        int a = ((N/6)*tmpA)+tmpA;
        // 낱개만 구매했을 경우
        int b= N*tmpB;
        // 패키지 + 낱개
        int c= (N/6)*tmpA+(N%6)*tmpB;
        // 패키지를 하나 더 사는 가격보다 낱개를 여러개 사는 가격이 높으면 패키지 하나를 더 사는것이 낫다.
        c = c > Math.min(a, b) ? Math.min(a, b) : c;
        System.out.println(c);
    }
}