public class Main {

    static int h, w;
    static int[][] arr;
    static boolean visited[][];
    static int cnt, max = 0, tmpCnt;

    public static void main(String args[]) throws Exception {
        h = read();
        w = read();
        arr =new int[h][w];
        visited=new boolean[h][w];

        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                arr[i][j] = read();
            }
        }

        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                if (!visited[i][j] && arr[i][j] == 1) {
                    dfs(i, j);
                    cnt++;
                    max = Math.max(max, tmpCnt);
                    tmpCnt=0;
                }
            }
        }
        System.out.print(cnt + "\n" + max);
    }


    static void dfs(int x, int y){
        if (x < 0 || x >= h || y < 0 || y >= w || visited[x][y]) return;
        visited[x][y] = true;
        if (arr[x][y] == 1) {
            tmpCnt++;
            dfs(x, y + 1);
            dfs(x, y - 1);
            dfs(x + 1, y);
            dfs(x - 1, y);
        }
    }

    static int read () throws Exception {
        int c = 0, n = 0;
        while (true) {
            c = System.in.read() - 48;
            if (c < 0 || c > 9) return n;
            n = n * 10 + c;
        }
    }
}
