import java.io.*;
import java.util.*;

public class Main {
    static ArrayList<Integer>[] children;
    static int deleteNode, leafCount = 0;

    public static void main(String[] args) throws IOException {
        int N = read();
        int[] parent = new int[N];
        children = new ArrayList[N];

        // 1. 노드 생성
        for (int i = 0; i < N; i++) {
            children[i] = new ArrayList<>();
        }

        int root = -1;
        // 2. 노드 자식 넣기
        for (int i = 0; i < N; i++) {
            parent[i] = read();
            if (parent[i] == -1) {
                root = i;
            } else {
                children[parent[i]].add(i);
            }
        }

        // 3. 노드 삭제
        deleteNode = read();
        if (deleteNode == root) {
            System.out.println(0);
            return;
        }
        for (int i = 0; i < N; i++) {
            children[i].remove(Integer.valueOf(deleteNode));
        }

        // 4. 리프 노드 카운트
        dfs(root);
        System.out.println(leafCount);
    }

    static void dfs(int node) {
        if (node == deleteNode) return;
        boolean isLeaf = true;
        for (int child : children[node]) {
            if (child != deleteNode) {
                isLeaf = false;
                dfs(child);
            }
        }
        if (isLeaf) leafCount++;
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
