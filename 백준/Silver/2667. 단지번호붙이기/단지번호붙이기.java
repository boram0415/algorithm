import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    
    // 4가지 방향(상, 하, 좌, 우)으로 이동하기 위한 방향
    private static final int[] DX = {-1, 1, 0, 0};
    private static final int[] DY = {0, 0, -1, 1};

    private static char[][] map;
    private static List<Integer> clusterSizes = new ArrayList<>();
    private static int N;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        map = new char[N][N];

        for (int i = 0; i < N; i++) {
            map[i] = br.readLine().toCharArray();
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (map[i][j] == '1') {
                    int clusterSize = bfs(i, j);
                    clusterSizes.add(clusterSize);
                }
            }
        }

        Collections.sort(clusterSizes);
        StringBuilder sb = new StringBuilder();
        sb.append(clusterSizes.size()).append("\n");
        for (int size : clusterSizes) {
            sb.append(size).append("\n");
        }
        System.out.print(sb);
    }

    private static int bfs(int startX, int startY) {
        int count = 0;
        Queue<Point> queue = new LinkedList<>();
        queue.add(new Point(startX, startY));
        map[startX][startY] = 'f'; 

        while (!queue.isEmpty()) {
            Point current = queue.poll();
            count++;


            for (int direction = 0; direction < 4; direction++) {
                int nextX = current.x + DX[direction];
                int nextY = current.y + DY[direction];

                if (isInBounds(nextX, nextY) && map[nextX][nextY] == '1') {
                    map[nextX][nextY] = 'f';
                    queue.offer(new Point(nextX, nextY));
                }
            }
        }

        return count;
    }

    private static boolean isInBounds(int x, int y) {
        return x >= 0 && x < N && y >= 0 && y < N;
    }

    private static class Point {
        int x, y;

        Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
}