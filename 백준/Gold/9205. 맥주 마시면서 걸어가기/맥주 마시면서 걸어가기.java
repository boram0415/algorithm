import java.io.*;
import java.util.*;

public class Main {

    static Queue<Node> q;
    static boolean visited[];
    static boolean flag;
    static Node[] graph;
    static int N;


    public static void main(String args[]) throws Exception {
        StringBuilder sb = new StringBuilder();
        int Testcase = read();

        for (int t = 0; t < Testcase; t++) {

            N = read();
            graph = new Node[N + 2];
            visited = new boolean[N + 2];
            q = new LinkedList<>();
            flag = false;

            for (int i = 0; i < N + 2; i++) graph[i] = new Node(read(), read());

            Node start = graph[0];
            Node end = graph[N + 1];
            q.add(start);

            while (!q.isEmpty()) {
                Node current = q.poll();
                if (current.equals(end)) {
                    flag = true;
                    break;
                }
                for (int i = 1; i < N + 2; i++) {
                    if (!visited[i] && Math.abs(current.x - graph[i].x) + Math.abs(current.y - graph[i].y) <= 1000) {
                        q.add(graph[i]);
                        visited[i] = true;    //왔던 위치 다시 방문 하지 않기 위해서 만들어줌
                    }
                }
            }
            sb.append(flag ? "happy\n" : "sad\n");
        }// for end
        System.out.println(sb);
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
    int x;
    int y;

    Node(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
