import java.io.IOException;
import java.util.*;

class Main {

    static boolean visited[][];
    static int graph[][];
    static int result, max = Integer.MIN_VALUE ,cnt;
    static int T, num;

    public static void main(String[] args) throws Exception {

        T = read();
        graph = new int[T][T];
        visited = new boolean[T][T];


        // 값 초기화
        for (int i = 0; i < T; i++) {
            for (int j = 0; j < T; j++) {
                int temp = read();
                max = Math.max(temp, max);
                graph[i][j] = temp;
            }
        }
        // 0~ 입력 최대 맥스 값 까지 순서대로 침수 지역 체크
        for (int k = 0; k <= max; k++) {
            cnt=0;
            num=k;
            visited = new boolean[T][T];
            for (int i = 0; i < T; i++) {
                for (int j = 0; j < T; j++) {
                    if (!visited[i][j] && graph[i][j] > k) {
                        dfs(i,j);
                        cnt++;
                    }
                }
            }
            result = Math.max(result, cnt);
        }

        System.out.println(result);

    }

    private static void dfs(int i, int j) {
        if (validCheck(i, j)) return;
        visited[i][j] = true;
        dfs(i + 1, j);
        dfs(i - 1, j);
        dfs(i, j - 1);
        dfs(i, j + 1);
    }

    private static boolean validCheck(int i, int j) {
        return (i < 0 || i >= T || j < 0 || j >= T || graph[i][j] <= num || visited[i][j]);
    }

    private static int read() throws IOException {
        int n, c;
        boolean neg = false;
        do {
            n = System.in.read();
            if (n == 45)
                neg = true;
        } while (n <= 45);
        n &= 15;
        while ((c = System.in.read()) > 45) {
            n = (n << 3) + (n << 1) + (c & 15);
        }
        return neg ? -n : n;
    }

}