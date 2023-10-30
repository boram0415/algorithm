
import java.io.*;
import java.util.*;

class Node{
    int height,row,column;
    public Node(int height, int row, int column) {
        this.column = column;
        this.row = row;
        this.height = height;
    }
}

class Main{

    static int h ,r,c;
    static int arr[][][];
    static Queue<Node> graph = new LinkedList<>();
    static int[] heightCheck = {1, -1, 0, 0, 0, 0};
    static int[] rowCheck = {0, 0, 1, -1, 0, 0};
    static int[] colCheck = {0, 0, 0, 0, 1, -1};


    public static void main(String args[]) throws Exception{

//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer st = new StringTokenizer(br.readLine());
        c = read(); // col
        r = read(); // row
        h = read(); // height
        arr = new int[h + 1][r + 1][c + 1];

        // 값 초기화
        for (int i=1; i<=h; i++) {
            for (int j = 1; j <= r; j++) {
//                st = new StringTokenizer(br.readLine());
                for (int k = 1; k <= c; k++) {
                    arr[i][j][k] = read();
                    if(arr[i][j][k]==1 ) graph.offer(new Node(i,j,k));
                }
            }
        }

        // 6개 위치에 안익은 토마토 체크
        while (!graph.isEmpty()) {
            Node node = graph.poll();
            for (int i = 0; i < 6; i++) {
                int proxyH = node.height + heightCheck[i];
                int proxyR = node.row + rowCheck[i];
                int proxyC = node.column + colCheck[i];

                // 익지 않은 토마토 일 경우 true
                if (validCheck(proxyH,proxyR,proxyC) ) {

                    graph.offer(new Node(proxyH,proxyR,proxyC));
                    // 안 익은 토마토(0) 익은 토마토로 만들기(1)
                    arr[proxyH][proxyR][proxyC] = arr[node.height][node.row][node.column]+1;
                    // 안 익은 상태에서 익은 상태로 변환 된 토마토 순회하기 위하여 큐에 추가

                }
            }
        } // while end

        int result = Integer.MIN_VALUE;
        for (int i = 1; i <= h; i++) {
            for (int j = 1; j <= r; j++) {
                for (int k = 1; k <= c; k++) {
                    if(arr[i][j][k] == 0) {
                        System.out.println(-1);
                        return;
                    }
                    result = Math.max(result, arr[i][j][k]);
                }
            }
        }

        System.out.println(result == 1 ? 0 : result-1);

    }

    private static boolean validCheck(int height , int row , int col) {
        if(col < 1 || col > c || row < 1 || row > r || height < 1 || height > h) return false;
        return arr[height][row][col] == 0;
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
