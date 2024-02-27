import java.io.*;
import java.util.*;

class Main {
    static int graph[][];
    static int T, L;

    static int[][] pos = {{-2, 1}, {-1, 2}, {1, 2}, {2, 1}, {2, -1}, {1, -2}, {-1, -2}, {-2, -1}};
    static boolean visited [][];

    public static void main(String args[]) throws Exception {

        T = read();

        while (T-- > 0) {

            L = read();
            graph = new int[L][L];
            visited = new boolean[L][L];
            // 시작 x,y
            int cpX = read(), cpY = read();
            // 도착 x,y
            int dpX = read(), dpY = read();

            Queue<Node> q = new LinkedList<>();
            q.add(new Node(cpX, cpY));
            visited[cpX][cpY] =true;
            while (!q.isEmpty()) {
                Node node = q.poll();
                for (int i = 0; i < 8; i++) {
                    int x = node.x + pos[i][0];
                    int y = node.y + pos[i][1];
                    // 유효성 검사
                    if( x < 0 || x >= L || y < 0 || y >= L || graph[x][y] != 0 || visited[x][y]) continue;
                    visited[x][y] = true;
                    graph[x][y] = graph[node.x][node.y]+1;
                    q.add(new Node(x,y));
                }
            }
            System.out.println(graph[dpX][dpY]);
        }

    }

    static class Node {
        int x, y;

        Node(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    public static int read() throws IOException {
        int c = 0, n = 0;
        while (true) {
            c = System.in.read() - 48;
            if (c < 0 || c > 9) return n;
            n = n * 10 + c;
        }
    }


}