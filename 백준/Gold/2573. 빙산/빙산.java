import java.util.LinkedList;
import java.util.Queue;

class Main {
    static int N, M, cnt;
    static int graph[][];
    static boolean visited[][];
    static int dx[] = {-1, 1, 0, 0};
    static int dy[] = {0, 0, -1, 1};

    public static void main(String[] args) throws Exception {

        N = read();
        M = read();
        graph = new int[N][M];
        visited = new boolean[N][M];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                graph[i][j] = read();
            }
        }
        int answer =-1;
        while ((answer = splitIce()) != 0) {
            if(answer > 1 ) {
                System.out.println(cnt);
                return;
            }
            bfs();
            cnt++;
        }
        System.out.println(0);
    }


    /* 분리 여부 확인*/
    private static int splitIce() {
        visited = new boolean[N][M];
        int count = 0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (graph[i][j] > 0 && !visited[i][j]) {
                    dfs(i, j);
                    count++;
                }
                if (count > 1) return count;
            }
        }
        return count;
    }

    /* 빙산 부분별 높이 계산 탐색 */
    private static void bfs() {
        Queue<Node> queue = new LinkedList<>();
        boolean[][] visited = new boolean[N][M];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if(graph[i][j] > 0) queue.offer(new Node(i, j));
            }
        }

        while (!queue.isEmpty()) {
            Node node = queue.poll();
            graph[node.x][node.y] = graph[node.x][node.y] - culIce(node.x, node.y);
            for (int i = 0; i < 4; i++) {
                int x = node.x + dx[i];
                int y = node.y + dy[i];
                if (visited[x][y] || graph[x][y] <= 0) continue;
                visited[x][y] = true;
            }
        }
    }

    /* 빙산 분리 확인 탐색 */
    private static void dfs(int x, int y) {
        if (graph[x][y] <= 0 || visited[x][y]) return;
        visited[x][y] = true;
        for (int i = 0; i < 4; i++) {
            dfs(x + dx[i], y + dy[i]);
        }
    }

    /* 빙산 부분별 높이 계산  */
    private static int culIce(int x, int y) {
        int cnt = 0;
        for (int i = 0; i < 4; i++) {
            if (graph[x + dx[i]][y + dy[i]] <= 0 && !visited[x + dx[i]][y + dy[i]]) cnt++;
        }
        return cnt;
    }
    static int read() throws Exception {
        int n = 0;
        boolean isNegative = false;
        while (true) {
            int input = System.in.read();
            if (input <= 32)
                return isNegative ? n * -1 : n;
            else if (input == '-')
                isNegative = true;
            else
                n = (n << 3) + (n << 1) + (input & 15);
        }
    }
}

class Node {
    int x, y;

    public Node(int x, int y) {
        this.x = x;
        this.y = y;
    }
}