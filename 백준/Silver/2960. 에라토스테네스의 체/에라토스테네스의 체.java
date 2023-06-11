import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        int tmp = 0;
        ArrayList<Integer> arr = new ArrayList<>();

        for (int i = 2; i <= N; i++) {
            boolean prime = false;
            // 소수 인지 판단하기
            for (int j = 2; j <= (int) Math.sqrt(i); j++) {
                if (i % j == 0) {
                    prime = true;
                }
            }
            // 소수 중 가장 작은 수 지우기
            if (!prime) {
                arr.add(i);
                if (arr.size() >= K) {
                    System.out.println(arr.get(K-1));
                    return;
                }
                //  지워진 소수의 배수 지우기
                for (int x = 2; x*i <= N; x++) {
                    if(!arr.contains(i*x)) arr.add(i*x);
                }

            }

        }

    }
}