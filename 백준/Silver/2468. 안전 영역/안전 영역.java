import java.io.*;
import java.util.*;

public class Main {
        static int N;
        static int[][] map;
        static boolean[][] visited;
        static int X[] = {-1, 1, 0, 0};
        static int Y[] = {0, 0, -1, 1};

        public static void main(String[] args) throws Exception {

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            N = Integer.parseInt(br.readLine());
            map = new int[N][N];
            visited = new boolean[N][N];
            Set<Integer> set = new HashSet<>();
            for (int i = 0; i < N; i++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                for (int j = 0; j < N; j++) {
                    map[i][j] = Integer.parseInt(st.nextToken());
                    set.add(map[i][j]);
                }
            }
            int cnt = 0;

            Iterator<Integer> i = set.iterator();
            while (i.hasNext()) {
                visited = new boolean[N][N];
                int tmp=0;
                int n = i.next();
                for (int x = 0; x < N; x++) {
                    for (int j = 0; j < N; j++) {
                        if (!visited[x][j] && map[x][j] > n) {
                            tmp++;
                            dfs(x, j,n);
                        }
                    }
                }
                cnt = Math.max(cnt, tmp);
            }
            System.out.println(cnt==0?1:cnt);
        }

        private static void dfs(int x, int y,int node) {
            visited[x][y] = true;
            Node n = new Node(x, y);
            for (int i = 0; i < 4; i++) {
                int nX = n.x + X[i];
                int nY = n.y + Y[i];
                if (nX < 0 || nX >= N || nY < 0 || nY >= N) continue;
                if (visited[nX][nY] || map[x][y] <= node) continue;
                dfs(nX, nY,node);
            }
        }

        static class Node {
            int x, y;

            Node(int x, int y) {
                this.x = x;
                this.y = y;
            }
        }

    }
